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
        this.kecepatan = kecepatan;
    }

    public void displayInfo() {
        System.out.println("Plat Nomor: " + platNomor);
        System.out.println("Status Mesin: " + (statusMesin ? "ON" : "OFF"));
        System.out.println("Kecepatan: " + kecepatan + " km/h");
    }
}
