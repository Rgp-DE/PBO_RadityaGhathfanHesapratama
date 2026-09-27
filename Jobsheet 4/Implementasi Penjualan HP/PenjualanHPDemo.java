import java.time.LocalDate;

public class PenjualanHPDemo {

    public static void main(String[] args) {

        HP hp1 = new HP("HP001", "Samsung", "Galaxy S30 Ultra", 30000000, 5);
        HP hp2 = new HP("HP002", "Apple", "iPhone 20 Pro Max", 1500000, 3);
        HP hp3 = new HP("HP003", "Xiaomi", "Redmi Note 17", 3500000, 10);

        Pelanggan pelanggan1 = new Pelanggan("P001", "Yanto");
        Pelanggan pelanggan2 = new Pelanggan("P002", "Ghathfan");

        Transaksi transaksi1 = new Transaksi(LocalDate.of(2026, 9, 20), hp1, 1);
        Transaksi transaksi2 = new Transaksi(LocalDate.of(2026, 9, 21), hp3, 2);
        Transaksi transaksi3 = new Transaksi(LocalDate.of(2026, 9, 22), hp2, 1);

        pelanggan1.tambahTransaksi(transaksi1);
        pelanggan1.tambahTransaksi(transaksi2);

        pelanggan2.tambahTransaksi(transaksi3);

        System.out.println("=== DATA PELANGGAN 1 ===");
        System.out.println(pelanggan1.getInfo());

        System.out.println("=== DATA PELANGGAN 2 ===");
        System.out.println(pelanggan2.getInfo());

    }

}
