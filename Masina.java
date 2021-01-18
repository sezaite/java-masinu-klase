/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author pavet
 */
public class Masina {

    private String pavadinimas;
    private int maxGreitis;
    private int greitis;
    private int kelias;

    public Masina(String pav, int maxGreitis) {
        this.pavadinimas = pav;
        this.maxGreitis = maxGreitis;
        this.kelias = 0;
        this.greitis = 0;
    }

    public void gazuok(int kiek) {
        this.greitis += kiek;
        if (this.greitis > this.maxGreitis) {
            this.greitis = this.maxGreitis;
        }
        this.kelias += this.greitis;
    }

    public void stabdyk(int kiek) {
        if (this.greitis - kiek < 0) {
            this.greitis = 0;
        }
        this.greitis -= kiek;
        this.kelias += greitis;
    }

    public void vaziuok() {
        this.kelias += this.greitis;
    }

    public int getKelias(){
        return this.kelias;
    }
    
    public String getPavadinimas(){
        return this.pavadinimas;
    }
    /*void gazuok(int kiek)
    void stabdyk(int kiek)
    void vaziuok(int kiek)(padideja per tiek, koks yra masinos greitis)
     */
}
