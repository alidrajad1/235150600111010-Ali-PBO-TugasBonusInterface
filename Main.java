public class Main {
    public static void main(String[] args) {
        // Membuat instance dari masing-masing kelas konkret
        Dosen dosen = new Dosen("Jum'at", 1500, true, "675430982", 100000000);
        Mahasiswa mahasiswa = new Mahasiswa("Trailblazer", 3, true, "23515060011101", 3.5, 1);
        Resepsionis resepsionis = new Resepsionis("Katheryne", 30, false, 112233, "Front Desk", 5000000);
        Asprak asprak = new Asprak("Carl Johnson", 22, true, "556677", 3.8, 2);

        // Upcasting
        Civitas civitasDosen = dosen;
        Civitas civitasMahasiswa = mahasiswa;
        Civitas civitasResepsionis = resepsionis;
        Civitas civitasAsprak = asprak;

        PesertaKelas pesertaKelasDosen = dosen;
        PesertaKelas pesertaKelasMahasiswa = mahasiswa;

        Pengajar pengajarDosen = dosen;
        Pengajar pengajarAsprak = asprak;

        // Memanggil method dari instance asli
        dosen.ikutPenelitian();
        mahasiswa.ngerjainTugas();
        resepsionis.melayani();
        asprak.ngasihKomen();

        // Memanggil method dari instance yang di-upcast
        civitasDosen.naikLift();
        civitasMahasiswa.naikLift();
        civitasResepsionis.naikLift();
        civitasAsprak.naikLift();

        pesertaKelasDosen.masukKelas();
        pesertaKelasMahasiswa.masukKelas();

        pengajarDosen.mengajar("PBO");
        pengajarAsprak.mengajar("PBO");

        // Contoh tambahan method yang ada di superclass
        civitasDosen.makanDiKantin("Kantin 1");
        civitasMahasiswa.mainGameCorner();
    }
}
