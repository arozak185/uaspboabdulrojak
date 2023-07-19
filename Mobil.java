public class Mobil {
        private String merek;
        private int tahunProduksi;
        private String warna;
        private int kecepatan;
    
        //menginisialisasi atribut
        public Mobil(String merek, int tahunProduksi, String warna, int kecepatan) {
            this.merek = merek;
            this.tahunProduksi = tahunProduksi;
            this.warna = warna;
            this.kecepatan = kecepatan;
        }
    
        //menambahkan nilai kecepatan pada kecepatan mobil
        public void percepat(int nilaiKecepatan) {
            kecepatan += nilaiKecepatan;
        }
    
        //menampilkan informasi lengkap tentang mobil
        public void tampilInformasi() {
            System.out.println("Merek: " + merek);
            System.out.println("Tahun Produksi: " + tahunProduksi);
            System.out.println("Warna: " + warna);
            System.out.println("Kecepatan: " + kecepatan + " km/h");
        }
    
        public static void main(String[] args) {
            Mobil mobil = new Mobil("Suzuki", 1999, "Pink", 0);
            mobil.tampilInformasi();
            mobil.percepat(80);
            mobil.tampilInformasi();
        }
    }