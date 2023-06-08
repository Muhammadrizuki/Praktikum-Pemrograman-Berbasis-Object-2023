package Nomor1;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadLoadApp {
    private static final int NUM_THREADS = 3;
    private static final int NUM_DATA = 4;

    private static int dataLoaded = 0;
    private static int dataFailed = 0;

    public static void main(String[] args) {
        System.out.println("Start load " + NUM_DATA + " Data.");
        ExecutorService executorService = Executors.newFixedThreadPool(NUM_THREADS);
        for (int i = 0; i < NUM_DATA; i++) {
            executorService.execute(new DataLoadTask());
        }
        executorService.shutdown();
        try {
            while (!executorService.awaitTermination(1, TimeUnit.SECONDS)) {
                System.out.println("Loading... (" + TaskTimeHelper.getRandomTime() + "s)");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        String resultMessage;
        if (dataFailed == 0) {
            resultMessage = "All data is successfully loaded";
        } else {
            resultMessage = dataLoaded + " Data Successfully loaded & " + dataFailed + " Data failed to load";
        }
        System.out.println("\nTask Finish.\nTime Execution : " + TaskTimeHelper.getTotalTime() + "s");
        System.out.println(resultMessage);
    }

    private static class DataLoadTask implements Runnable {
        @Override
        public void run() {
            int taskTime = TaskTimeHelper.getRandomTime();
            try {
                Thread.sleep(taskTime * 1000L);
                synchronized (ThreadLoadApp.class) {
                    dataLoaded++;
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            if (taskTime > 4) {
                synchronized (ThreadLoadApp.class) {
                    dataFailed++;
                }
                System.out.println("Request Timeout");
            }
        }
    }

    private static class TaskTimeHelper {
        private static final Random random = new Random();
        private static int totalTime = 0;

        public static int getRandomTime() {
            int taskTime = random.nextInt(6) + 1;
            totalTime += taskTime;
            return taskTime;
        }

        public static int getTotalTime() {
            return totalTime;
        }
    }
}
