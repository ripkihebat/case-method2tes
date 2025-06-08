import java.util.LinkedList;

public class QueueTransaksi {
    private LinkedList<TransaksiLayanan> transaksiList = new LinkedList<>();

    public void enqueue(TransaksiLayanan transaksi) {
        transaksiList.addLast(transaksi);
    }

    public void tampilkanRiwayat() {
        if (transaksiList.isEmpty()) {
            System.out.println(">> Belum ada transaksi yang dicatat.");
        } else {
            System.out.println("-- Riwayat Transaksi --");
            System.out.println("Daftar Transaksi: ");
            for (TransaksiLayanan t : transaksiList) {
                System.out.println(t.getRingkasanTransaksi());
            }
        }
    }
}