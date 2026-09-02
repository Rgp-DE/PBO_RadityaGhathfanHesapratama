public class DragonMain22 {

    public static void main(String[] args) {

        Dragon22 dragon1 = new Dragon22();
        Dragon22 dragon2 = new Dragon22();

        System.out.println("===== STATUS AWAL =====");

        dragon1.printStatus();
        System.out.println();

        dragon2.printStatus();

        System.out.println();
        System.out.println("===== PERGERAKAN DRAGON 1 =====");

        dragon1.move(5);
        dragon1.printStatus();

        dragon1.changeDirection(2);
        dragon1.move(3);
        dragon1.printStatus();

        System.out.println();
        System.out.println("===== PERGERAKAN DRAGON 2 =====");

        dragon2.changeDirection(3);
        dragon2.move(4);
        dragon2.printStatus();

        dragon2.changeDirection(4);
        dragon2.move(2);
        dragon2.printStatus();

    }
}