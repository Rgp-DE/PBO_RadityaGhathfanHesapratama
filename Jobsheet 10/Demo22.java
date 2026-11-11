import java.util.ArrayList;

public class Demo22 {
    public static void main(String[] args) {
        Dosen22 dosen1 = new Dosen22("12345", "Budi S.Kom, M.kom", "67890");
        Dosen22 dosen2 = new Dosen22("54321", "Siti S.Pd, M.kom", "09876");
        TenagaKependidikan22 tendik = new TenagaKependidikan22("11111", "Andi", "Administrasi");
        TenagaKependidikan22 tedik2 = new TenagaKependidikan22("22222", "Rina", "Laboran");

        Pegawai22 pegawai1 = dosen1;

        System.out.println("pegawai1.nip");
        System.out.println("pegawai1.nama");
        System.out.println("pegawai1.nidn");
        pegawai1.mengajar();

        ArrayList<Pegawai22> daftarPegawai = new ArrayList<>();
        daftarPegawai.add(dosen1);
        daftarPegawai.add(dosen2);
        daftarPegawai.add(tendik);
        daftarPegawai.add(tedik2);

        System.out.println("Jumlah Pegawai: " + daftarPegawai.size());

        dosen1.mengajar();
    }
}
