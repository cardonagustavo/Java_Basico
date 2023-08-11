public class WhileLoop {

    public static boolean inTurnOnLight = false;

    public static void main(String[] args) {
        turnOnOffLight();

        int i = 0;
        while (inTurnOnLight && (i <= 10)) {
            printSOS();
            i++;
        }
    }

    public static void printSOS() {
        System.out.println(". . . _ _ _ . . .");
    }

    public static void turnOnOffLight() {
        inTurnOnLight = !inTurnOnLight;
    }
}
