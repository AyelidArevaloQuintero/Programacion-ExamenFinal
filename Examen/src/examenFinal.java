import java.util.Scanner;

public class examenFinal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] notas = new int [6][6];

        System.out.println("");
        for(int i = 0; i<6; i++){
            System.out.println("Ingresa las el grupo de estudiantes" + notas [i][0]);

        } for (int j = 0; j<6; j++){
            System.out.println("Ingrese las notas (0 a 100)" + notas [0][j]);
        }
        
    }

    public static int contarEstudiantesAprobados(int[][] notas){
        for(int s = 0; s<6; s++){
    
            if(){

            }
            System.out.println("Las notas mayores o iguales a 60" );
        }
    }

    public static double promedioNotasAltas(int[][] notas){

    }

    public static void imprimirNotasBajas(int[][] notas){

    }

    public static int[] posicionNotaMaxima(int[][] notas){

    }
}

// Tengo que ingresar cada columna y fila, si i es igual a columnas, entonces j es igual a filas °
// En el siguiente debo ver cuantos estudiantes tienen una nota mayor o igual a 60 ( para (int s = 0; ), necesito un contador en este caso es s, tambien hago un si para que
// si las notas son mayores o iguales que 60.

// Calculamos el promedio de las notas mayores o iguales a 80
// imprimir las posiciones de las notas menores de 50 
// Devuelve un arreglo con la posición [fila, columna] de la nota más alta
// https://star-saver-473.notion.site/Prueba-Final-L-gica-An-lisis-de-Resultados-Acad-micos-20da0cdf497e80ac8835d0a962fc55f0
