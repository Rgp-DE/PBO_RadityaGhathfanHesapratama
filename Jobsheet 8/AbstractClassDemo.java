public class AbstractClassDemo {
    public static void  main(String[] args) {
        Lebah lebah1 = new Lebah("Ratu", 0.5, "Nektar", "Hutan");
        lebah1.cetakInfo();
        lebah1.bergerak();
        lebah1.bernafas();


        Ular ular1 = new Ular(true, 5.0, "Tikus", "Hutan");

        System.out.println("=== INFORMASI ULAR ===");
        ular1.cetakInfo();

        System.out.println("\n=== CARA ULAR BERGERAK ===");
        ular1.bergerak();

        System.out.println("\n=== CARA ULAR BERNAPAS ===");
        ular1.bernafas();
    }
    
}
