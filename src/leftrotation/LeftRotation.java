/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leftrotation;

import java.util.Scanner;

/**
 *
 * @author yordanosmogos
 */
public class LeftRotation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter the size of the array");
        int n = in.nextInt();
        System.out.print("Enter the number of shifts");

        int k = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter " + n+ " numbers: ");
        for(int a_i=0; a_i < n; a_i++){
            
            a[a_i] = in.nextInt();
        }
        for (int i =0; i< k; i++){
            int temp = a[0];
            for (int j = 0; j<a.length-1; j++){
                
                a[j] = a[j+1];
                //a[a.length-1] = temp;
                
            }
            a[n-1] = temp;
        }
        //System.out.print(a.toString());
        printArr(a);
        int s = 1;
        s = in.nextInt();
        
    }
       
   
    public static void printArr( int [] ar){
        for (int i = 0; i< ar.length; i++){
            System.out.print(ar[i]);
        }
    }
 }
    

