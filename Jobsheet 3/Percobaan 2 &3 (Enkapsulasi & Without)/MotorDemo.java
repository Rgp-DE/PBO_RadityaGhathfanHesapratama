public class MotorDemo {
    
    public static void main(String[] args) {
        Motor motor1 = new Motor();
        motor1.setPlatNomor("B 1234 CD");
        motor1.setStatusMesin(true);
        motor1.setKecepatan(60);
        motor1.displayInfo();

        Motor motor2 = new Motor();
        motor2.setPlatNomor("D 5678 EF");
        motor2.setStatusMesin(false);
        motor2.setKecepatan(0);
        motor2.displayInfo();

        Motor motor3 = new Motor();
        motor3.setPlatNomor("F 9012 GH");
        motor3.setStatusMesin(true);
        motor3.setKecepatan(80);
        motor3.displayInfo();


    
    }
}
