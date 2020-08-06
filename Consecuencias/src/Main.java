import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        Tablero tableroFinal = new Tablero();
        System.out.println();
        System.out.println();

        System.out.println("JUEGA A LANZARLE HUEVOS A LOS PKS");
        System.out.println("_________________________________");
        System.out.println();

        tableroFinal.mostrarMatriz();
        tableroFinal.crearCarro();
        int menu = 0;
        do {
            System.out.println();
            System.out.println();
            System.out.println("================");
            System.out.println("||----Menu----||" + "\n================");

            System.out.println("[    1.- Lanzar Huevo     ]");
            System.out.println("[    2.- Mostrar Matriz   ]");
            System.out.println("[    3.- Mostrar puntaje  ]");

            System.out.println("{    0.- Salir del programa  }");
            System.out.println();


            System.out.println("=======================");

            System.out.println("|| Ingresa tu Opción ||");
            System.out.println("=======================");
            menu = sc.nextInt();


            switch (menu) {

                case 1:
                    System.out.println("-------Lanzar Huevo--------" + "\n______________________");
                    System.out.println("Ingresa las coordenadas donde lanzaras el huevo" + "\n recuerda que las coordenadas son del 1 al 15");
                    System.out.println();


                    System.out.println("Ingresa el numero de la fila: ");
                    int fila = sc.nextInt();
                    System.out.println("Ingresa el numero de la columna: ");
                    int columna = sc.nextInt();

                    if(fila < 1 || columna < 1 || fila > 15 || columna > 15) {
                    	System.err.println("Error: Ingrese sólo números entre 1 y 15");
                    }else {
                    	if (tableroFinal.golpeaCarro(fila-1, columna-1)) {
                    		System.out.println("¡Felicidades le diste! :)");
                    	} else {
                    		System.out.println("Lo siento, No le diste a nada :(");
                    	}
                    	tableroFinal.lanzarHuevo(fila-1, columna-1);
                    }

                    break;

                case 2:

                    tableroFinal.mostrarMatriz();
                    break;

                case 3:
                    tableroFinal.puntajeTotal();
                    break;
            }
        }
        while (menu != 0);

    }
}
