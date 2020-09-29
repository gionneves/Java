package Java.Basico.GNS;

public class Listas_Vetores {

    public static void main(String[] args) {
        int[] listaInt = new int[15];
        String[] listaString = {"Laranja", "Maca", "Banana", "Abacate", "Pera"};

        for (int i = 0; i < 15; i++) {
            listaInt[i] = i;
            listaInt[i] *= 3;
            System.out.println(listaInt[i]);
        }

        for (int i = 0; i < listaString.length; i++) {
            System.out.println(listaString[i]);
        }
    }
}
