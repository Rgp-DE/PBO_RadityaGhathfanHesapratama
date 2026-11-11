public class Dosen22 extends Pegawai22 {
    public String nidn;

    public Dosen22() {

    }
    
    public Dosen22(String nip, String nama, String nidn) {
        super(nip, nama);
        this.nidn = nidn;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("NIDN: " + nidn);
    }

    public void mengajar() {
        System.out.println("Membuat Rencana Belajar");
        System.out.println("Menyusun Mater");
        System.out.println("Melaksanakan PBM");
        System.out.println("Melakukan Evaluasi");
    }

    
}
