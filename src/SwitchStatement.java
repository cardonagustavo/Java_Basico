public class SwitchStatement {

    public static void main(String[] args) {

        String colorModeSelecter = "Dark";
        switch (colorModeSelecter) {
            case "Light" -> System.out.println("Seleccionaste Light Mode");
            case "Night" -> System.out.println("Seleccionaste Night Mode");
            case "Blue Dark" -> System.out.println("Seleccionaste Blue Dark Mode");
            case "Dark" -> System.out.println("Seleccionaste Dark Mode");
            default -> System.out.println("Selecciona una opción");
        }
    }
}

