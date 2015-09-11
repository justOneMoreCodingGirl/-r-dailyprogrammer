/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lahko14;
import java.util.*;
import java.lang.StringBuilder;

/**
 *
 * @author aa
 */
public class Lahko14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        int k=s.nextInt();
        StringBuilder result=new StringBuilder();
        String [] a=new String[k];
        for (int i = 0; i < k; i++) {
            a[i]=s.next();
        }
        int b=s.nextInt();
        for (int i = 0; i < k; i+=b) {
            List<String> block=Arrays.asList(Arrays.copyOfRange(a, i, Math.min(i+b, k)));
            Collections.reverse(block);
            result.append(block.toString().replaceAll("[\\[\\]]","")).append(", ");
        }
        System.out.println(result.toString().substring(0, result.length()-2));
        
        }
    
    //*************
    //veze nemam sta sam ovdje napiso, ima regexa ima listi ima svega
    //*************
    
    
    }
    /*public static int[] reverse(int [] array, int block){
        
        int temp=0;
        int a=0;
        for (int i = 0; i < array.length; i+=block) {
            a=i+block-1;
            if(a>array.length)
                break;
            for (int j = i; j < i+block/2; j++) {
                
                temp=array[j];
                array[j]=array[a-1];
                array[a-1]=temp;
                
                a--;
                
                }
            }
        
        return array;
    }*/
    
