import java.util.Scanner;

public class Matrices1 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        int renglones;
        int columnas;
        int mayor;
        int menor;
        System.out.println("Bienvenido");
        System.out.println("Ingresa el numero de renglones que deseas: ");
        renglones = scanner.nextInt();
        while (renglones <= 0) {
            System.out.println("Error, ingresa un numero mayor a 0: ");
            renglones = scanner.nextInt();
        }
        System.out.println("Ingresa el numero de columnas de la matriz: ");
        columnas = scanner.nextInt();
        while (columnas <= 0) {
            System.out.println("Error, ingresa un numero mayor a 0: ");
            columnas = scanner.nextInt();
        }

        int[][] Matriz = new int[renglones][columnas];
        for (int i = 0; i < renglones; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Ingresa el numero " + (j + 1) + " del renglon " + (i + 1));
                Matriz[i][j] = scanner.nextInt();

            }
        }

        mayor = Matriz[0][0];
        for (int i = 0; i < renglones; i++) {
            for (int j = 0; j < columnas; j++) {
                if (Matriz[i][j] > mayor) {
                    mayor = Matriz[i][j];
                }
            }
        }
            System.out.println("El numero mayor de la matriz es: " + mayor);

            menor = Matriz[0][0];
            for (int i = 0; i < renglones; i++) {
                for (int j = 0; j < columnas; j++) {
                    if (Matriz[i][j] < menor) {
                        menor = Matriz[i][j];
                    }
                }
            }
            System.out.println("El numero menor de la matriz es: " + menor);


        for (int i = 0; i < renglones; i++) {
            int suma = 0;
            for (int j = 0; j < columnas; j++) {
                suma = suma + Matriz[i][j];
            }
            System.out.println("La suma del renglon " + (i+1) + " es: " + suma);
        }

        for (int j = 0; j < columnas; j++) {
            int suma = 0;
            for (int i = 0; i < renglones; i++) {
                suma = suma + Matriz[i][j];
            }
            System.out.println("La suma de columna " + (j+1) + " es: " + suma);
        }
        for (int j = 0; j < columnas; j++) {
            int suma = 0;
            int contador=0;
            int fila = 0;
            int columna = j;
            while (fila < renglones && columna < columnas) {
                suma += Matriz[fila][columna];
                contador++;
                fila++;
                columna++;
            }

            if (contador >= 2) {
                System.out.println("la suma diagonal hacia la derecha es : " + suma);
            }
        }
        for (int i = 1; i < renglones; i++) {
            int suma = 0;
            int contador = 0;
            int fila = i;
            int columna = 0;
            while (fila < renglones && columna < columnas) {
                suma += Matriz[fila][columna];
                contador++;
                fila++;
                columna++;
            }
            if (contador >= 2) {
                System.out.println(" La suma diagonal hacia la derecha es: " + suma);
            }
        }

        for (int j = 0; j < columnas; j++) {
            int suma = 0;
            int contador=0;
            int fila = 0;
            int columna = j;
            while (fila < renglones && columna >= 0) {
                suma += Matriz[fila][columna];
                contador++;
                fila++;
                columna--;
            }

            if (contador >= 2) {
                System.out.println("La suma diagonal hacia la izquierda es : " + suma);
            }
        }


        for (int i = 1; i < renglones; i++) {
            int suma = 0;
            int contador = 0;
            int fila = i;
            int columna = columnas - 1;
            while (fila < renglones && columna >= 0) {
                suma += Matriz[fila][columna];
                contador++;
                fila++;
                columna--;
            }
            if (contador >= 2) {
                System.out.println("La suma diagonal hacia la izquierda es: " + suma);
            }
        }


    }
}