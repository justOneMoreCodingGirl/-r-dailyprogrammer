/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lahko7;

/**
 *
 * @author aa
 */
public class Lahko7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String []morsearray={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..","-----",".----","..---","...--","....-",".....","-....","--...","---..","----.",".-.-.-","--..--","..--..",".----.","-.-.--","-..-.","-.--.","-.--.-",".-...","---...","-.-.-.","-...-",".-.-.","-....-","..--.-",".-..-.","...-..-",".--.-.","/"};
        String []alph={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","0","1","2","3","4","5","6","7","8","9",".",",","?","","!","/","(",")","&",":",";","=","+","-","_","","$","@",""};
        String morse=".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.-- ";
        char [] morsechar=morse.toCharArray();
        String translated="";
        System.out.println(morse);
        String temp="";
        for(int i=0;i<morsechar.length;i++){
           
            if(morsechar[i]==' '){
                for(int j=0;j<25;j++){
                    if(temp.equals(morsearray[j]))
                        translated=translated+alph[j];
                    
                }
                temp="";
                
            }
            else if(morsechar[i]=='/'){
                translated=translated+" ";
            }
            else{
                temp=temp+morsechar[i];
               
            }
            
            
        }
        System.out.println(translated);
        
    }
   
}
