/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lahko15;
import java.util.Scanner;
/**
 *
 * @author aa
 */
public class Lahko15 {

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
/*
    public static void main(String[] args) {
    
    Scanner s=new Scanner(System.in);
   
    
    
    String izraz=s.next();        
    char slova []=izraz.toCharArray();
    String iz=s.next(); 
    char izbaciti []=iz.toCharArray();
    
    for(int i=0;i<slova.length;i++){
        for(int j=0;j<izbaciti.length;j++){
        if(slova[i]==izbaciti[j])
        slova[i]=' ';
        }
    }
        for(int l=0;l<slova.length;l++){
            if(slova[l]!=' ')            
        System.out.print(slova[l]);}
    
    
    
    }}
*/
