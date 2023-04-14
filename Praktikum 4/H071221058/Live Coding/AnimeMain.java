package TUGAS.Pertemuan4;

public class AnimeMain {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.setTitle("Boruto : Naruto Next Generations");
        anime.setEpisodeCount(293);
        anime.setGenre("Comedy,Action");
        anime.setStudio("TV Tokyo");
        anime.setSynopsis("Mengawali kisah setelah Perang Dunia Shinobi keempat yang dinyatakan telah berakhir dan sukses.");        
        System.out.println();
        anime.displayInfo();
        System.out.println();

        Anime anime2 = new Anime("Haikyuu!! Fly High!! VolleyBall!!", 25, "Comedy,Sport", "Shueisha", "Seorang siswa SMA bernama Shōyō Hinata, menjadi terobsesi dengan bola voli setelah menyaksikan SMA Karasuno");
        System.out.println("__ ANIME 2 __");
        anime2.getTitle();
        System.out.println("1. Title    : " + anime2.getTitle());
        anime2.getEpisodeCount();
        System.out.println("2. Episode  : " + anime2.getEpisodeCount());
        anime2.getGenre();
        System.out.println("3. Genre    : " + anime2.getGenre());
        anime2.getStudio();
        System.out.println("4. Studio   : " + anime2.getStudio());
        anime2.getSynopsis();
        System.out.println("5. Synopsis : " + anime2.getSynopsis());
        System.out.println();

        SelfUtils.displaySelfData();

    }
}
