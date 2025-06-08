public class Pasien {
    private String nama;
    private String nik;
    private String keluhan;

    public Pasien(String nama, String nik, String keluhan) {
        this.nama = nama;
        this.nik = nik;
        this.keluhan = keluhan;
    }

    public String getNama() {
        return nama;
    }

    public String getNik() {
        return nik;
    }

    public String getKeluhan() {
        return keluhan;
    }

    public void tampilkanInfo() {
        System.out.println("Nama    : " + nama);
        System.out.println("NIK     : " + nik);
        System.out.println("Keluhan : " + keluhan);
        System.out.println("-------------------------");
    }
}