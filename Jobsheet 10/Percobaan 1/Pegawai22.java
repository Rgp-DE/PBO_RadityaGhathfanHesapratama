public class Pegawai22 {
    public String nip;
    public String nama;

    public Pegawai22() {

    }

    public Pegawai22(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    public void displayInfo() {
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
    }
}