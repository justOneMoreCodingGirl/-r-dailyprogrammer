/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lahko6;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author aa
 */
public class Lahko6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BigDecimal kopirano=new BigDecimal("3.141592653589793238462643383279");
        BigDecimal neparni=new BigDecimal("1");
        BigDecimal pi=new BigDecimal("0.0");
        final BigDecimal negativni=new BigDecimal("-4");
        final BigDecimal pozitivni=new BigDecimal("4");
        final BigDecimal dvojka=new BigDecimal("2");
        int skala=30;
        for(int i=1;i<=500000000;i++){
            BigDecimal trenutni=new BigDecimal("0.0");
            if(i%2==0){
                trenutni=negativni.divide(neparni, skala, RoundingMode.HALF_UP);
            }
            else{
                trenutni=pozitivni.divide(neparni, skala, RoundingMode.HALF_UP);
            }
            neparni=neparni.add(dvojka);
            pi=pi.add(trenutni);
        
        }
        System.out.println(pi);
        if(kopirano==pi)
            System.out.println("jes");
    }
   
    
}
