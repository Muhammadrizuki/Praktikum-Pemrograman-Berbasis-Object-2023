package Praktikum08.no02;

import java.util.Arrays;

public class No2 {
    public static void main(String[] args) throws InterruptedException {
        TypeRacer typeRacer = new TypeRacer();
        typeRacer.setNewWordsToType();
        System.out.println("|| text to Type ||");
        System.out.println("\"" + typeRacer.getWordsToType() + "\"");

        Typer[] typers = new Typer[3];

        typers[0] = new Typer("Ai Hoshino", 80, typeRacer);
        typers[1] = new Typer("Arima Kana", 72, typeRacer);
        typers[2] = new Typer("Akane Kurokawa", 70, typeRacer);

        typeRacer.getRaceContestant().addAll(Arrays.asList(typers));

        typeRacer.startRace();
    }
}
