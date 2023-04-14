package TUGAS.Pertemuan4;

public class Anime {
    String title;
    int episodeCount;
    String genre;
    String studio;
    String synopsis;

    public Anime() {
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setEpisodeCount(int episodeCount) {
        this.episodeCount = episodeCount;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    void displayInfo() {
        System.out.println("__ ANIME 1 __");
        System.out.println("1. Title    : " + this.title);
        System.out.println("2. Episode  : " + this.episodeCount);
        System.out.println("3. Genre    : " + this.genre);
        System.out.println("4. Studio   : " + this.studio);
        System.out.println("5. Synopsis : " + this.synopsis );
    }

    public Anime( String title, int episodeCount, String genre, String studio, String synopsis ) {
        this.title = title;
        this.episodeCount = episodeCount;
        this.genre = genre;
        this.studio = studio;
        this.synopsis = synopsis;
    }

    String getTitle() {
        return title;
    }
    int getEpisodeCount() {
        return episodeCount;
    }
    String getGenre() {
        return genre;
    }
    String getStudio() {
        return studio;
    }
    String getSynopsis() {
        return synopsis;
    }

}
