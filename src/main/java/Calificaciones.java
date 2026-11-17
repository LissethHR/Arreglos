import java.util.Scanner;


public class Calificaciones {
    static int cant ;
    static int materias;
    static double suma;
    static String nombre;
    static double calificacion;

    static void promedio (){
        double promedio = (suma)/materias;
        System.out.println("El promedio del alumno " + nombre + " es: " + promedio);

        if (promedio>=6 && promedio <= 10 ){
            System.out.println("Resultado: APROBADO");
        }
        if (promedio >= 0 && promedio < 6 ){
            System.out.println("Resultado: REPROBADO");
        }

    }




    public static void registro (){
        Scanner scanner = new Scanner(System.in);
        double [][] calificaiones = new double[cant][materias];
        for (int i = 0; i < cant; i++ ){
            System.out.println("Ingresa el nombre2 del alumno "+ (i+1));
             nombre = scanner.nextLine();
             suma = 0;
            for  (int j = 0; j< materias; j++){
                System.out.println("Ingresa la calificacion de la materia " + (j+1) + " de " + nombre );
                calificacion = scanner.nextDouble();
                while (calificacion < 0 || calificacion > 10) {

                    System.out.println("ERROR: Ingresa una calificacion entre 0 y 10");
                    calificacion = scanner.nextDouble();

                }
                calificaiones [i][j] = calificacion;
                suma += calificaiones[i][j];
            }
            promedio();
        }




    }
    public static void menu (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----Registrar calificaciones-----");
        System.out.println("1. Cuantos alumnos desea registrar?");
        cant = scanner.nextInt();
        System.out.println("2. Cuantas materias desea registrar?");
        materias = scanner.nextInt();

        scanner.nextLine();
        registro();


    }
    public static void main (String []a){
        Scanner scanner = new Scanner(System.in);
        System.out.println("BIENVENIDO AL REGISTRO DE CALIFICACIONES");
        menu();


    }
}
