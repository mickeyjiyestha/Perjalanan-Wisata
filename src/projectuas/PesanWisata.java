/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectuas;

/**
 *
 * @author HP
 */
public class PesanWisata {
   public static void pesanWisata(int kodePaket, String rutePerjalanan, int peserta, int tarif) {
        System.out.println("========================================================================================================================");
        System.out.println("                                                    PESANAN ANDA                                                        ");
        System.out.println("========================================================================================================================");
        System.out.println("Kode Paket      = " + kodePaket);
        System.out.println("Rute Perjalanan = " + rutePerjalanan);
        System.out.println("Peserta         = " + peserta);
        System.out.println("Tarif           = Rp " + tarif + ",00");
        System.out.println("========================================================================================================================");
    }
}
