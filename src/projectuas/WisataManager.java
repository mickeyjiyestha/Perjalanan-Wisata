package projectuas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import projectuas.PaketWisata;
import projectuas.PaketWisataPandawa;
import projectuas.PaketWisataBatur;
import projectuas.PaketWisataBaliSafari;
import projectuas.PesanWisata;
import projectuas.BayarWisataBank;

public class WisataManager {
    private List<PaketWisata> paketList = new ArrayList<>();

    private void tambahPaket(PaketWisata paket) {
        paketList.add(paket);
    }

    public void run() {
        tambahPaket(new PaketWisataPandawa(1, "Pantai pandawa - Garuda Wisnu Kencana", 8, 150000));
        tambahPaket(new PaketWisataBatur(2, "Tanah Lot - Desa Penglipuran - Danau Batur", 6, 500000));
        tambahPaket(new PaketWisataBaliSafari(3, "Monkey Forest - Pantai Kuta - Bali Safari - Tirta Empul", 4, 1000000));

        Scanner scan = new Scanner(System.in);
        int pilihan;
        do {
            tampilkanDaftarPaket();

            System.out.print("Masukkan Kode Paket: ");
            int kodePaket = scan.nextInt();
            cekKode(kodePaket);

            System.out.print("Masukkan Jumlah Orang: ");
            int peserta = scan.nextInt();
            cekPeserta(peserta, kodePaket);

            PaketWisata paketTerpilih = paketList.get(kodePaket - 1);
            pesanWisata(paketTerpilih, peserta);

            BayarWisataBank.bayarWisataBank(paketTerpilih.getTarif() * peserta);

            System.out.print("Apakah anda ingin memesan paket wisata lainnya? (1 = ya, 0 = tidak): ");
            pilihan = scan.nextInt();
        } while (pilihan == 1);

        scan.close();
    }

    private void tampilkanDaftarPaket() {
        System.out.println("DAFTAR PAKET PERJALANAN");
    for (PaketWisata paket : paketList) {
        System.out.println(paket.toString());
    }
    System.out.println();
    }

    private void cekKode(int kodePaket) {
        if (kodePaket < 1 || kodePaket > paketList.size()) {
            System.out.println("Kode Paket tidak valid");
            System.exit(0);
        }
    }

    private void cekPeserta(int peserta, int kodePaket) {
        if (peserta < paketList.get(kodePaket - 1).getMinimumPeserta()) {
            System.out.println("Jumlah peserta tidak mencukupi untuk paket ini");
            System.exit(0);
        }
    }

    private void pesanWisata(PaketWisata paket, int peserta) {
        PesanWisata.pesanWisata(paket.getKodePaket(), paket.getRutePerjalanan(), peserta, paket.getTarif() * peserta);
    }

    public static void main(String[] args) {
        WisataManager manager = new WisataManager();
        manager.run();
    }
}
