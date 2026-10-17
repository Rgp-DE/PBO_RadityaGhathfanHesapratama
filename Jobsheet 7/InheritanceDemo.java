public class InheritanceDemo {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen();

        dosen1.nama = "Raditya Ghathfan Hesapratama";
        dosen1.nip = "123456789";
        dosen1.gaji = "Rp. 5.000.000";
        dosen1.nidn = "987654321";

        System.out.println(dosen1.GetInfo());
    }
    
}
