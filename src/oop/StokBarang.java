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
import java.util.ArrayList;

public class StokBarang {
    private ArrayList<Barang> stok;

    // Buat constructor
    public StokBarang() {
        stok = new ArrayList<>();
    }

    // Metode untuk menambahkan barang berdasarkan kategori
    public void addBarang(String kategori, String nama, int jumlah) {
        Barang barang = new Barang(kategori, nama, jumlah);
        stok.add(barang);
    }

    // Metode untuk menghapus barang berdasarkan nama
    public void deleteBarang(String nama) {
        for (Barang barang : stok) {
            if (barang.getNama().equals(nama)) {
                stok.remove(barang);
                break;
            }
        }
    }

    // Metode untuk melihat stok barang
    public void viewStok() {
        for (Barang barang : stok) {
            System.out.println(barang);
        }
    }

    // Metode untuk mencari barang berdasarkan nama
    public void searchBarang(String nama) {
        boolean barangDitemukan = false;
        for (Barang barang : stok) {
            if (barang.getNama().equals(nama)) {
                System.out.println(barang);
                barangDitemukan = true;
            }
        }
        if (!barangDitemukan) {
            System.out.println("Barang tidak ditemukan.");
        }
    }
}
