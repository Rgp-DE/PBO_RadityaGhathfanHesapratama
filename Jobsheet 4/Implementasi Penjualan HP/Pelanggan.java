import java.util.ArrayList;

public class Pelanggan {

    private String idPelanggan;
    private String nama;
    private ArrayList<Transaksi> riwayatTransaksi;

    public Pelanggan(String idPelanggan, String nama) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.riwayatTransaksi = new ArrayList<Transaksi>();
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public ArrayList<Transaksi> getRiwayatTransaksi() {
        return riwayatTransaksi;
    }

    public void tambahTransaksi(Transaksi transaksi) {
        riwayatTransaksi.add(transaksi);
    }

    public String getInfo() {
        String info = "";

        info += "ID Pelanggan : " + idPelanggan + "\n";
        info += "Nama         : " + nama + "\n";

        if (!riwayatTransaksi.isEmpty()) {
            info += "Riwayat Transaksi:\n";

            for (Transaksi transaksi : riwayatTransaksi) {
                info += transaksi.getInfo();
                info += "\n";
            }
        } else {
            info += "Belum ada transaksi.\n";
        }

        return info;
    }

}