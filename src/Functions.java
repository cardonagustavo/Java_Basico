public class Functions {
    public static void main(String[] args) {
        double radius = 3;

        double circleArea = circleArea(radius);
        double sphereArea = sphereArea(radius);
        double sphereVolume = sphereVolume(radius);

        System.out.println("Area of Circle: " + circleArea);
        System.out.println("Area of Sphere: " + sphereArea);
        System.out.println("Volume of Sphere: " + sphereVolume);

        System.out.println("Pesos to Dollars: " + convertDollar(1000, "COP"));
    }

    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double sphereArea(double radius) {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public static double sphereVolume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public static double convertDollar(double quantity, String currency) {
        if ("PMX".equals(currency)) {
            return quantity * 0.052;
        } else if ("COP".equals(currency)) {
            return quantity * 0.00031;
        } else {
            throw new IllegalArgumentException("Unknown currency: " + currency);
        }
    }
}
