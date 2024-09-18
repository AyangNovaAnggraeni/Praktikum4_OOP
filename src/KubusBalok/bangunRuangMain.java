
package KubusBalok;

import KubusBalok.bangunRuang;

public class bangunRuangMain {
   public static void main (String[] args){
        bangunRuang br = new bangunRuang();
    
    System.out.println("Volume kubus : " + br.hitungVolume(3));
     System.out.println("Luas permukaan kubus : " + br.hitungLuasPermukaan(6));
      System.out.println("Volume balok : " + br.hitungVolume(3, 2, 4));
       System.out.println("Luas permukaan balok : " + br.hitungLuasPermukaan(3, 2, 5));
   }
  
}
