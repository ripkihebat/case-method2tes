public class Main {
    public static void main(String[] args) {
        LinkedListPasien antrian = new LinkedListPasien();
        QueueTransaksi transaksiQueue = new QueueTransaksi();

        int pilihan;
        java.util.Scanner sc = new java.util.Scanner(System.in);

        do {
            System.out.println("=== Menu Klinik ===");
            System.out.println("1. Tambah Antrian Pasien");
            System.out.println("2. Tampilkan Antrian Pasien");
            System.out.println("3. Layani Pasien");
            System.out.println("4. Tampilkan Sisa Antrian");
            System.out.println("5. Tampilkan Transaksi Layanan");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    antrian.tambahPasien();
                    break;
                case 2:
                    antrian.tampilkanAntrian();
                    break;
                case 3:
                    if (!antrian.isEmpty()) {
                        Pasien pasienDilayani = antrian.layaniPasien();
                        TransaksiLayanan transaksi = TransaksiLayanan.prosesTransaksi(pasienDilayani);
                        transaksiQueue.enqueue(transaksi);
                    } else {
                        System.out.println(">> Tidak ada pasien dalam antrian.");
                    }
                    break;
                case 4:
                    System.out.println(">> Sisa antrian: " + antrian.getSisaAntrian());
                    break;
                case 5:
                    transaksiQueue.tampilkanRiwayat();
                    break;
                case 6:
                    System.out.println(">> Terima kasih, program selesai. Semoga Pasien lekas sembuh!");
                    break;
                default:
                    System.out.println(">> Pilihan tidak valid.");
                    
            }
        } while (pilihan != 6);
    }
}
