import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double celcius, kelvin, fahrenheit;
        System.out.println("Ingrese la temperatura en grados Fahrenheit: ");
        fahrenheit = lectura.nextDouble();
         celcius = (fahrenheit - 32) * 5 / 9;
         kelvin = celcius + 273.15;

        System.out.println("La temperatura en grados Kelvin es: " + kelvin + " K");
        lectura.close();
    }
}
