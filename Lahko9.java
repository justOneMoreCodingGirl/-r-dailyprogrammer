/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lahko9;
import java.util.Scanner;
/**
 *
 * @author aa
 */
public class Lahko9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int []b=new int[a];
        for (int i = 0; i < a; i++) {
            b[i]=s.nextInt();
        }
        quickSort(b,b[1], b[b.length-1]);
        for (int i = 0; i < a; i++) {
            System.out.println(b[i]);
            
        }
        
    }
    
     
 
    static void quickSort(int arr[], int left, int right) {
        int topkek;
      int pivot=arr[arr.length/2];
      
      while (left<right){
          while (arr[left]<pivot){
              left=left+1;
          }
          while(arr[right]>pivot){
              right=right-1;
          }
          if (left<=right){
              topkek=left;
              left=right;
              right=topkek;
              left=left+1;
              right=right-1;
          }
      }
      quickSort(arr, arr[1], right);
      quickSort(arr, left, arr[arr.length-1]);
      
    }
}
