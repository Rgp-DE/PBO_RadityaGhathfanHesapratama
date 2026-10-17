public class Pegawai {
    public String nip;
    public String nama;
    public String gaji;
    
    public Pegawai() {
        System.out.println("Ini Konstruktor Kelas Pegawai");
    }

    public String GetInfo() {
        String info = "";
        info += "NIP: " + nip + "\n";
        info += "Nama: " + nama + "\n";
        info += "Gaji: " + gaji + "\n";
        
        return info;
    }

}
