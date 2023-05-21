/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author Owen Tan
 */
import java.util.Scanner;

import java.util.Scanner;

public class Main {

    public void main() {
        StokBarang stokBarang = new StokBarang();
        Scanner scanner = new Scanner(System.in);

        boolean lanjut = true;
        while (lanjut) {
            System.out.println("=== Menu ===");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Hapus Barang");
            System.out.println("3. Melihat Stock Barang");
            System.out.println("4. Mencari Barang");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kategori barang: ");
                    String kategori = scanner.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan jumlah barang: ");
                    int jumlah = scanner.nextInt();
                    scanner.nextLine();

                    stokBarang.addBarang(kategori, nama, jumlah);
                    System.out.println("Barang berhasil ditambahkan ke stok.");
                    break;
                case 2:
                    System.out.print("Masukkan nama barang yang ingin dihapus: ");
                    String namaBarang = scanner.nextLine();
                    stokBarang.deleteBarang(namaBarang);
                    System.out.println("Barang berhasil dihapus dari stok.");
                    break;
                case 3:
                    System.out.println("Stok Barang:");
                    stokBarang.viewStok();
                    break;
                case 4:
                    boolean barangDitemukan = false;
                    while (!barangDitemukan) {
                        System.out.print("Masukkan nama barang yang ingin dicari: ");
                        String barangDicari = scanner.nextLine();
                        System.out.println("Pencarian Barang:");
                        stokBarang.searchBarang(barangDicari);
                        if (!barangDicari.equals("Barang tidak ditemukan.")) {
                            barangDitemukan = true;
                        }
                    }
                    break;
                case 5:
                    lanjut = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang sesuai.");
            }

            System.out.println();
        }
    }
}
