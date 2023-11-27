
package main;

import java.util.List;
import model.Cso;
import model.TomorHenger;

public class HengerProgram {
    private Henger[] hengerek;
    public static void main(String[] args) {
        new HengerProgram();
    }

    public HengerProgram(){
        System.out.printf("A hengerek átlag térfogata: %d", atlagTerfogat());
        System.out.printf("A csövek össz súlya: %d", csovekSulya());
        System.out.printf("A hengerek darabszáma: %d", lista());
    }
    
    public double atlagTerfogat(){
        int atlagTerfogat = 0;
        int terfogat = 0;
        int csovekSzama = hengerek.length;
        for (int i = 0; i < csovekSzama; i++) {
            terfogat += csovekSzama[i].getTerfogat();
        }
        atlagTerfogat = terfogat / csovekSzama;
        
        return atlagTerfogat;
    }
    public double csovekSulya(){
        int sulyOssz = 0;
        for (int i = 0; i < hengerek.length; i++) {
            sulyOssz += hengerek[i].getSuly();
        }
        return sulyOssz;
        
    }
    private List lista(){
        
        hengerek = new Henger[5];
        hengerek[0] = new TomorHenger(1, 1);
        hengerek[1] = new TomorHenger(2, 4);
        hengerek[2] = new Cso(2, 4, 3);
        hengerek[3] = new Cso(1, 1, 2);
        hengerek[4] = new Cso(1, 2, 2);
        
        for (Henger hnger : hengerek) {
            System.out.println(hnger);
        }
        
    }
    public void run(){
        
    }
    
}
