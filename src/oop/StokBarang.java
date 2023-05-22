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
import java.util.HashMap;
import java.util.Map;

public class StokBarang {

    private HashMap<String, ArrayList<Barang>> stok;

    public StokBarang() {
        stok = new HashMap<>();
    }

    // Metode untuk menambah barang ke stok
    public void addBarang(String kategori, String nama, int jumlah) {
        Barang barang = new Barang(kategori, nama, jumlah);

        if (stok.containsKey(kategori)) {
            ArrayList<Barang> barangList = stok.get(kategori);
            barangList.add(barang);
        } else {
            ArrayList<Barang> barangList = new ArrayList<>();
            barangList.add(barang);
            stok.put(kategori, barangList);
        }
    }

    // Metode untuk menghapus barang dari stok
    public void deleteBarang(String nama) {
        for (Map.Entry<String, ArrayList<Barang>> entry : stok.entrySet()) {
            ArrayList<Barang> barangList = entry.getValue();
            for (int i = 0; i < barangList.size(); i++) {
                Barang barang = barangList.get(i);
                if (barang.getNama().equals(nama)) {
                    barangList.remove(i);
                    break;
                }
            }
        }
    }

    // Metode untuk melihat stok barang
    public void viewStok() {
        for (Map.Entry<String, ArrayList<Barang>> entry : stok.entrySet()) {
            String kategori = entry.getKey();
            ArrayList<Barang> barangList = entry.getValue();
            System.out.println("Kategori: " + kategori);
            for (Barang barang : barangList) {
                System.out.println(barang);
            }
            System.out.println();
        }
    }

    // Metode untuk mencari barang berdasarkan nama
    public void searchBarang(String nama) {
        boolean barangDitemukan = false;
        for (Map.Entry<String, ArrayList<Barang>> entry : stok.entrySet()) {
            ArrayList<Barang> barangList = entry.getValue();
            String kategori = entry.getKey();
            System.out.println("Kategori: " + kategori);

            for (Barang barang : barangList) {
                if (barang.getNama().equalsIgnoreCase(nama)) {
                    System.out.println("Barang ditemukan");
                    System.out.println(barang);
                    barangDitemukan = true;
                }
            }
        }
        if (!barangDitemukan) {
            System.out.println("Barang \"" + nama + "\" tidak ditemukan.");
        }
    }

    // Metode untuk melihat barang berdasarkan kategori
    public void viewBarangByKategori(String kategori) {
        if (stok.containsKey(kategori)) {
            ArrayList<Barang> barangList = stok.get(kategori);
            System.out.println("Barang dalam Kategori " + kategori + ":");
            for (Barang barang : barangList) {
                System.out.println(barang.getNama() + " - Jumlah: " + barang.getJumlah());
            }
        } else {
            System.out.println("Kategori " + kategori + " tidak ditemukan.");
        }
    }

    public void viewKategori() {
        if (stok.isEmpty()) {
            System.out.println("Tidak ada kategori yang tersedia.");
        } else {
            System.out.println("Kategori yang tersedia:");
            for (String kategori : stok.keySet()) {
                System.out.println(kategori);
            }
        }
    }

    // Metode untuk mengecek apakah stok kosong
    public boolean isEmpty() {
        return stok.isEmpty();
    }
}
