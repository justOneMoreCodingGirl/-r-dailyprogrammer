/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lahko8;

/**
 *
 * @author aa
 */
public class Lahko8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String song=new String();
        for (int i = 99; i > 0; i--) {
            song=song+i+" bottles of beer on the wall \n";
            song=song+i+" bottles of beer on the wall \n";
            song =song+"take one down now theres "+(i-1)+" left \n";
        }
        System.out.println(song);
    }
    
}
