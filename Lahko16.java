/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lahko16;
import java.util.Scanner;
/**
 *
 * @author aa
 */
public class Lahko16{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        String start=s.next();
        String remove=s.next();
        StringBuilder result=new StringBuilder();
        for (int i = 0; i < start.length(); i++) {
            
            for (int j = 0; j < remove.length(); j++) {
                if(start.charAt(i)==remove.charAt(j))
                    break;
                else if(j==remove.length()-1)
                    result.append(start.charAt(i));
            }
        }
        System.out.println(result);
    }
    
}
