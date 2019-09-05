/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan.pkgwhile;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class PerulanganWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //membuat variabel dan scanner
        boolean running = true;
        int counter = 0;
        String jawab;
        Scanner scan = new Scanner(System.in);
        
        while( running ) {
            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab [Y/G]> ");
            
            jawab = scan.nextLine();
            
            //cek jawabannya,kalau Y maka berhenti mengulang
            if (jawab.equalsIgnoreCase("Y")){
                running = false;
            }
            counter++;
        }
        System.out.println("Anda sudah melakukan perulangan sebanyak" + counter + "kali");
            }
        }
                
    
    

