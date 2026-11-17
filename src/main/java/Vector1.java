import java.util.Scanner;

public class Vector1 {
    static void main (){
        Scanner scanner = new Scanner(System.in);
        int cantidad;
        double numero;
        double suma = 0;
        double promedio;


        System.out.println("Ingresa la cantidad de numeros que deseas capturar:");
        cantidad = scanner.nextInt();

        while (cantidad <= 0) {
            System.out.println("Ingresa una cantidad mayor a cero:");
            cantidad = scanner.nextInt();
        }
        double [] vectores = new double[cantidad];
        for (int i = 0; i < cantidad; i++){
            System.out.println("Ingresa el numero " + (i + 1)+ " que deseas capturar (menor o igual a 10): ");
            numero = scanner.nextInt();
            while (numero < 0 || numero > 10){
                System.out.println("Ingresaste una cantidad incorrecta, vuelve a ingresar un numero menor o igual a 10:");
                numero = scanner.nextInt();
            }


            vectores [i] = numero;
            suma += vectores[i];
        }


        System.out.println("Numeros en orden inverso: ");
        for (int i = cantidad-1; i >= 0; i-- ){
            System.out.print(vectores[i] + ", ");
        }
        System.out.println();

        double mayor = vectores[0];
        for (int j = 0; j < cantidad; j++) {
            if (vectores[j] > mayor) {
                mayor = vectores[j];
            }

        }
        System.out.println("El numero mayor es: " + mayor);


        System.out.println("La suma de los numeros es: " + suma);
        promedio = suma / cantidad;
        System.out.println("El promedio de los numeros es: "+ promedio );
        if (promedio < 6 ) {
            System.out.println("REPROBADO");
        }
        if (promedio >= 6 ){
            System.out.println("APROBADO");
        }
        System.out.println("Fin del programa");

    }

}
