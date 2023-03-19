
import java.util.Scanner;

public class Reto4 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int jugador;
        int computadora = (int) (Math.random() * 3) + 1;

        System.out.println("Juego piedra, papel o tijera.");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");
        System.out.print("Cual escoje?: ");
        jugador = lectura.nextInt();

        switch (jugador) {
            case 1:
                System.out.println("Usted eligió piedra");
                break;
            case 2:
                System.out.println("Usted eligió papel");
                break;
            case 3:
                System.out.println("Usted eligió tijera");
                break;
            default:
                System.out.println("Selección inválida");

        }
        
        switch (computadora) {
            case 1:
                System.out.println("La computadora eligió piedra");
                break;
            case 2:
                System.out.println("La computadora eligió papel");
                break;
            case 3:
                System.out.println("La computadora eligió tijera");
                break;
        }

        if (jugador == computadora) {
            System.out.println("Empate");
        } else if ((jugador == 1 && computadora == 3) && (jugador == 2 && computadora == 1) && (jugador == 3 && computadora == 2)) {
            System.out.println("Usted gana");
        } else {
            System.out.println("La computadora gana");
        }
        lectura.close();
    }
    }