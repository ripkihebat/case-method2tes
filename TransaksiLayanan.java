import java.util.Scanner;

public class TransaksiLayanan {
    Pasien pasien;
    Dokter dokter;
    int durasiLayanan;
    int biaya;

    public TransaksiLayanan(Pasien pasien, Dokter dokter, int durasiLayanan) {
        this.pasien = pasien;
        this.dokter = dokter;
        this.durasiLayanan = durasiLayanan;
        this.biaya = hitungBiaya();
    }

    public int hitungBiaya() {
        return durasiLayanan * 50000;
    }

    public String getRingkasanTransaksi() {
    return pasien.nama + " (" + durasiLayanan + " jam): Rp " + biaya;

    }

    public static TransaksiLayanan prosesTransaksi(Pasien pasien) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pasien " + pasien.nama + " dipanggil");
        System.out.print("Masukkan ID Dokter: ");
        String id = sc.nextLine();
        System.out.print("Masukkan Nama Dokter: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Durasi Layanan (jam): ");
        int durasi = sc.nextInt();
        sc.nextLine(); 

        Dokter dokter = new Dokter(id, nama);
        TransaksiLayanan transaksi = new TransaksiLayanan(pasien, dokter, durasi);
        System.out.println(">> Pasien telah dilayani, transaksi berhasil dicatat.");
        return transaksi;

    }
}
