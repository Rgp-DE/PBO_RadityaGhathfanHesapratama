public class MotorDemo {
    
    public static void main(String[] args) {
       Motor motor1 = new Motor();
        motor1.platNomor = "AG 1234 XYZ";
        int kecepatanBaru = 60; 

        if (!motor1.statusMesin && kecepatanBaru > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        }
        else {
            motor1.kecepatan = kecepatanBaru;
        }

        motor1.displayInfo();

        Motor motor2 = new Motor();
        motor2.platNomor = "AG 5678 ABC";
        motor2.statusMesin = true;
        kecepatanBaru = 80;

        if (!motor2.statusMesin && kecepatanBaru > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        }
        else {
            motor2.kecepatan = kecepatanBaru;
        }

        motor2.displayInfo();

        Motor motor3 = new Motor();
        motor3.platNomor = "DK 9012 DEF";
        kecepatanBaru = 100;

        if (!motor3.statusMesin && kecepatanBaru > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        }
        else {
            motor3.kecepatan = kecepatanBaru;
        }

        motor3.displayInfo();
    }
}
