package Tugas_Interface;

public class DronePengantar implements PengirimPesan {

    private String idDrone;
    private int baterai;
    private String pesan;

    public DronePengantar(String idDrone, int baterai) {
        this.idDrone = idDrone;
        this.baterai = baterai;
        this.pesan = "Surat penting";
    }

    @Override
    public void kirimPesan() {
        System.out.println("Drone " + idDrone + " mengantar " + pesan + " melalui udara.");
    }

    @Override
    public void tampilkanStatus() {
        System.out.println("Status drone " + idDrone + ": Dalam proses pengiriman. Baterai " + baterai + "%.");
    }

    public void isiUlangBaterai() {
        this.baterai = 100;
        System.out.println("Baterai drone " + idDrone + " telah diisi menjadi " + baterai + "%.");
    }
}
