/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

import java.util.Scanner;

/**
 *
 * @author MyBook Hype AMD
 */
public class pertemuan401 {
    public static void main(String[] args) {
        String[][] Meja = new String[3][3];
        Scanner inp = new Scanner(System.in);
        
        for(int baris=0; baris<3; baris++){
           for(int klm=0; klm<3; klm++){
               System.out.printf("Data Meja Baris: %d, Kolom: %d: ",baris,klm);
               Meja[baris][klm] = inp.nextLine();
           }
        }

          for(int baris=0; baris<3; baris++){
           for(int klm=0; klm<3; klm++){
               System.out.printf("Data Meja Baris: "+Meja[baris][klm]);
               System.out.println("");
           }
        }
    }
}
    

