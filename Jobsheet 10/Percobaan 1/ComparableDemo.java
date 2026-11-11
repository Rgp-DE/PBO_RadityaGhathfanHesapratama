import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {
    public static void main(String[] args) {

        ArrayList<Dosen22> daftarDosen = new ArrayList<>();

        daftarDosen.add(new Dosen22("321", "Bella", "0091"));
        daftarDosen.add(new Dosen22("123", "Adila", "0081"));
        daftarDosen.add(new Dosen22("231", "Petrus", "0071"));

        Collections.sort(daftarDosen);

        for (Dosen22 dosen : daftarDosen) {
            dosen.displayInfo();
            System.out.println();
        }
    }
}