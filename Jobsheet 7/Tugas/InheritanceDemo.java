package Tugas;
public class InheritanceDemo {

    public static void main(String[] args) {

        TV tv1 = new TV("Samsung", 7500000, "Hitam", 120, "55 Inch", "OLED");
        Kulkas kulkas1 = new Kulkas("LG", 4500000, "Silver", 150, 2, -20);

        System.out.println("=== INFORMASI TV ===");
        System.out.println(tv1.getInfo());
        tv1.setVolume(20);

        System.out.println();

        System.out.println("=== INFORMASI KULKAS ===");
        System.out.println(kulkas1.getInfo());
        kulkas1.setSuhu(-10);

    }

}
