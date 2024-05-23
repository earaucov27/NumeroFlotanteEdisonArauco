public class NumeroFlotanteArauco {

    public static void main(String[] args) {
        // Declaración de variable float
        float numeroFlotante = 3.1416f;

        // Se separa la parte entera y el decimal
        int parteEntera = (int) numeroFlotante;
        float parteDecimal = numeroFlotante - parteEntera;

        // Se muestra el resultado de la parte entera y la parte con decimal por separado
        System.out.println("Parte entera: " + parteEntera);
        System.out.println("Parte decimal: " + parteDecimal);
    }
}