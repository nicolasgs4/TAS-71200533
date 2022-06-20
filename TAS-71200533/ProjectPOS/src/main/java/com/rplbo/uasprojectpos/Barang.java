//Nicolas Gabrian Sugiarto - 71200533//
package com.rplbo.uasprojectpos;

public class Barang {
    private String kode;
    private int stok;
    static int nextNum=0;
    private String nama;
    private long harga;

    public Barang(String nama, int stok, long harga) {
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
        nextNum++;
        String temp[] = nama.toLowerCase().split(" ");
        if(temp[0].equals("keyboard"))
            this.kode = "KB" + String.format("%03d", nextNum);
        else if(temp[0].equals("mouse"))
            this.kode = "MS" + String.format("%03d", nextNum);
        else if(temp[0].equals("headset"))
            this.kode = "HS" + String.format("%03d", nextNum);
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getKode() {
        return this.kode;
    }

    public String getNama() {
        return this.nama;
    }

    public int getStok() {
        return this.stok;
    }

    public long getHarga() {
        return this.harga;
    }

}



