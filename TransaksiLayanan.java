import java.util.Scanner;

public class TransaksiLayanan {
    private Pasien pasien;
    private Dokter dokter;
    private int durasiLayanan;
    private int biaya;

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
        return pasien.getNama() + " dilayani oleh " + dokter.getNama() +
               " (" + durasiLayanan + " jam): Rp " + biaya;
    }

    public static TransaksiLayanan prosesTransaksi(Pasien pasien) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pasien " + pasien.getNama() + " dipanggil");
        System.out.print("Masukkan ID Dokter: ");
        String id = input.nextLine();
        System.out.print("Masukkan Nama Dokter: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Durasi Layanan (jam): ");
        int durasi = input.nextInt();
        input.nextLine(); // clear buffer

        Dokter dokter = new Dokter(id, nama);
        TransaksiLayanan transaksi = new TransaksiLayanan(pasien, dokter, durasi);
        System.out.println(">> Pasien telah dilayani, transaksi berhasil dicatat.");
        return transaksi;
    }
}
