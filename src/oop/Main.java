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
        boolean exit = true;
        while (exit) {
            System.out.println("=== Menu ===");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Hapus Barang");
            System.out.println("3. Melihat Stock Barang");
            System.out.println("4. Mencari Barang");
            System.out.println("5. Melihat Barang Berdasarkan Kategori");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu (1-5): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("\nTAMBAH BARANG");
                    System.out.print("\nKategori : ");
                    String kategori = scanner.nextLine();
                    System.out.print("Nama Barang: ");
                    String nama = scanner.nextLine();
                    System.out.print("Jumlah : ");
                    int jumlah = scanner.nextInt();
                    scanner.nextLine(); // Membersihkan new line

                    stokBarang.addBarang(kategori, nama, jumlah);
                    System.out.println("Barang berhasil ditambahkan ke stok.");

                    break;
                case 2:
                    if (stokBarang.isEmpty()) {
                        System.out.println("Stok kosong. Tidak ada barang yang dapat dihapus.");
                    } else {
                        System.out.print("Masukkan nama barang yang ingin dihapus: ");
                        String namaBarang = scanner.nextLine();
                        stokBarang.deleteBarang(namaBarang);
                        System.out.println("Barang berhasil dihapus dari stok.");
                    }
                    break;

                case 3:
                    if (stokBarang.isEmpty()) {
                        System.out.println("Stok Kosong");
                    } else {
                        System.out.println("Stok Barang:");
                        stokBarang.viewStok();
                    }
                    break;
                case 4:
                    if (stokBarang.isEmpty()) {
                        System.out.println("Stok kosong. Tidak ada barang yang dapat dicari.");
                    } else {
                        boolean barangDitemukan = false;
                        while (!barangDitemukan) {
                            System.out.print("Masukkan nama barang yang ingin dicari: ");
                            String barangDicari = scanner.nextLine();
                            System.out.println("Sedang mencari barang "+barangDicari);
                            stokBarang.searchBarang(barangDicari);
                            if (!barangDicari.equals("Barang tidak ditemukan.")) {
                                barangDitemukan = true;
                            }
                        }
                    }
                    break;
                case 5:
                    if (stokBarang.isEmpty()) {
                        System.out.println("Stok kosong. Tidak ada barang yang dapat dilihat.");
                    } else {
                        stokBarang.viewKategori();
                        System.out.print("Masukkan kategori barang: ");
                        String kategoriBarang = scanner.nextLine();
                        stokBarang.viewBarangByKategori(kategoriBarang);
                    }
                    break;
                case 6:
                    exit = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang sesuai.");
            }

            System.out.println();
        }
    }
}
