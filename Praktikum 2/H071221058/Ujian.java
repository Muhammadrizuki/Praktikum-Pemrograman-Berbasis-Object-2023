class Ujian {

    String mahasiswa1, mahasiswa2, mahasiswa3 , mahasiswa4, nim1, nim2, nim3, nim4;
    int nilaimhs2, nilaimhs4, nilaiRatarata, nilaimhs1, nilaimhs3;

    void ardi       (String ardi)          {
        mahasiswa1  = ardi;
    } 
    void nilaiArdi  (int nilaiArdi)        {
        nilaimhs1   = nilaiArdi;
    }
    void nimArdi    (String nimArdi)       {
        nim1        = nimArdi;
    }
    
    void detailUjian()              {
        System.out.println("{ H A S I L  N I L A I  U J I A N  M A T D A S  1 }");
        System.out.println("Mahasiswa Atas Nama     : " + mahasiswa1 );
        System.out.println("Dengan NIM              : " + nim1 );
        System.out.println("Mendapatkan Nilai       : " + nilaimhs1);
        
    }
    public void person() {
    }
}
