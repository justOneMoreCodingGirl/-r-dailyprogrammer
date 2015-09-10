/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lahko13;
import java.util.Scanner;
/**
 *
 * @author aa
 */
public class Lahko13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        int day, month;
        boolean leap;
        day=s.nextInt();
        month=s.nextInt();
        leap=s.nextBoolean();
        /*while(leap!=0||leap!=1){
            leap=s.nextInt();
        }*/
        int []monthDays={31,28,31,30,31,30,31,31,30,31,30,31};
        if(leap==true){
            monthDays[1]=29;
        }
        int sum=0;
        for (int i = 0; i < month-1; i++) {
            sum=sum+monthDays[i];
        }
        sum=sum+day;
        System.out.println(sum);
        
    }
    
}
