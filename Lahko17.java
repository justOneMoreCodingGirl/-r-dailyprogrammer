package lahko17;
import java.util.Scanner;

public class Lahko17 {


 public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        int a =s.nextInt();
        char b='@';
        int c=1;
               
        for(int j=0;j<a;j++){//I kvadrant
            for(int i=1;i<=c;i++)
                System.out.print(b);
           System.out.println();
        c++;
        }
                
        
        
        
        for(int k=a;k>0;k--){//drugi kvadrant
            for(int j=a-1;j>0;j--)
                System.out.print(" ");
                for(int i=c;i>0;i--)
                    System.out.print(b);
            a--;
            c++;
            System.out.println();
        }
        
   
        
    for(int o=a;o>0;o--){//treci kvadrant
                for(int i=c-1;i>0;i--)
                System.out.print(" ");
                for(int j=a;j>0;j--)
                    System.out.print(b);
            a--;            
            c++;
            System.out.println();}
        
    

        
        for (int i=a;i>0;i--){//IV kvadrant
            for(int j=a;j>0;j--){
                System.out.print(b);
            
            a--;
            System.out.println();}
    }
    
    }}
