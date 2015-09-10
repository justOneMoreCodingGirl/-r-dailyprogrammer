/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lahko12;
import java.util.Scanner;

/**
 *
 * @author aa
 */
public class Lahko12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in );
        String in=s.next();
        permutate(in, "");
        
    }
    public static void permutate(String a, String prefix){
        int n=a.length();
        
        if(n==0){
            System.out.println(prefix);
        }
        else{
            for(int i=0;i<n;i++){
                permutate(a.substring(0, i)+a.substring(i+1), prefix+a.charAt(i));
            }
        
        }
        
        
    }
    
}
