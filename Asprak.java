public class Asprak extends Mahasiswa implements Pengajar {

    public Asprak(String nama, int umur, boolean jenisKelamin, String nim, double ipk, int golUkt) {
        super(nama, umur, jenisKelamin, nim, ipk, golUkt);
    }

    public void ngasihKomen() {
        System.out.println("Kak "+getNama() + " ngasih komen di GCR 'What's good nig*a?'");
    }

    @Override
    public void mengajar(String matkul) {
        System.out.println("Kak "+ getNama()+ " lagi ngajar PBO");
    }

    @Override
    public void mengasihTugas() {
       System.out.println("Kak " + getNama() + " ngasih tugas PBO di GCR");
    }

    @Override
    public void menilaiTugas() {
        System.out.println("Kak " + getNama() + " ngasih nilai Tugas PBO");

    }

    @Override
    public void naikLift() {
        super.naikLift();
    }

}
