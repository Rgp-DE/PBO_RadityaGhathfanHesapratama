public class InheritanceDemo {

    public static void main(String[] args) {

        System.out.println("=== DOSEN 1: CONSTRUCTOR TANPA PARAMETER ===");

        Dosen dosen1 = new Dosen();

        dosen1.nama = "Raditya Ghathfan Hesapratama";
        dosen1.nip = "123456789";
        dosen1.gaji = 5000000;
        dosen1.nidn = "987654321";

        System.out.println(dosen1.getAllInfo());

        System.out.println("=== DOSEN 2: CONSTRUCTOR BERPAREMETER ===");

        Dosen dosen2 = new Dosen(
            "34329837",
            "Yansy Ayuningtyas",
            3000000,
            "1989432439"
        );

        System.out.println(dosen2.getAllInfo());

    }

}