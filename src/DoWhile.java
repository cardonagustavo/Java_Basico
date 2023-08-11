import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        int respuesta;
        do{
            System.out.println("Selecciona la opcion deseada");
            System.out.println("1. Pelicula");
            System.out.println("2. Series");
            System.out.println("0. salir");

            Scanner sc =  new Scanner(System.in);
            respuesta = Integer.parseInt(sc.nextLine());

            switch (respuesta) {
                case 0 -> System.out.println("Gracias por visitarnos");
                case 1 -> System.out.println("Peliculas");
                case 2 -> System.out.println("Series");
                default -> System.out.println("Seleciiona una opcion correcta");
            }
        }while (respuesta != 0);
        System.out.println("Secion terminada");
    }
}
