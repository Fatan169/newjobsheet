/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet7;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class Jobsheet7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String identitas = "fatan virgian nova / XRPL2 / 09";
        System.out.println("Identitas : " + identitas);
        
        Scanner baca = new Scanner(System.in);
        System.out.print("nilai a ?");
        int a = baca.nextInt();
        
        System.out.println("/nIF.. 1");
        if(a < 5) System.out.println("nilai a kurang dari 5");
        
        System.out.println("/nIF.. 2");
        if(a == 5)
            System.out.println("nilai a sama dengan 5");
        
        System.out.println("/nIF.. 3");
        if(a > 5) {
            System.out.println("isi variable a : "+ a);
            System.out.println("nilai a lebih dari 5");
        }
        
        System.out.println("/nIF..ELSE..");
        if(a < 5) {
            System.out.println("isi variable a : "+a);
            System.out.println("nilai a kurang dari 5");
        } else System.out.println("nilai a lebih dari atau sama dengan 5");

        System.out.println("/nIF..ELSE IF..ELSE.. 1 ");
        if (a < 5) {
            System.out.println("nilai a kurang dari 5");
        } else if(a == 5) {
            System.out.println("nilai a sama dengan 5");
        } else 
            System.out.println("nilai a lebih dari 5");
        
        System.out.println("/nIF..ELSE IF..ELSE.. 2");
        if (a < 2) {
            System.out.println("nilai a kurang dari 2");
        } else if( a < 4) {
            System.out.println("nilai a kurang dari 4");
        } else if(a < 6) {
            System.out.println("nilai a kurang dari 6");
        } else if(a == 6) {
            System.out.println("nilai a sama dengan 6");
        } else {
            System.out.println("nilai a lebih dari 6");
        }
        
        System.out.println("/nNested IF");
        if(a < 7) { 
            System.out.println("nilai a kurang dari 7");
            if(a > 2)
                System.out.println("nilai a lebih dari 2");
            if(a < 4)
                System.out.println("nilai a lebih dari 4");
        }
        
        System.out.println("/nSwitch..CASE");
        switch(a) {
            case 1: System.out.println("nilai a=> 1"); break;
            case 2: System.out.println("nilai a =>2"); break;
            case 3:
            case 4: System.out.println("nilai a => 3 atau 4");break;
            case 5: System.out.println("nilai a => 5"); break;
            default: System.out.println("nilai a bukan antara 1-5");
        }
        
        int nilai;
        System.out.print("/nNilai anda ? ");
        nilai = baca.nextInt();
        
        String grade = (nilai < 75) ? "belum kompeten" : "kompeten";
        System.out.println(nilai + " => " + grade);
        
        }
    }
    
