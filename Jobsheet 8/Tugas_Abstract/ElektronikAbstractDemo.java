package Tugas_Abstract;

public class ElektronikAbstractDemo {

    public static void main(String[] args) {

        // Instansiasi objek TV
        Tv tv1 = new Tv(
            "Samsung", 7500000, "Hitam",
            120, "55 Inch", "OLED"
        );

        // Instansiasi objek Kulkas
        Kulkas kulkas1 = new Kulkas(
            "LG", 4500000, "Silver",
            150, 2, -20
        );

        // Informasi TV
        System.out.println("===== INFORMASI TV =====");
        System.out.println(tv1.getInfo());

        System.out.println("\n===== OPERASIONAL TV =====");
        tv1.operasikan();
        tv1.setVolume(20);

        System.out.println("\n");

        // Informasi Kulkas
        System.out.println("===== INFORMASI KULKAS =====");
        System.out.println(kulkas1.getInfo());

        System.out.println("\n===== OPERASIONAL KULKAS =====");
        kulkas1.operasikan();
        kulkas1.setSuhu(-10);
    }
}
