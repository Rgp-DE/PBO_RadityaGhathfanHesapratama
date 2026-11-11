public class TenagaKependidikan22 extends Pegawai22 {
    public String kategori;

    public TenagaKependidikan22() {

    }

    public TenagaKependidikan22(String nip, String nama, String kategori) {
        super(nip, nama);
        this.kategori = kategori;
    }
   
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kategori: " + kategori);
    }
}
