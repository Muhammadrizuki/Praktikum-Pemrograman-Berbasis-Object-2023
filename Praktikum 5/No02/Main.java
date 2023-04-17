package Praktikum05.No02;

public class Main {
    public static void main(String[] args) {
        PengurusInti pengurusInti = new PengurusInti("Rasyad Bimasatya", "Laki-laki", "Jl. H. Kalla Panaikang Indah B20", "Ketua Komunitas Programmer Unhas");
        KoordinatorBidang koordinatorBidang = new KoordinatorBidang("Kunto Aji", "Laki-Laki", "St. Petersburg", "Design");
        Staf staf = new Staf("Ardhito", "Laki-laki", "Jln. Hertasning Makassar", "UI Design");
        
        System.out.println("Pengurus Inti");
        pengurusInti.display();
        System.out.println();
        
        System.out.println("Koordinator Bidang");
        koordinatorBidang.display();
        System.out.println();
        
        System.out.println("Staf");
        staf.display();
    }
}
