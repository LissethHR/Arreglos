import java.util.Scanner;

public class Burbuja {
        static int cantidad;
        static int numero;
        static int [] arreglo;
        static int opc;

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            menu();
            opc = scanner.nextInt();
            while (opc != 1 && opc != 2) {
                System.out.println("Ingresaste un numero invalido, vuelve a ingresarlo:");
                opc = scanner.nextInt();
            }

            if (opc == 1 ) {
                creararreglo();
            }
            if (opc==2) {
                System.out.println("Fin del programa");
            }
        }
        public static void imprimirarreglo (){
            System.out.println("Numeros del arreglo en el orden ingresado:");
            for (int i = 0; i < cantidad; i++) {
                System.out.print(arreglo[i] + " ");
            }
            System.out.println();
            imprimirarreglomenor();
        }

    public static void imprimirarreglomenor() {
            int aux;
            for (int i= 0; i<arreglo.length - 1; i++){
                for (int j = i; j< arreglo.length; j++){
                    if (arreglo[i]> arreglo[j]){
                            aux= arreglo[i];
                        arreglo[i] = arreglo[j];
                        arreglo[j] = aux;
                    }
                }
            }

        System.out.println("El arreglo ordenado de forma ascendente es:");
        for (int i = 0; i < cantidad; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
        imprimirarreglomas();
    }

    public static void imprimirarreglomas() {
        int aux;
        for (int i= 0; i<arreglo.length - 1; i++){
            for (int j = i; j< arreglo.length; j++){
                if (arreglo[i]<arreglo[j]){
                    aux= arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }

        System.out.println("El arreglo ordenado de forma descendente es:");
        for (int i = 0; i < cantidad; i++) {
            System.out.print(arreglo[i] + " ");
        }

    }

    public static void creararreglo() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresa la cantidad de numeros que deseas capturar en tu arreglo:");
            cantidad= scanner.nextInt();
            arreglo = new int[cantidad];
            for ( int i=0; i <cantidad; i++){
                System.out.println("Ingresa el numero " + (i+1) + " del arreglo");
                numero = scanner.nextInt();
                arreglo[i]=numero;

            }
            imprimirarreglo();
        }

        public static void menu() {
            System.out.println("----Bienvenido-----");
            System.out.println("¿Deseas crear un arreglo?");
            System.out.println("1. Si");
            System.out.println("2. No");
        }
    }