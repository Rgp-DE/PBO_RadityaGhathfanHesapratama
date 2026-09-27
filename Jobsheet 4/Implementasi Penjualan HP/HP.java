public class HP {

    private String kodeHP;
    private String merk;
    private String model;
    private double harga;
    private int stok;

    public HP(String kodeHP, String merk, String model, double harga, int stok) {
        this.kodeHP = kodeHP;
        this.merk = merk;
        this.model = model;
        this.harga = harga;
        this.stok = stok;
    }

    public String getKodeHP() {
        return kodeHP;
    }

    public void setKodeHP(String kodeHP) {
        this.kodeHP = kodeHP;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getInfo() {
        return kodeHP + " - " + merk + " " + model + ", Harga: Rp" + harga + ", Stok: " + stok;
    }

}