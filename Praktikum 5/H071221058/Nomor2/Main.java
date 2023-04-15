public class Main {
    
    public static void main(String[] args){
        PengurusInti Ketua      = new PengurusInti("Mahendra", "H071221058", 18, "Ketua");
        PengurusInti Sekretaris = new PengurusInti("Ardiansyah", "H071221068", 18,"Sekretaris");
        PengurusInti Bendahara  = new PengurusInti("Alisha", "H071221010", 18, "Bendahara");

        System.out.println("======PENGURUS INTI======");
        System.out.println();
        System.out.println("__ KETUA __");
        Ketua.infoPengurus();
        System.out.println("__ SEKRETARIS __");
        Sekretaris.infoPengurus();
        System.out.println("__ BENDAHARA __");
        Bendahara.infoPengurus();
        System.out.println("=========================\n");   

        Koordinator koordinator1 = new Koordinator("Lisa", "H071221030", 19, "Perlengkapan");
        Koordinator koordinator2 = new Koordinator("Rose", "H071221035", 19, "Danus");
        Koordinator koordinator3 = new Koordinator("Jennie", "H071221033", 20, "Humas");

        System.out.println("=======KOORDINATOR=======");
        System.out.println();
        System.out.println("__ KOORDINATOR 1 __");
        koordinator1.infoKoordinator();
        System.out.println("__ KOORDINATOR 2 __");
        koordinator2.infoKoordinator();
        System.out.println("__KOORDINATOR 3 __");
        koordinator3.infoKoordinator();
        System.out.println("=======================\n");
    }
}
