package Tugas_Abstract;

public abstract class BarangElektronik {

    protected String merk;
    protected double harga;
    protected String warna;
    protected int dayaListrik;

    // Constructor default
    public BarangElektronik() {
        this.merk = "-";
        this.harga = 0;
        this.warna = "-";
        this.dayaListrik = 0;
    }

    // Constructor berparameter
    public BarangElektronik(String merk, double harga,
                            String warna, int dayaListrik) {
        this.merk = merk;
        this.harga = harga;
        this.warna = warna;
        this.dayaListrik = dayaListrik;
    }

    // Concrete method
    public String getInfo() {
        return "Merk          : " + merk +
               "\nHarga         : Rp" + String.format("%,.0f", harga) +
               "\nWarna         : " + warna +
               "\nDaya Listrik  : " + dayaListrik + " Watt";
    }

    // Abstract method
    public abstract void operasikan();

}
