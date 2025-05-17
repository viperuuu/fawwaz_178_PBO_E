class Admin extends User {
    private String username;
    private String password;

    public Admin(String nama, String nim, String username, String password) {
        super(nama, nim); // Memanggil constructor superclass (User)
        this.username = username;
        this.password = password;
    }

    // Override method login
    @Override
    public boolean login(String inputUsername, String inputPassword) {
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }

    // Override method displayInfo
    @Override
    public void displayInfo() {
        System.out.println("Login Admin berhasil!\nNama: " + getNama() + "\nNIM: " + getNim());
    }
}