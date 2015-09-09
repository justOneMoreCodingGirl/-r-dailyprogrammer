/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lahko11;
import java.util.Scanner;
/**
 *
 * @author aa
 */
public class Lahko11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner (System.in);
        int year=s.nextInt();
        int month=s.nextInt();
        int day=s.nextInt();
        int leap=0;
        int numdays=0;
        
        //ovo dole konta kolko je bilo prstupnih od isusa do danas
        for (int i = 0; i <= year; i++) {
            if((i%4==0)&&(i%100!=0)||(i%400==0))
                leap++;
        }
        int []months={31,28,31,30,31,30,31,31,30,31,30,31};//array svih mjesecova
        
        //sabira sve mjesecove do ovoga
        for (int i = 0; i < month-1; i++) {
            numdays=numdays+months[i];
        }
        int sum=(year)*365+leap+numdays+day;
        
        //konta bil oduzeo dan od ove godine ako je prestupna a februar jos nije proso
        boolean leapyear=false;
        if((year%4==0)&&(year%100!=0)||(year%400==0))
            leapyear=true;
        
        if(leapyear==true&&numdays+day<59)
            sum=sum-1;
            //proverava koji je dan u sedmici
        int k=sum%7;
        switch(k){
            case 1:
                System.out.println("Sat");
                break;
            case 2:
                System.out.println("Sun");
                break;
            case 3:
                System.out.println("Mon");
                break;
            case 4:
                System.out.println("Tue");    
                break;
            case 5:
                System.out.println("Wed");
                break;
            case 6:
                System.out.println("Thu");
                break;
            case 0:
                System.out.println("Fri");
                break;
            default:
                System.out.println("lol");
        }
        
                }
}
