public class ElektronikDemo {
    public static void main(String[] args) {

        // Instansiasi objek Kulkas
        Kulkas kulkas1 = new Kulkas();
        kulkas1.merk = "LG";
        kulkas1.harga = 4500000;
        kulkas1.warna = "Silver";
        kulkas1.jumlahPintu = "2";

        // Instansiasi objek TV
        TV tv1 = new TV();
        tv1.merk = "Samsung";
        tv1.harga = 7500000;
        tv1.warna = "Hitam";
        tv1.ukuranLayar = "55 Inch";
        tv1.volume = 20;

        // Menampilkan informasi Kulkas
        System.out.println("===== INFORMASI KULKAS =====");
        System.out.println(kulkas1.getInfo());

        // Menampilkan informasi TV
        System.out.println("\n===== INFORMASI TV =====");
        System.out.println(tv1.getInfo());
    }
}