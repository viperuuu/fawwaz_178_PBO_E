class Hewan {
    String nama;
    String jenis;
    String suara;

    // Konstruktor
    Hewan(String nama, String jenis, String suara) {
        this.nama = nama;
        this.jenis = jenis;
        this.suara = suara;
    }

    // Method untuk menampilkan informasi hewan
    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Suara: " + suara);
        System.out.println("----------------------");
    }
}

// Kelas Main
public class Main {
    public static void main(String[] args) {
        // Membuat objek hewan1 dan hewan2
        Hewan hewan1 = new Hewan("Kucing", "Mamalia", "Nyann~~");
        Hewan hewan2 = new Hewan("Anjing", "Mamalia", "Woof-Woof!!");

        // Memanggil method tampilkanInfo()
        hewan1.tampilkanInfo();
        hewan2.tampilkanInfo();
    }
}