import java.util.Scanner;

public class LinkedListPasien {
    private NodePasien head;
    private NodePasien tail;
    private int size;

    public LinkedListPasien() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void tambahPasien() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama pasien: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan NIK pasien: ");
        String nik = sc.nextLine();
        System.out.print("Masukkan keluhan: ");
        String keluhan = sc.nextLine();

        Pasien pasien = new Pasien(nama, nik, keluhan);
        NodePasien baru = new NodePasien(pasien);
        if (head == null) {
            head = tail = baru;
        } else {
            tail.next = baru;
            tail = baru;
        }
        size++;
        System.out.println(">> Pasien berhasil ditambahkan ke antrian.\n");
    }

    public void tampilkanAntrian() {
        if (head == null) {
            System.out.println(">> Tidak ada antrian pasien.");
            return;
        }
        NodePasien bantu = head;
        int no = 1;
        while (bantu != null) {
            System.out.println("Antrian ke-" + no++);
            bantu.data.tampilkanInfo();
            bantu = bantu.next;
        }
    }

    public Pasien layaniPasien() {
        if (head == null) {
            System.out.println(">> Tidak ada pasien untuk dilayani.");
            return null;
        }
        Pasien dilayani = head.data;
        head = head.next;
        if (head == null) tail = null;
        size--;
        return dilayani;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSisaAntrian() {
        return size;
    }
}
