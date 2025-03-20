// Kelas RekeningBank
class RekeningBank {
    String nomorRekening;
    String namaPemilik;
    double saldo;

    // Konstruktor
    RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    // Method untuk menampilkan informasi rekening
    void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp" + saldo);
        System.out.println("----------------------");
    }

    // Method untuk menyetor uang
    void setorUang(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Berhasil setor Rp" + jumlah);
        } else {
            System.out.println("Jumlah setoran harus lebih dari 0!");
        }
        tampilkanInfo();
    }

    // Method untuk menarik uang
    void tarikUang(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Berhasil tarik Rp" + jumlah);
        } else {
            System.out.println("Saldo tidak mencukupi atau jumlah tidak valid!");
        }
        tampilkanInfo();
    }
}

// Kelas Main
public class Main {
    public static void main(String[] args) {
        // Membuat dua objek rekening
        RekeningBank rekening1 = new RekeningBank("2300001", "Andi", 500000);
        RekeningBank rekening2 = new RekeningBank("2300002", "Budi", 300000);

        // Menampilkan informasi awal rekening
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        // Melakukan transaksi pada rekening1
        rekening1.setorUang(200000);
        rekening1.tarikUang(100000);

        // Melakukan transaksi pada rekening2
        rekening2.setorUang(150000);
        rekening2.tarikUang(500000);
    }
}
