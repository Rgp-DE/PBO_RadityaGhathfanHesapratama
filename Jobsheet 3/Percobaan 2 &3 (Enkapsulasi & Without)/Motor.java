public class Motor {
    private String platNomor;
    private boolean statusMesin;
    private int kecepatan;

    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public boolean isStatusMesin() {
        return statusMesin;
    }

    public void setStatusMesin(boolean statusMesin) {
        this.statusMesin = statusMesin;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        // Validasi 1: Cek apakah kecepatan bernilai negatif (Jawaban No. 5)
        if (kecepatan < 0) {
            System.out.println("Peringatan: Kecepatan tidak boleh bernilai negatif!");
            this.kecepatan = 0; // Kembalikan ke 0 jika input salah
        }
        // Validasi 2: Cek apakah mesin mati
        else if (!this.statusMesin && kecepatan > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin OFF!");
        } 
        // Validasi 3: Cek batas kecepatan maksimal (Jawaban No. 4)
        else if (kecepatan > 100) {
            System.out.println("Peringatan: Kecepatan maksimal adalah 100 km/h!");
            this.kecepatan = 100; // Nilai dipaksa mentok di 100
        } 
        // Jika semua validasi aman, masukkan nilai kecepatan
        else {
            this.kecepatan = kecepatan;
        }
    }
    
    public void displayInfo() {
        System.out.println("Plat Nomor: " + platNomor);
        System.out.println("Status Mesin: " + (statusMesin ? "ON" : "OFF"));
        System.out.println("Kecepatan: " + kecepatan + " km/h");
    }
}
