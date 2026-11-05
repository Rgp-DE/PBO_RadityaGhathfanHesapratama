package Tugas_Interface;

public class PengirimPesanDemo {

    public static void main(String[] args) {

        // Instansiasi objek
        Kurir kurir1 = new Kurir("Andi", "Motor");
        MerpatiPos merpati1 = new MerpatiPos("Rio", "Abu-abu");
        DronePengantar drone1 = new DronePengantar("DR-01", 75);

        // Pengiriman oleh Kurir
        System.out.println("===== PENGIRIMAN OLEH KURIR =====");
        kurir1.cekAlamatPenerima();
        kurir1.kirimPesan();
        kurir1.tampilkanStatus();

        // Pengiriman oleh Merpati Pos
        System.out.println("\n===== PENGIRIMAN OLEH MERPATI POS =====");
        merpati1.kirimPesan();
        merpati1.terbangPulang();
        merpati1.tampilkanStatus();

        // Pengiriman oleh Drone
        System.out.println("\n===== PENGIRIMAN OLEH DRONE =====");
        drone1.isiUlangBaterai();
        drone1.kirimPesan();
        drone1.tampilkanStatus();
    }
}
