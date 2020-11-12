/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10119066.latihan46.tandanyakamu;
import java.util.Scanner;
import java.util.Calendar;

/**
 *
 * @author Neyza-T
 * Nama     : Nezya Tariska
 * Nim      : 10119066
 * Kelas    : IF2
 */
public class PBO210119066Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        yearNow = Calendar.getInstance().get(Calendar.YEAR);
        Age age = new Age(YearNow);
        System.out.print("Masukkan Tahun Lahir Anda : ");
        age.setYearBirth(scanner.nextInt());
        System.out.println(" ");
        System.out.println("=====Hasil Perhitungan Umur=====");
        System.out.println("Tahun lahir anda : " + age.getYearBirth());
        System.out.println("Hari ini tahun : " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah : "+age.hitungUmur()+" tahun");
        System.out.println("Tandanya kamu "+age.tandanyakamu(age.HitungUmur()));
        
    }
    
}
