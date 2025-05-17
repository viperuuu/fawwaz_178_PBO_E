package com.praktikum.user;
import com.praktikum.action.mahasiswaaction;
import java.util.Scanner;

public class mahasiswa extends user implements mahasiswaaction{
    public mahasiswa(String nama, String nim) {
        super(nama, nim);
    }
    @Override
    public boolean login(){
        return getNama().equals("fawwaz ainun hisyam")&& getNim().equals("202410370110178");
    }
    @Override
    public void display() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu Mahasiswa:");
            System.out.println("1. Laporkan Barang Temuan/Hilang");
            System.out.println("2. Lihat Daftar Laporan");
            System.out.println("0. Logout");
            System.out.print("Pilih menu: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    report();
                    break;
                case 2:
                    viewreport();
                    break;
                case 0:
                    System.out.println("Logout berhasil.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 0);
    }

    @Override
    public void report() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nLaporkan Barang:");
        System.out.print("Nama Barang: ");
        String namaBarang = scanner.nextLine();

        System.out.print("Deskripsi Barang: ");
        String deskripsi = scanner.nextLine();

        System.out.print("Lokasi Terakhir/Ditemukan: ");
        String lokasi = scanner.nextLine();

        System.out.println("\nLaporan berhasil dibuat!");
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Deskripsi: " + deskripsi);
        System.out.println("Lokasi: " + lokasi);
    }

    @Override
    public void viewreport() {
        System.out.println("\n>> Fitur Lihat Laporan Belum Tersedia <<");
    }



}
