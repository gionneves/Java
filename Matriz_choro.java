package Java.Basico.GNS;

public class Matriz_choro {

    public static void main(String[] args) {

        int[][] matrix = new int[2][2];
        int soma = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = soma;
                soma++;
            }

        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
