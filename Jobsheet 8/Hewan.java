public abstract class Hewan {
    public double berat;
    public String makanan;
    public String habitat;


    public Hewan(double berat, String makanan, String habitat) {
        this.berat = berat;
        this.makanan = makanan;
        this.habitat = habitat;
    }

    public abstract void bergerak();
        
    

   public abstract void bernafas();
        
    
    
    public void  cetakInfo() {
        System.out.println("Berat: " + this.berat + " kg");
        System.out.println("Makanan: " + makanan);
        System.out.println("Habitat: " + habitat);
    }
}
