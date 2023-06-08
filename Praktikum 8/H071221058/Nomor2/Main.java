package Nomor2;

public class Main {
    public static void main(String[] args) {
        String wordsToType = "Halo, selamat datang di Type Racer!";

        TypeRacer typeRacer = new TypeRacer(wordsToType);

        Typer bot1 = new Typer("Bot 1", 100, typeRacer);
        Typer bot2 = new Typer("Bot 2", 70, typeRacer);
        Typer bot3 = new Typer("Bot 3", 80, typeRacer);

        typeRacer.addTyper(bot1);
        typeRacer.addTyper(bot2);
        typeRacer.addTyper(bot3);

        typeRacer.startRace();
    }
}

