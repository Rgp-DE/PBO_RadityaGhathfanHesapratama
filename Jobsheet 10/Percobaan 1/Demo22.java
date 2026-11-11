import java.util.ArrayList;

public class Demo22 {
    public static void main(String[] args) {
        Dosen22 dosen1 = new Dosen22("12345", "Budi S.Kom, M.kom", "67890");
        Dosen22 dosen2 = new Dosen22("54321", "Siti S.Pd, M.kom", "09876");
        TenagaKependidikan22 tendik = new TenagaKependidikan22("11111", "Andi", "Administrasi");
        TenagaKependidikan22 tedik2 = new TenagaKependidikan22("22222", "Rina", "Laboran");

        train(dosen1);
        train(dosen2);
    }

    public static void train(Pegawai22 pegawai) {
        pegawai.displayInfo();
        System.out.println("Mengenalkan Lingkungan Kampus");
        System.out.println("Menginfokan SOP/Juknis");

        if (pegawai instanceof Dosen22){
            System.out.println("Memberikan Pelatihan Pendagogik");
        }
    }
}
