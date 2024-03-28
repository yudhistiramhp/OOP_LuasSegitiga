/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Yudhistira
 * TGL: 2024-03-28
 */
public class segitiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader dtIN = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("=========================");
        Double luas;
        int a = 0;
        int t = 0;
        String alas = "";
        String tinggi = "";
        
        System.out.println("Menghitung Luas Segitiga");
        System.out.println("=========================");
        System.out.println("");
        System.out.print("Masukkan nilai alas : ");
        try {
            alas = dtIN.readLine();
            System.out.print("Masukkan nilai tinggi : ");
            tinggi = dtIN.readLine();
        }catch(IOException e){
            System.out.println("Terjadi Kesalahan pada Proses Input Data!");
        }
        a = Integer.parseInt(alas);
        t = Integer.parseInt(tinggi);
        luas = 0.5 * a * t;
        System.out.println("Luas Segitiga adalah : "+ luas + "cm2");
    }
    
}
