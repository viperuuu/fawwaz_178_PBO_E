class manusia
{
    // konstruktor tidak punya parameter
    String nama;
    int umur;
    String alamat;

    public manusia(String nama, int nim, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;

    }
    class mahasiswa extends manusia
    {
        public mahasiswa(String nama, int umur, String alamat) {
            super(nama, umur, alamat);
            int nim;

            System.out.println(this.umur);
        }
        public void cetak()
        {
            System.out.println(this.nama+" "+this.umur+" "+this.alamat);
            System.out.println();
        }
    }

    public manusia()
    {
        System.out.println("saya adalah seorang manusia");
    }
}


public class demoManusia {
    //pembentukan objek
    public static void main(String[] args) {
        manusia obj = new manusia("fawwaz", 178, "malang");
    }

}