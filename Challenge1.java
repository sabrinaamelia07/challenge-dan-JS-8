/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge1;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class Challenge1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("===Komisi pada petugas siswa===");
        
        int penjualanbarang;
        double Komisi;
        double Total;
        
        //input Komisi
        Scanner baca = new Scanner(System.in);
        Komisi = baca.nextInt();
        
        if(Komisi <= 20000) {
            System.out.println("Komisi terkecil");
            Komisi = 10000 + (Komisi * 20000);
            System.out.println("Komisi: " + Komisi);
            
            Total = (Komisi * 10/100) + Komisi;
            System.out.println("Total: " + Total);
            
        }else if (Komisi >= 20000) {
            System.out.println("Komisi cukup");
            Komisi = 20000 + (Komisi * 20000);
            System.out.println("Komisi: " + Komisi);
            
            Total = (Komisi * 15/100) + Komisi;
            System.out.println("Total; " + Total);
            
        }else if (Komisi >=50000) {
            System.out.println("Komisi sedang");
            Komisi = 30000 + (Komisi * 50000);
            System.out.println("Komisi: " +Komisi);
            
            Total = (Komisi * 20/100) + Komisi;
            System.out.println("Total: " + Total);
            
        }else if (Komisi >= 100000) {
            System.out.println("Komisi Menengah ke atas");
            Komisi = 50000 + (Komisi * 100000);
            System.out.println("Komisi: " + Komisi);
            
            Total = (Komisi * 30/100) + Komisi;
            System.out.println("Total: " + Total);
            
        }else if (Komisi >= 150000) {
            System.out.println("Komisi atas");
            Komisi = 75000 + (Komisi * 150000);
            System.out.println("Komisi: " + Komisi);
            
            Total = (Komisi * 40/100) + Komisi;
            System.out.println("Total: " + Total);
            
            
        }
        
    }
    
}
