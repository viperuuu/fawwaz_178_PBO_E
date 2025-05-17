class User {
    private String nama;
    private String nim;

    //constructor
    public User(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // Getter dan Setter untuk enkapsulasi
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

    // Method login (akan di-override)
    public boolean login(String inputNama, String inputNim) {
        return this.nama.equals(inputNama) && this.nim.equals(inputNim);
    }

    // Method displayInfo (akan di-override)
    public void displayInfo() {
        System.out.println("Login berhasil!\nNama: " + nama + "\nNIM: " + nim);
    }
}