//Nicolas Gabrian Sugiarto - 71200533//
package com.uas.prakrplbo;

public abstract class Monster implements MonsterInterface {
    private String nama;

    public Monster(String nama) {
        this.nama = nama;
    }

    public abstract String bersuara();

    public abstract void getInfo();

    public String getNama() {
        return this.nama;
    }
}
