public class Dosen extends Civitas implements PesertaKelas, Pengajar {
    private String nip;
    private double gaji;

    public Dosen(String nama, int umur, boolean jenisKelamin, String nip, double gaji) {
        super(nama, umur, jenisKelamin);
        this.nip = nip;
        this.gaji = gaji;
    }

    public String getNip() {
        return nip;
    }

    public double getGaji() {
        return gaji;
    }

    public void ikutPenelitian() {
        if (isJenisKelamin() == true) {
            System.out.println("Pak " + getNama() + " Lagi penelitian di luar kota");

        } else
            System.out.println("Bu " + getNama() + " Lagi penelitian di luar kota");
    }

    @Override
    public void naikLift() {
        if (isJenisKelamin() == true) {
            System.out.println("Pak " + getNama() + " Lagi naik buat lift ke ruang dosen");

        } else
            System.out.println("Bu " + getNama() + " Lagi naik lift buat ke ruang dosen");

    }

    @Override
    public void masukKelas() {
        if (isJenisKelamin() == true) {
            System.out.println("Pak " + getNama() + " Lagi ada di Kelas");

        } else
            System.out.println("Bu " + getNama() + " Lagi ada di kelas");

    }

    @Override
    public void mengajar(String matkul) {
        if (isJenisKelamin() == true) {
            System.out.println("Pak " + getNama() + " Lagi ngajar di Kelas " + matkul);

        } else
            System.out.println("Bu " + getNama() + " Lagi ngajar di kelas" + matkul);

    }

    @Override
    public void mengasihTugas() {
        if (isJenisKelamin() == true) {
            System.out.println("Pak " + getNama() + " ngasih tugas ngebuat artikel");

        } else
            System.out.println("Bu " + getNama() + " ngasih tugas ngebuat artikel");

    }

    @Override
    public void menilaiTugas() {
        if (isJenisKelamin() == true) {
            System.out.println("Pak " + getNama() + " ngasih nilai buat tugas individu");

        } else
            System.out.println("Bu " + getNama() + " ngasih nilai buat tugas individu");
    }

}
