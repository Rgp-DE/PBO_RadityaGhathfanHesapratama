import java.time.LocalDate;

public class Transaksi {

    private LocalDate tanggal;
    private HP hp;
    private int jumlah;
    private double total;

    public Transaksi(LocalDate tanggal, HP hp, int jumlah) {
        this.tanggal = tanggal;
        this.hp = hp;
        this.jumlah = jumlah;
        this.total = hp.getHarga() * jumlah;
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public HP getHP() {
        return hp;
    }

    public void setHP(HP hp) {
        this.hp = hp;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getTotal() {
        return total;
    }

    public String getInfo() {
    String info = "";

    info += "Tanggal : " + tanggal + "\n";
    info += "HP      : " + hp.getMerk() + " " + hp.getModel() + "\n";
    info += "Jumlah  : " + jumlah + "\n";
    info += "Total   : Rp" + String.format("%,.0f", total) + "\n";

    return info;
}

}