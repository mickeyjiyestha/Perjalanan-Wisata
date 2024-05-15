/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectuas;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class BayarWisataBank {
   public static void bayarWisataBank(int tarif) {
        Scanner keyboard = new Scanner(System.in);
        String rekening, pemilik, pin, jenisBank;
        System.out.println("========================================================================================================================");
        System.out.println("                                                   PEMBAYARAN                                                           ");
        System.out.println("========================================================================================================================");
        System.out.println("Jumlah yang harus dibayar      = Rp " + tarif + ",00");
        System.out.print("Masukan jenis bank             = ");
        jenisBank = keyboard.next();
        System.out.print("Masukkan nama pemilik rekening = ");
        pemilik = keyboard.next();
        System.out.print("Masukkan nomor rekening bank   = ");
        rekening = keyboard.next();
        System.out.print("Masukan pin anda               = ");
        pin = keyboard.next();
        System.out.println("Terima kasih telah melakukan pembayaran melalui bank.");
        System.out.println("Nomor rekening                 = " + rekening);
        System.out.println("Nama pemilik rekening          = " + pemilik);
        System.out.println("Jumlah yang dibayarkan         = Rp " + tarif + ",00");
        System.out.println("========================================================================================================================");
    } 
}
