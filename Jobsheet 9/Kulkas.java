public class Kulkas extends AlatElektronik {
    public String jumlahPintu;

    @Override
    public String getInfo() {
        return super.getInfo() + "\nJumlah Pintu : " + jumlahPintu;
    }
}
