/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet8;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class tugastambahan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //deklarasi
        
        int KWH;
        double total;
        int biaya;
        
        //scanner
        Scanner baca = new Scanner(System.in);
        
        //input
        System.out.println("penugasan pembayaran tagihan listrik");
        System.out.println("silahkan masukkan pengunaan listrik anda");
        KWH = baca.nextInt();
        
        //golongan A/B/C
        System.out.println("/n~golongan~");
        if(KWH <=450) {
            System.out.println("Selamat anda masuk golongan C(Anak Hemat)");
            biaya = 20000 + (1000 * KWH);
            System.out.println("Biaya " + "Rp." + biaya);
            System.out.println("/n~Biaya total~");
            total = Double.valueOf(biaya + (biaya * 10/100));
            System.out.println("Biaya total: " + total);
            
        } else if(KWH<=900) {
            System.out.println("Selamat anda masuk golongan B(Uang jajan ngepas)");
            biaya = 35000 + (2500 * KWH);
            System.out.println("Biaya " + "Rp." + biaya);
            System.out.println("/n~Biaya total~");
            total = Double.valueOf(biaya + (biaya * 15/100));
            System.out.println("Biaya total: " + total);
            
        } else if(KWH<1200) {
            System.out.println("Selamat anda masuk golongan A(Pro player tabungan)");
            biaya = 50000 + (3000 * KWH);
            System.out.println("Biaya " + "Rp." + biaya);
            System.out.println("/n~Biaya total~");
            total = Double.valueOf(biaya + (biaya * 20/100));
            System.out.println("Biaya total: " + total);
        
                
        
    }
    
    }
}

