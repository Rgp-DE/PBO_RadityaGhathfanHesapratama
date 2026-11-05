package Tugas_Interface;

public class Kurir implements PengirimPesan {

    private String nama;
    private String kendaraan;
    private String pesan;

    public Kurir(String nama, String kendaraan) {
        this.nama = nama;
        this.kendaraan = kendaraan;
        this.pesan = "Surat undangan";
    }

    @Override
    public void kirimPesan() {
        System.out.println("Kurir " + nama + " mengantar " + pesan + " menggunakan " + kendaraan + ".");
    }

    @Override
    public void tampilkanStatus() {
        System.out.println("Status kurir: Pesan sedang diantar ke penerima.");
    }

    public void cekAlamatPenerima() {
        System.out.println("Kurir " + nama + " memeriksa alamat penerima.");
    }
}
