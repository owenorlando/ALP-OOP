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
public class Barang {
    private String kategori;
    private String nama;
    private int jumlah;

    // Buat constructor
    public Barang(String kategori, String nama, int jumlah) {
        this.kategori = kategori;
        this.nama = nama;
        this.jumlah = jumlah;
    }

    // Buat getter dan setter
    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    // Override toString() untuk mencetak informasi barang
    @Override
    public String toString() {
        return "Kategori: " + kategori + ", Nama: " + nama + ", Jumlah: " + jumlah;
    }
}
