package Nomor2;

import java.util.ArrayList;
import java.util.List;

public class TypeRacer {
    private String wordsToType;
    private List<Typer> typerList;
    private List<Result> typeRaceTable;

    public TypeRacer(String wordsToType) {
        this.wordsToType = wordsToType;
        this.typerList = new ArrayList<>();
        this.typeRaceTable = new ArrayList<>();
    }

    public String getWordsToType() {
        return wordsToType;
    }

    public void setWordsToType(String wordsToType) {
        this.wordsToType = wordsToType;
    }

    public void addTyper(Typer typer) {
        typerList.add(typer);
    }

    public List<Result> getTypeRaceTable() {
        return typeRaceTable;
    }

    public void addResult(Result result) {
        typeRaceTable.add(result);
    }

    public void startRace() {
        for (Typer typer : typerList) {
            typer.start();
        }

        for (Typer typer : typerList) {
            try {
                typer.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Hasil Type Racer:");
        for (Result result : typeRaceTable) {
            System.out.println(result.getName() + " - " + result.getFinishTime());
        }
    }
}
