package Nomor1;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DataLoader {
    private int numOfSources;
    private int numOfDataLoaded;
    private int numOfDataFailed;
    private boolean allDataLoaded;
    private final TaskTimeHelper taskTimeHelper;

    public DataLoader(int numOfSources) {
        this.numOfSources = numOfSources;
        this.taskTimeHelper = new TaskTimeHelper();
    }

    public void loadData() {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= numOfSources; i++) {
            int source = i;
            executor.execute(() -> {
                int taskTime = taskTimeHelper.getRandomTime();
                try {
                    Thread.sleep(taskTime * 1000L);
                    System.out.println("Data source " + source + " loaded in " + taskTime + "s");
                    numOfDataLoaded++;
                } catch (InterruptedException e) {
                    System.out.println("Data source " + source + " failed to load");
                    numOfDataFailed++;
                }
            });
        }
        executor.shutdown();
        try {
            executor.awaitTermination(6, TimeUnit.SECONDS);
            allDataLoaded = true;
        } catch (InterruptedException e) {
            System.out.println("Request Timeout");
        }
    }

    public void displayResult() {
        System.out.println("Task Finish.");
        int totalTime = taskTimeHelper.getTotalTime(numOfDataLoaded);
        if (allDataLoaded) {
            System.out.println("All data is successfully loaded");
        } else {
            System.out.println("Loading... (" + totalTime + "s)");
        }
        System.out.println("Time Execution: " + totalTime + "s");
        System.out.println(numOfDataLoaded + " Data Successfully loaded & " + numOfDataFailed + " Data failed to load");
    }

    public static void main(String[] args) {
        DataLoader dataLoader = new DataLoader(4);
        System.out.println("Start load " + dataLoader.numOfSources + " Data");
        dataLoader.loadData();
        dataLoader.displayResult();
    }
}

class TaskTimeHelper {
    public int getRandomTime() {
        return (int) (Math.random() * 6) + 1;
    }

    public int getTotalTime(int numOfDataLoaded) {
        return numOfDataLoaded * 5;
    }

    public int getTaskExecutionTime() {
        return 0;
    }
}
