//Nicolas Gabrian Sugiarto - 71200533//
package com.rplbo.uasprojectpos;

import java.util.ArrayList;
import java.util.HashMap;

public class PointOfSales {
    ArrayList<Barang> arrBarang = new ArrayList<>();

    public PointOfSales(){
    }


    public void inputBarang(Barang barang){
        arrBarang.add(barang);
    }

    public void tampilDaftarBarang(){
        System.out.printf("%-15s %-25s %-5s %-15s\n","Kode Barang","Nama Barang","Stok","Harga");
        for(Barang b : arrBarang){
            System.out.printf("%-15s %-25s %-5d Rp %-15d\n",b.getKode(),b.getNama(),b.getStok(),b.getHarga());
        }
    }

    public void checkout(HashMap<Barang,Integer> keranjang , long pembayaran){
        long total = 0;
        for(Barang b : keranjang.keySet()){
            long harga = b.getHarga();
            int jumlah = keranjang.get(b);
            for(Barang b1 : arrBarang){
                if(b1.getKode().equals(b.getKode())){
                    b1.setStok(b1.getStok() - jumlah);
                }
            }
            total = total + (harga * jumlah);
        }
        long kembalian = pembayaran - total;
        System.out.println("-----Transaksi sukses!-----");
        System.out.println("Total Tagihan: Rp " + total);
        System.out.println("Total Bayar: Rp " + pembayaran);
        System.out.println("Total Kembalian: Rp " + kembalian);
    }

}



