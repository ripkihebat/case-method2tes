public class Pasien {
    String nama;
    String nik;
    String keluhan;

    public Pasien(String nama, String nik, String keluhan) {
        this.nama = nama;
        this.nik = nik;
        this.keluhan = keluhan;
    }

    public void tampilkanInfo() {
        System.out.println("Nama    : " + nama);
        System.out.println("NIK     : " + nik);
        System.out.println("Keluhan : " + keluhan);
        System.out.println("-------------------------");
    }
}