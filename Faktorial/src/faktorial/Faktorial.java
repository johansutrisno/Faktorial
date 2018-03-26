/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faktorial;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Faktorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
        
        System.out.print("Masukan angka: ");
        int x = in.nextInt();
        int start = 2;
        
        for (int i = x; i > 0; i--) {
            for(int j = 0; j < i; j++) System.out.print("0");
            for (int j = 0; j < start; j++) System.out.print("*");
            for (int j = 0; j < i; j++) System.out.print("0");
            System.out.println();
            if (i != 0) start+=2;
        }
        
        for (int i = 0; i < x; i++) {
            for(int j = 0; j < i; j++) System.out.print("0");
            for (int j = 0; j < start; j++) System.out.print("*");
            for (int j = 0; j < i; j++) System.out.print("0");
            System.out.println();
            start-=2;
        }
    }
    
}
