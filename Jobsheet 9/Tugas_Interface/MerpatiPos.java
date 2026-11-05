package Tugas_Interface;

public class MerpatiPos implements PengirimPesan {

    private String nama;
    private String warnaBulu;
    private String pesan;

    public MerpatiPos(String nama, String warnaBulu) {
        this.nama = nama;
        this.warnaBulu = warnaBulu;
        this.pesan = "Surat dari pos pengirim";
    }

    @Override
    public void kirimPesan() {
        System.out.println("Merpati " + nama + " membawa " + pesan + ".");
    }

    @Override
    public void tampilkanStatus() {
        System.out.println("Status merpati " + nama + " (" + warnaBulu + "): Pesan dibawa menuju penerima.");
    }

    public void terbangPulang() {
        System.out.println("Merpati " + nama + " terbang pulang ke kandang asal.");
    }
}