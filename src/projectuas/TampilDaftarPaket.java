/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectuas;

/**
 *
 * @author HP
 */
public class TampilDaftarPaket {
   public static void tampilkanDaftarPaket(int[] kodePaketArray, String[] rutePerjalananArray,
                                           int[] minimumPesertaArray, int[] tarifArray, int jumlahPaket) {
        System.out.println("                                                                           DAFTAR PAKET PERJALANAN                                                                                                       ");
        // Tampilkan daftar paket dari array yang diberikan
        for (int i = 0; i < jumlahPaket; i++) {
            System.out.println("|| Kode Paket : " + kodePaketArray[i] + " || Rute Perjalanan : " + rutePerjalananArray[i] +
                    " || Minimum Peserta : " + minimumPesertaArray[i] + " || Tarif Per Kepala Rp " + tarifArray[i] + ",00  ||");
        }
        System.out.println("=========================================================================================================================================================================================================");
        System.out.println("\n");
    }
}
