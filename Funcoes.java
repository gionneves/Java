package Java.Basico.GNS;

public class Funcoes {

    public static void main(String[] args) {
        String x = "Hello, World";
        x = addExclamation(x);
        System.out.println(x);
    }

    public static String addExclamation(String addE) {
        return addE + "!";
    }

}
