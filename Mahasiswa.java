public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private float ipk;

    //menginisialisasi atribut
    public Mahasiswa(String nama, String nim, String jurusan, float ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    //mengubah nilai atribut Nama menjadi nilai baru tersebut
    public void ubahNama(String namaBaru) {
        nama = namaBaru;
    }

    //menampilkan informasi lengkap tentang mahasiswa
    public void tampilInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("IPK: " + ipk);
    }

    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Abdul Rojak", "C2083207005", "PTI", 3.9f);
        mahasiswa.tampilInformasi();
        mahasiswa.ubahNama("AROZAK");
        mahasiswa.tampilInformasi();
    }
}
