//Nicolas Gabrian Sugiarto - 71200533//
package com.uas.prakrplbo;

public class Evolusi extends Monster{

    private Monster mon1;
    private Monster mon2;

    public Evolusi(Monster mon1 , Monster mon2) {
        super(mon1.getNama() + " " + mon2.getNama());
        this.mon1 = mon1;
        this.mon2 = mon2;
    }

    @Override
    public String bergerak() {
        return mon2.bergerak();
    }


    @Override
    public String bersuara() {
        String name1 = mon1.bersuara();
        String name2 = mon2.bersuara();
        String mergeName = "";
        for(int i=0 ; i<8 ; i++){
            if(i%2==0)
                mergeName += name2.charAt(i);
            else
                mergeName += name1.charAt(i);
        }
        return mergeName;
    }

    @Override
    public void getInfo() {
        System.out.println("Nama: " + this.getNama());
        System.out.println("Suara: " + this.bersuara());
        System.out.println("Gerak: " + this.getNama() + " " +this.bergerak() + ". . .");
    }

}
