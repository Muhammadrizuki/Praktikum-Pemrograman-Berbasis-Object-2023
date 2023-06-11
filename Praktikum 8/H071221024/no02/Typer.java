package Praktikum08.no02;

import java.util.ArrayList;
import java.util.Random;

public class Typer extends Thread {
    private String botName, wordsTyped;
    private double wpm;
    private TypeRacer typeRacer;

    public Typer(String botName, double wpm, TypeRacer typeRacer){
        this.botName = botName;
        this.wpm = wpm;
        this.wordsTyped = "";
        this.typeRacer = typeRacer;
    }

    public void setBotName(String botName) {
        this.botName = botName;
    }
    public void setWpm(double wpm) {
        this.wpm = wpm;
    }
    public void addWordTyped(String newWordsTyped) {
        this.wordsTyped += newWordsTyped + " ";
    }
    public String getWordsTyped() {
        return wordsTyped;
    }
    public String getBotName() {
        return botName;
    }
    public double getWpm() {
        return wpm;
    }
    @Override
    public void run() {
        String[] wordsToType = typeRacer.getWordsToType().split(" ");
        int howLongToType = (int) (60000/wpm);
        for (String word : wordsToType) {
            try {
                Thread.sleep(howLongToType);
                this.addWordTyped(word);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.addWordTyped("(selesai)");
        typeRacer.addResult(this);

    }
}

class TypeRacer {
    private String wordsToType;
    private ArrayList<Typer> raceContestant = new ArrayList<>();
    private ArrayList<Result> raceStanding = new ArrayList<>();

    public String getWordsToType() {
        return wordsToType;
    }
    public ArrayList<Typer> getRaceContestant() {
        return raceContestant;
    }

    private String[] wordsToTypeList = {
        "Kebersamaan adalah fondasi yang kuat dalam membangun hubungan yang langgeng dan bermakna",
    };

    public void setNewWordsToType() {
        Random random = new Random();
        int angkaRandom = random.nextInt(wordsToTypeList.length);
        wordsToType = wordsToTypeList[angkaRandom];
    }

    void addResult(Typer typer) {
        int finish_time = (int) (60000/typer.getWpm())*typer.getWordsTyped().split(" ").length;
        Result res = new Result(typer.getBotName(), finish_time);
        raceStanding.add(res);
    }

    private void printRaceStanding() {
        System.out.println("\nKlasemen Akhir Type Racer");
        System.out.println("=".repeat(15)+"\n");
        for (int i = 0; i < raceStanding.size(); i++){
            double finishTime = (double) (raceStanding.get(i).getFinishTime());
            double outputDetik = Double.valueOf(finishTime)/1000;
            System.out.println(String.format("%d. %s = %.2f detik", (i + 1), raceStanding.get(i).getName(), outputDetik));
        }
    }

    public void startRace() {
        this.setNewWordsToType();
        for (Typer i: raceContestant){
            i.start();
        }
        boolean successAll = false;
        while (true){
            if (successAll){
                break;
            } else {
                if(raceStanding.size()!=raceContestant.size()){
                    try {
                        Thread.sleep(2000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println("\nTyping Progress ...");
                    System.out.println("=".repeat(15)+"\n");
                    for (Typer j:raceContestant){
                        System.out.println(" " + j.getBotName() + " => " + j.getWordsTyped());
                    }
                } else {
                    successAll = true;
                }
            }
        }
        this.printRaceStanding();
    }
}

class Result {
    private String name;
    private int finishTime;

    public Result(String name, int finishTime) {
        this.name = name;
        this.finishTime = finishTime;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getFinishTime() {
        return finishTime;
    }
    public void setFinishTime(int finishTime) {
        this.finishTime = finishTime;
    }
}
