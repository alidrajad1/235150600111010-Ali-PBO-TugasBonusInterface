public class Resepsionis extends Civitas {
    private int idResepsionis;
    private String jabatan;
    private double gaji;

    public Resepsionis(String nama, int umur, boolean jenisKelamin, int idResepsionis, String jabatan, double gaji) {
        super(nama, umur, jenisKelamin);
        this.idResepsionis = idResepsionis;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    public int getIdResepsionis() {
        return idResepsionis;
    }

    public String getJabatan() {
        return jabatan;
    }

    public double getGaji() {
        return gaji;
    }

    public void melayani() {
        if (isJenisKelamin() == true) {
            System.out.println("Mas " + getNama() + " melayani tamu dari luar");
        } else
            System.out.println("Mbak " + getNama() + " melayani tamu dari luar");
    }

    public void melapor() {
        if (isJenisKelamin() == true) {
            System.out.println("Mas " + getNama() + " melapor ke security");
        } else
            System.out.println("Mbak " + getNama() + " melapor ke security");
    }

    @Override
    public void naikLift() {
        if (isJenisKelamin() == true) {
            System.out.println("Mas " + getNama() + " naik lift ke lantai 5");
        } else
            System.out.println("Mbak " + getNama() + " naik lift ke lantai 5");
    }

}
