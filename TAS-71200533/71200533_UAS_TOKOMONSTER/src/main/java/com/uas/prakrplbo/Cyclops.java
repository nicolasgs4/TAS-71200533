//Nicolas Gabrian Sugiarto - 71200533//
package com.uas.prakrplbo;

public class Cyclops extends Monster{
    public Cyclops(String nama){
        super(nama);
    }

    public String bersuara(){
        return "Hohohoho";
    }

    public String bergerak() {
        return "Berjalan";
    }

    public void getInfo() {
        System.out.println("Nama: " + this.getNama());
        System.out.println("Suara: " + this.bersuara());
        System.out.println("Gerak: " + this.getNama() + " " +this.bergerak() + ". . .");
    }
}
