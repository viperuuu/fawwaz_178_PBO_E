package com.praktikum.main;

import com.praktikum.user.admin;
import com.praktikum.user.mahasiswa;
import com.praktikum.user.user;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sistem Login");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Pilih role: ");

        int pilihan = scanner.nextInt();
        scanner.nextLine(); // consume newline

        user user = null;

        switch (pilihan) {
            case 1:
                System.out.print("Username: ");
                String username = scanner.nextLine();
                System.out.print("Password: ");
                String password = scanner.nextLine();
                user = new admin("", "", username, password);
                break;
            case 2:
                System.out.print("Nama: ");
                String nama = scanner.nextLine();
                System.out.print("NIM: ");
                String nim = scanner.nextLine();
                user = new mahasiswa(nama, nim);
                break;
            default:
                System.out.println("Pilihan tidak valid");
                System.exit(0);
        }

        if (user.login()) {
            System.out.println("\nLogin berhasil!");
            user.display();
        } else {
            System.out.println("Login gagal! Credential salah.");
        }
    }
}

