/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan46_tandanyakamu;

import java.util.Scanner;

/**
 *
 *  Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan umur dengan
* tanda tanda yang sesuai kententuan dengan inputan dari user
 */
public class PBO3_10117082_Latihan46_TandanyaKamu {

    
  public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static void main(String[] args) {

        Scanner scn1 = new Scanner(System.in);
        Age age = new Age(2018);

        System.out.print("Masukkan Tahun Lahir Anda : ");
        age.setYearBirth(scn1.nextInt());
        System.out.println("\n======Hasil Perhitungan Umur======");
        System.out.println("Tahun lahir Anda : "+age.getYearBirth());
        System.out.println("Hari ini tahun : "+age.getYearNow());
        System.out.println("Umur Kamu sampai hari ini adalah : "+age.hitungUmur()+" tahun");
        System.out.println("Tandanya kamu : "+ANSI_RED+age.tandanyaKamu(age.hitungUmur())+ANSI_RESET);
    }
    
}
