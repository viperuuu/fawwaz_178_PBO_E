package com.praktikum.user;
import com.praktikum.action.adminaction;
import java.util.Scanner;

public class admin extends user implements adminaction {
    private String username;
    private String password;

    public admin(String nama, String nim, String username, String password) {
        super(nama, nim);
        this.username = username;
        this.password = password;
    }
    @Override
    public boolean login(){
        return username.equals("admin178")&& password.equals("password178");
    }
    @Override
    public void display() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu Admin:");
            System.out.println("1. Kelola Laporan Barang");
            System.out.println("2. Kelola Data Mahasiswa");
            System.out.println("0. Logout");
            System.out.print("Pilih menu: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    manageitem();
                    break;
                case 2:
                    manageuser();
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
    public void manageitem() {
        System.out.println("\n>> Fitur Kelola Barang Belum Tersedia <<");
    }

    @Override
    public void manageuser() {
        System.out.println("\n>> Fitur Kelola Mahasiswa Belum Tersedia <<");
    }

}
