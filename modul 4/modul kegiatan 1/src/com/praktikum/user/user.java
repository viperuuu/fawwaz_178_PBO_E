package com.praktikum.user;

public abstract class user {
    private String nama;
    private String nim;

    public user(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
    public abstract boolean login();
    public abstract void display();

}


