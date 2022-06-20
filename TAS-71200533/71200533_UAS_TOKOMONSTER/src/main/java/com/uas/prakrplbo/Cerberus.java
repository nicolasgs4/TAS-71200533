//Nicolas Gabrian Sugiarto - 71200533//
package com.uas.prakrplbo;

public class Cerberus extends Monster{
    public Cerberus(String nama){
        super(nama);
    }

    public String bergerak() {
        return "Berlari";
    }

    @Override
    public String bersuara(){
        return "Rawrrawr";
    }

    @Override
    public void getInfo() {
        System.out.println("Nama: " + this.getNama());
        System.out.println("Suara: " + this.bersuara());
        System.out.println("Gerak: " + this.getNama() + " " +this.bergerak() + ". . .");
    }

}
