public class JavaDocs {

    public static void main(String[] args) {

        System.out.println("Pesos to Dollars: " + convertDollar(1000, "COP"));

    }

    /**
     * Esta Función que especificado su moneda y cantidad realiza la conversion a dolares.
     * @param quantity Cantidad de dinero.
     * @param currency Tipo de moneda: solo peso Mexicamo o Peso COlombiano.
     * @return quantity Devuelve la cantidad en dolares.
     * */

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


