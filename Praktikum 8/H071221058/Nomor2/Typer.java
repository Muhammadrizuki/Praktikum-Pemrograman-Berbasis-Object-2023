package Nomor2;

public class Typer extends Thread {
    private String botName;
    private String wordsTyped;
    private double wpm;
    private TypeRacer typeRacer;

    public Typer(String botName, double wpm, TypeRacer typeRacer) {
        this.botName = botName;
        this.wpm = wpm;
        this.wordsTyped = "";
        this.typeRacer = typeRacer;
    }

    public String getBotName() {
        return botName;
    }

    public void setBotName(String botName) {
        this.botName = botName;
    }

    public String getWordsTyped() {
        return wordsTyped;
    }

    public void setWordsTyped(String wordsTyped) {
        this.wordsTyped = wordsTyped;
    }

    public double getWpm() {
        return wpm;
    }

    public void setWpm(double wpm) {
        this.wpm = wpm;
    }

    @Override
    public void run() {
        String[] wordsToType = typeRacer.getWordsToType().split(" ");

        double howLongToType = 60000 / wpm;

        for (String word : wordsToType) {
            this.addWordToTyped(word);
            try {
                Thread.sleep((long) howLongToType);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.addWordToTyped("(selesai)");
        typeRacer.addResult(new Result(botName, wordsToType.length));
    }

    public void addWordToTyped(String word) {
        wordsTyped += word + " ";
    }
}
