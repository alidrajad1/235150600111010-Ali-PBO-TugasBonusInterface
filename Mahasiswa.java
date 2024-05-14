public class Mahasiswa extends Civitas implements PesertaKelas {
    private String nim;
    private double ipk;
    private int golUkt;
    
    public Mahasiswa(String nama, int umur, boolean jenisKelamin, String nim, double ipk, int golUkt) {
        super(nama, umur, jenisKelamin);
        this.nim = nim;
        this.ipk = ipk;
        this.golUkt = golUkt;
    }

    public String getNim() {
        return nim;
    }
    public double getIpk() {
        return ipk;
    }

    public int getGolUkt() {
        return golUkt;
    }
    
    @Override
    public void masukKelas() {
        System.out.println(getNama() + " masuk kelas buat belajar");
    }
    
    public void naikLift() {
        System.out.println(getNama() + " naik lift di gedung F");
    }

    public void ngerjainTugas() {
        System.out.println(getNama() + " Lagi ngerjain tugas PBO");
    }

    public void pasrah() {
        System.out.println(getNama() + " pasrah mengahadapi PBO");
    }

    public void mengikutiOrganisasi() {
        System.out.println(getNama() + " join organisai BCC");
    }

    public void presentasi() {
        System.out.println(getNama() + " lagi prsentasi tugas PBO");
    }
    
}
