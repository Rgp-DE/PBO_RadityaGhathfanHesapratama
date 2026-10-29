package Tugas;
public class TV extends BarangElektronik {

    private String ukuranLayar;
    private String jenisPanel;

    public TV() {
        super();
        this.ukuranLayar = "-";
        this.jenisPanel = "-";
    }

    public TV(String merk, double harga, String warna, int dayaListrik, String ukuranLayar, String jenisPanel) {
        super(merk, harga, warna, dayaListrik);
        this.ukuranLayar = ukuranLayar;
        this.jenisPanel = jenisPanel;
    }

    public void setVolume(int volume) {
        System.out.println("Volume TV diatur menjadi " + volume);
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
               "\nUkuran Layar  : " + ukuranLayar +
               "\nJenis Panel   : " + jenisPanel;
    }

}