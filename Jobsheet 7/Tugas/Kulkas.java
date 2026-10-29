package Tugas;

public class Kulkas extends BarangElektronik {

    private int jumlahPintu;
    private int suhuMinimum;

    public Kulkas() {
        super();
        this.jumlahPintu = 0;
        this.suhuMinimum = 0;
    }

    public Kulkas(String merk, double harga, String warna, int dayaListrik, int jumlahPintu, int suhuMinimum) {
        super(merk, harga, warna, dayaListrik);
        this.jumlahPintu = jumlahPintu;
        this.suhuMinimum = suhuMinimum;
    }

    public void setSuhu(int suhu) {
        System.out.println("Suhu kulkas diatur menjadi " + suhu + " derajat Celsius");
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
               "\nJumlah Pintu  : " + jumlahPintu +
               "\nSuhu Minimum  : " + suhuMinimum + " derajat Celsius";
    }

}