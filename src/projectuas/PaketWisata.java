/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectuas;

/**
 *
 * @author HP
 */
public class PaketWisata {
    private int kodePaket;
    private String rutePerjalanan;
    private int minimumPeserta;
    private int tarif;

    public PaketWisata(int kodePaket, String rutePerjalanan, int minimumPeserta, int tarif) {
        this.kodePaket = kodePaket;
        this.rutePerjalanan = rutePerjalanan;
        this.minimumPeserta = minimumPeserta;
        this.tarif = tarif;
    }
    //enkapsulasi
    public int getKodePaket() {
        return kodePaket;
    }
    //enkapsulasi
    public void setKodePaket(int kodePaket) {
        this.kodePaket = kodePaket;
    }

    public String getRutePerjalanan() {
        return rutePerjalanan;
    }

    public void setRutePerjalanan(String rutePerjalanan) {
        this.rutePerjalanan = rutePerjalanan;
    }

    public int getMinimumPeserta() {
        return minimumPeserta;
    }

    public void setMinimumPeserta(int minimumPeserta) {
        this.minimumPeserta = minimumPeserta;
    }

    public int getTarif() {
        return tarif;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }
    
    
    public String toString() {
        return "Kode Paket : " + kodePaket +
                " || Rute Perjalanan : " + rutePerjalanan +
                " || Minimum Peserta : " + minimumPeserta +
                " || Tarif Per Kepala Rp " + tarif + ",00  ||";
}
}