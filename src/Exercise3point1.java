import java.util.Scanner;

public class Exercise3point1 {
    public static void main(String[] args) {
        int [] vectorvalores = new int[10];
        int suma = 0;

        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < vectorvalores.length; i ++) {
            System.out.printf("Ingrese el valor en el indice: " + i + " del array");
            vectorvalores[i] = keyboard.nextInt();
        }

        for (int i = 0; i < 9; i ++) {
                    suma = suma + vectorvalores[i];
                }
        System.out.printf("mostrar la suma: " + suma);
    }
}
