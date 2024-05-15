/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectuas;

/**
 *
 * @author HP
 */
public class PaketWisataPandawa extends PaketWisata {
    public PaketWisataPandawa(int kodePaket, String rutePerjalanan, int minimumPeserta, int tarif) {
        super(kodePaket, rutePerjalanan, minimumPeserta, tarif);
    }
    @Override
    public String toString() {
        return "Paket Pandawa - " + super.toString();
    }
}
