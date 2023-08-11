public class ForLoop {
    public static boolean inTurnOnLight = false;

    public static void main(String[] args) {
        turnOnOffLight();

        for (int i = 1; i <= 10 ; i++) {

        }
    }
    public static void printSOS() {
        System.out.println(". . . _ _ _ . . .");
    }

    public static void turnOnOffLight() {
        inTurnOnLight = !inTurnOnLight;
    }
}
