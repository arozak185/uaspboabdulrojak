public class PersegiPanjang {
    private float panjang;
    private float lebar;

    //menginisialisasi atribut
    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    //menghitung luas persegi panjang
    public float hitungLuas() {
        return panjang * lebar;
    }

    //menghitung keliling persegi panjang
    public float hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    public static void main(String[] args) {
        PersegiPanjang bangun = new PersegiPanjang(7.0f, 5.0f);
        float luas = bangun.hitungLuas();
        float keliling = bangun.hitungKeliling();
        System.out.println("Luas Persegi Panjang: " + luas );
        System.out.println("Keliling Persegi Panjang: " + keliling);
    }
}
