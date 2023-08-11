// 1. Definir el nombre de la variable y el tipo de datos
//  que va a contener, cualquiera de las siguientes dos
// opciones es válida:
        //TipoDato[] nombreVariable;
        //TipoDato nombreVariable[];

// 2. Definir el tamaño del array, la cantidad de elementos
// que podemos guardar en el array:
        //TipoDato[] nombreVariable = new TipoDato[capacidad];

// Array de dos dimensiones:
        //TipoDato[][] cities = new String[númeroFilas][númeroColumnas];


public class Arrays {
    public static void main(String[] args) {
        String [] androidVersions = new String[17];
        String days [] = new String[7];

        String [] [] cities = new String[4][2];

        /*
        *   +------------------------------+
        *   | country       |   City       |
        *   --------------------------------
        *   | Mexico        |   CDMX       |
        *   | Mexico        |   CDMX       |
        *   | Colombia      |   Bogota     |
        *   | Colombia      |   Medellin   |
        *   +------------------------------+
        *
        *  **/

        int [][][] numbers = new int [2][2][2];
        int [][][][] numbers4 = new int [2][2][2][2];

        androidVersions [0] "Aple pie";
        androidVersions [2] "Bannana bread";
        androidVersions [3] "Cupcake";
        androidVersions [4] "Donut";

        System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);
        System.out.println(androidVersions[2]);
        System.out.println(androidVersions[3]);
        System.out.println(androidVersions[4]);

        System.out.println();
        System.out.println();

        cities[0][0] = "Colombia";
        cities[0][1] = "Medellin";
        cities[0][1] = "Colombia";
        cities[1][1] = "Bogota";
        cities[2][0] = "Mexico";
        cities[2][1] = "CDMX";
        cities[3][0] = "Mexico";
        cities[3][1] = "CDMX";

        System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println(cities[0][1]);
        System.out.println(cities[1][1]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);


        String [][][][] animales = new String[2][3][2][2];
        animales [1][0][0][1] = "monkey";

    }

}
