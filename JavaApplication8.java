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
public class JavaApplication8 {

    public static void main(String[] args) {
        Masina[] race = {
            new Masina("Pirma", 200),
            new Masina("Antra", 220),
            new Masina("Trecia", 190),
            new Masina("Ketvirta", 240),
            new Masina("Penkta", 140),
            new Masina("Sesta", 170),
            new Masina("Septinta", 190),
            new Masina("Astunta", 140),
//            new SportineMasina("Sportine Nr. 1", 300),
//            new SportineMasina("Sportine Nr. 1", 300)
            
        };

        boolean arPasiektasSimtas = false;
        int simtukaiCount = 100;
        while (simtukaiCount < 1000) {
            for (int i = 0; i < race.length; i++) {
                if (Math.random() < 0.5) {
                    int padidejimas = (int) (Math.random() * 10) + 1;
                    race[i].gazuok(padidejimas);
                } else if (Math.random() < 0.8) {
                    int paletejimas = (int) (Math.random() * 5) + 1;
                    race[i].gazuok(paletejimas);
                } else {
                    race[i].vaziuok();
                }
            }

            for (int i = 0; i < race.length; i++) {
                for (int j = i + 1; j < race.length; j++) {
                    if (race[i].getKelias() < race[j].getKelias()) {
                        Masina temp = race[i];
                        race[i] = race[j];
                        race[j] = temp;
                    }
                }
            }

            if (race[0].getKelias() > simtukaiCount) {
                String pav = race[0].getPavadinimas();
                System.out.println("Pasiekta " + simtukaiCount + " kilometru riba. Pirmauja automobilis, kurio numeris: " + pav);
                System.out.println("Tarpiniai rezultatai:");
                for (int k = 0; k < race.length; k++) {
                    System.out.println(race[k].getPavadinimas() + " masina nuvaziavo: " + race[k].getKelias());
                }
                simtukaiCount += 100;
            }
        }
    }
}
