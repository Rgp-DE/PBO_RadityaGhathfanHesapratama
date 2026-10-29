public class Pegawai {

    public String nip;
    public String nama;
    public double gaji;

    public Pegawai() {
        System.out.println("Ini constructor class Pegawai");
    }

    public Pegawai(String nip, String nama, double gaji) {
        this.nip = nip;
        this.nama = nama;
        this.gaji = gaji;
        System.out.println("Ini constructor class Pegawai yang berparameter");
    }

    public String getInfo() {
        String info = "";

        info += "NIP   : " + nip + "\n";
        info += "Nama  : " + nama + "\n";
        info += "Gaji  : Rp" + String.format("%,.0f", gaji) + "\n";

        return info;
    }

}