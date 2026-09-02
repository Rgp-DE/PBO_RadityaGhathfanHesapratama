public class Dragon22 {

    int x;
    int y;
    int direction;

    public Dragon22() {
        x = 0;
        y = 0;
        direction = 1;
    }

    public void changeDirection(int newDirection) {

        if (newDirection >= 1 && newDirection <= 4) {

            direction = newDirection;

        }

    }

    public void move(int steps) {

        if (direction == 1) {

            y = y + steps;

        } else if (direction == 2) {

            x = x + steps;

        } else if (direction == 3) {

            y = y - steps;

        } else if (direction == 4) {

            x = x - steps;

        }

    }

    public void printStatus() {

        System.out.println("Posisi Dragon : (" + x + ", " + y + ")");

        if (direction == 1) {

            System.out.println("Arah Dragon   : Atas");

        } else if (direction == 2) {

            System.out.println("Arah Dragon   : Kanan");

        } else if (direction == 3) {

            System.out.println("Arah Dragon   : Bawah");

        } else if (direction == 4) {

            System.out.println("Arah Dragon   : Kiri");

        }

    }
}