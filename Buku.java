public class Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private int jumlahHalaman;

    //menginisialisasi atribut
    public Buku(String judul, String penulis, int tahunTerbit, int jumlahHalaman) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.jumlahHalaman = jumlahHalaman;
    }

    //menambahkan nilai tambahan halaman pada jumlah halaman buku
    public void tambahHalaman(int tambahanHalaman) {
        jumlahHalaman += tambahanHalaman;
    }

    //menampilkan informasi lengkap tentang buku
    public void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Jumlah Halaman: " + jumlahHalaman);
    }

    public static void main(String[] args) {
        Buku buku = new Buku("Pemrograman Berorientasi Objek", "Abdul Rojak", 2023, 250);
        buku.tampilInformasi();
        buku.tambahHalaman(30);
        buku.tampilInformasi();
    }
}
