package Praktikum08.no01;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LoadDataApp {
    private static int dataLoadedCount = 0;
    private static int dataFailedCount = 0;
    private static boolean isSuccess;
    private static long startTime;
    private static int data = 4;
    private static long time;

    public static void main(String[] args) {
        int backgroundThreads = 3;
        int uiThreads = 1;
        ExecutorService executorForBackgroundThread = Executors.newFixedThreadPool(backgroundThreads);
        ExecutorService executorForUIThread = Executors.newFixedThreadPool(uiThreads);

        startTime = System.currentTimeMillis();

        System.out.println("Start load " + data + " Data" );

        executorForUIThread.execute(new Runnable() {
            public void run() {
                while (true){
                    time = (System.currentTimeMillis() - startTime) / 1000;
                    if (time > 0){
                        if (dataLoadedCount + dataFailedCount != data){
                            System.out.println("Loading... (" + time + "s)");
                        } else if (dataLoadedCount + dataFailedCount == data){
                            System.out.println("Loading... (" + time + "s)");
                            break;
                        }
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (dataLoadedCount + dataFailedCount == data) {
                    if (dataFailedCount > 0){
                        System.out.println();
                        System.out.println("Task Finish.");
                        System.out.println("Time Execution : " + time + "s");
                        System.out.println(dataLoadedCount + " Data Succesfully loaded & " + dataFailedCount + " Data failed to load");
                    } else {
                        System.out.println();
                        System.out.println("Task Finish.");
                        System.out.println("Time Execution : " + time + "s");
                        System.out.println("All data is successfully loaded");
                    }
                }
            }
        });
        for (int i = 0; i < data; i++){
            executorForBackgroundThread.execute(new Runnable() {
                public void run() {
                    int executionTime = TaskTimeHelper.getRandomExecutionTime();
                    try {
                        if (executionTime > 4){
                            Thread.sleep(5100);
                            System.out.println("Request Timeout");
                            isSuccess = false;
                        } else {
                            Thread.sleep(executionTime * 1000);
                            isSuccess = true;
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (isSuccess) {
                        synchronized (LoadDataApp.class){
                            dataLoadedCount++;  
                        }
                    } else {
                        synchronized (LoadDataApp.class){
                            dataFailedCount++;  
                        }
                    }
                }
            });
        }
        executorForBackgroundThread.shutdown();
        executorForUIThread.shutdown();
    }
}

class TaskTimeHelper {
    private static final int minExTime = 1;
    private static final int maxExTime = 6;
    private static final Random random = new Random();

    public static int getRandomExecutionTime() {
        return random.nextInt(maxExTime - minExTime + 1) + minExTime;
    }
}