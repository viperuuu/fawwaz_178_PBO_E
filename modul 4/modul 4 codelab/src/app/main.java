package app;

import perpustakaan.*;

public class main {
    public static void main(String[] args) {
        Buku buku1 = new nonfiksi("Madilog", "Tan Malaka", "Sejarah & Ilmu Pengetahuan");
        Buku buku2 = new fiksi("Hainuwele: Sang Putri Kelapa", "Lilis Hu", "Dongeng");

        buku1.displayInfo();
        buku2.displayInfo();

        Anggota anggota1 = new Anggota("icam gokil", "178");
        Anggota anggota2 = new Anggota("iqrar gokil", "187");

        anggota1.displayInfo();
        anggota2.displayInfo();

        anggota1.pinjamBuku("Madilog");
        anggota2.pinjamBuku("Hainuwele: Sang Putri Kelapa", 7);

        anggota1.kembalikanBuku("Madilog");
        anggota2.kembalikanBuku("Hainuwele: Sang Putri Kelapa");
    }
}