//Nicolas Gabrian Sugiarto - 71200533//
package com.uas.prakrplbo;

public class Manticore extends Monster{
    public Manticore(String nama) {
        super(nama);
    }

    public String bergerak() {
        return "Terbang";
    }

    @Override
    public String bersuara(){
        return "Roarroar";
    }

    @Override
    public void getInfo() {
        System.out.println("Nama: " + this.getNama());
        System.out.println("Suara: " + this.bersuara());
        System.out.println("Gerak: " + this.getNama() + " " +this.bergerak() + ". . .");
    }

}
