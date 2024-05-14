
public abstract class Civitas {
    private String nama;
    private int umur;
    private boolean jenisKelamin;

    public Civitas(String nama, int umur, boolean jenisKelamin) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public void makanDiKantin(String Kantin) {
        System.out.println(getNama() + " lagi makan di kantin" + Kantin);
    }

    public void mainGameCorner() {
        System.out.println(getNama() + " lagi main game di GaCor");
    }

    public abstract void naikLift();

}