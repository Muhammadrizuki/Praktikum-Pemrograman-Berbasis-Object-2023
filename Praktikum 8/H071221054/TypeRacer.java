import java.util.ArrayList;
import java.util.Random;

public class TypeRacer {
    private String wordsToType;
    private ArrayList<Typer> raceContestant = new ArrayList<>();
    private ArrayList<Result> raceStanding = new ArrayList<>();

    public String getWordsToType() {
        return wordsToType;
    }

    public ArrayList<Typer> getRaceContestant() {
        return raceContestant;
    }

    private String[] wordsToTypeList = { "Cinta Sejati adalah ketika dua jiwa saling melengkapi, memberu dukungan, dan menginspirasi satu sama lain untuk menjadi yang terbaik." };

    public void setNewWordsToType() {
        Random random = new Random();
        int randomNumber = random.nextInt(wordsToTypeList.length);
        wordsToType = wordsToTypeList[randomNumber];
    }

    public void addResult(Typer typer) {
        int timeResult = typer.getWordsTyped().split(" ").length * (int) (60000 / typer.getWpm());
        Result result = new Result(typer.getBotName(), timeResult);
        raceStanding.add(result);
    }

    public void printRaceStanding() {
        System.out.println("\nKlasemen Akhir Type Racer");
        System.out.println("=========================\n");

        for (int i = 0; i < raceStanding.size(); i++) {
            int finishTime = raceStanding.get(i).getFinishTime();
            // Mirip kek: Double finishTimeDouble = new Double(finishTime). Tapi di Java versi 9 sudah dihapuskan
            double finishTimeInSeconds = (double) finishTime / 1000;
            System.out.println(String.format("%d. %s = %.2f detik", i+1, raceStanding.get(i).getName(), finishTimeInSeconds));
        }
    }

    public void startRace() {
        setNewWordsToType();
        System.out.println();

        for (Typer typer : raceContestant) {
            typer.start();
        }

        boolean isAllFinished = false;
        while (true) {
            if (!isAllFinished) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("\n#################################################################################################");
                System.out.println("\nTyping Progress ...");
                System.out.println("================\n");
                for (Typer typer : raceContestant) {
                    System.out.println(String.format("- %s  => %s", typer.getBotName(), typer.getWordsTyped()));
                    System.out.println("====================================================================================================");
                }

                if (raceContestant.size() == raceStanding.size()) {
                    isAllFinished = true;
                }
            } else {
                break;
            }
        }

        printRaceStanding();
    }
}
