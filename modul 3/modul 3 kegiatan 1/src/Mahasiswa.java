class Mahasiswa extends User {
    public Mahasiswa(String nama, String nim) {
        super(nama, nim); // Memanggil constructor superclass (User)
    }

    // Override method login
    @Override
    public boolean login(String inputNama, String inputNim) {
        return getNama().equals(inputNama) && getNim().equals(inputNim);
    }

    // Override method displayInfo
    @Override
    public void displayInfo() {
        System.out.println("Login Mahasiswa berhasil!\nNama: " + getNama() + "\nNIM: " + getNim());
    }
}
