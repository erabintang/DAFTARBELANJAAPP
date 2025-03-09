package daftarbelanja;

import java.util.ArrayList;
import java.util.Scanner;

public class DaftarBelanja{
    // Konstanta untuk pajak
    private static final double PAJAK = 0.1;  // 10% Pajak

    public static void main(String[] args) {
        // Deklarasi variabel
        String item;
        double harga;
        double totalHarga = 0;

        // Menggunakan ArrayList untuk menyimpan daftar belanja
        ArrayList<String> daftarItem = new ArrayList<>();
        ArrayList<Double> daftarHarga = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        // Menampilkan pesan awal
        System.out.println("Aplikasi Daftar Belanja");
        System.out.println("Masukkan item belanja (ketik 'selesai' untuk keluar):");

        // Loop untuk memasukkan item dan harga
        while (true) {
            System.out.print("Masukkan nama item: ");
            item = input.nextLine();

            // Menghentikan input jika pengguna mengetik 'selesai'
            if (item.equalsIgnoreCase("selesai")) {
                break;
            }

            System.out.print("Masukkan harga item: ");
            harga = input.nextDouble();
            input.nextLine();  // Konsumsi newline character

            // Menyimpan item dan harga ke dalam array
            daftarItem.add(item);
            daftarHarga.add(harga);
            totalHarga += harga;
        }

        // Menghitung total harga dengan pajak
        double totalPajak = totalHarga * PAJAK;
        double totalBayar = totalHarga + totalPajak;

        // Menampilkan daftar belanja dan total harga
        System.out.println("\nDaftar Belanja Anda:");
        for (int i = 0; i < daftarItem.size(); i++) {
            System.out.println((i + 1) + ". " + daftarItem.get(i) + " - Rp" + daftarHarga.get(i));
        }

        System.out.println("\nTotal Harga: Rp" + totalHarga);
        System.out.println("Pajak (10%): Rp" + totalPajak);
        System.out.println("Total Bayar: Rp" + totalBayar);
    }
}
