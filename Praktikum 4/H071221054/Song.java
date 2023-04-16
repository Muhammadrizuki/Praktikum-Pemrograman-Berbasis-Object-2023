class Song {
    private String title;
    private String artist;
    private String album;
    private int year;
    private String genre;

    public Song() {

    }

    public Song (String title, String artist, String album, int year, String genre) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.year = year;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void displayInfo() {
        System.out.println("Judul lagu : " + title);
        System.out.println("Nama Artis : " + artist);
        System.out.println("Judul album : " + album);
        System.out.println("Tahun keluaran : " + year);
        System.out.println("Genre lagu : " + genre);
    }
    
}

class Main {
    public static void main(String[] args) {
        Song lagu = new Song();
        lagu.setTitle("Seluruh Nafas ini");
        lagu.setArtist("Last Child ft.Giselle");
        lagu.setAlbum("LAST CHILD V2");
        lagu.setYear(2004);
        lagu.setGenre("Pop");
        lagu.displayInfo();

        System.out.println("================================================================");

        Song lagu2 = new Song("Cinta dalam Hati", "UNGU", "Ungu v1", 2010, "R & B");
        System.out.println("Judul lagu : " + lagu2.getTitle());
        System.out.println("Nama Artis : " + lagu2.getArtist());
        System.out.println("Judul album : " + lagu2.getAlbum());
        System.out.println("Tahun keluaran : " + lagu2.getYear());
        System.out.println("Genre lagu : " + lagu2.getGenre());
        System.out.println("=================================================================");
        SelfUtils.displaySelfData();

    }
}

