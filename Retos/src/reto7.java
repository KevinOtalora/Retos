import java.util.Random;
import java.util.Scanner;

public class reto7 {
    public static void main(String[] args) {
        Random r1 = new Random();
        Scanner lectura = new Scanner(System.in);
        //DECLARAR VARIABLES
        int n1, n2, apuesta, perdida, victoria, seguir=1, total=0, vida=3;
        String nombre;

        //SOLICITAR DATOS
        System.out.println("Ingrese su nombre");
        nombre=lectura.nextLine();
        
        while(seguir==1 && vida>=1 && vida<=3){
        n1=r1.nextInt(3);
        System.out.println("Seleccione 0 PIEDRA 1 PAPEL 2 TIJERA ");
        n2=lectura.nextInt();
        System.out.println("Ingrese valor de su apuesta");
        apuesta=lectura.nextInt();
        /*
              PIEDRA PAPEL TIJERA
        PIEDRA 
        PAPEL
        TIJERA
         */
        perdida=apuesta-apuesta;
        victoria=apuesta*2;
        //CREAR LA CONDICION
        if ((n2== 0) &&(n1==0) ) {
            System.out.println(nombre+" EMPATE AMBOS HAN SACADO PIEDRA"+" no has ganado "+apuesta);
        }else if ((n2==1)&&(n1==1)) {
            System.out.println(nombre+" EMPATE AMBOS HAN SACADO PAPEL"+" no has ganado "+apuesta);  
        }else if ((n2==2)&&(n1==2)) {
            System.out.println(nombre+" EMPATE AMBOS HAN SACDO TIJERA"+" no has ganado "+apuesta);
        }else if ((n2==0)&&(n1==1)){
            vida=vida-1;
            System.out.println(nombre+" PERDISTE GANA PAPEL"+" Dinero de apuesta "+perdida);
            total=total-perdida;
        }else if ((n2==1)&&(n1==2)){
            vida=vida-1;
        System.out.println(nombre+" PERDISTE GANA TIJERA"+" Dinero de apuesta "+perdida);
        total=total-perdida;
        }else if ((n2==2)&&(n1==0)){
            vida=vida-1;
        System.out.println(nombre+" PERDISTE GANA PIEDRA"+" Dinero de apuesta "+perdida);
        total=total-perdida;
        }else if ((n2==0)&&(n1==2)){
        System.out.println(nombre+"HAS GANADO PIEDRA GANA A TIJERAS"+" Dinero ganado "+victoria);
        total=total+victoria;
        }else if ((n2==1)&&(n1==0)){
        System.out.println(nombre+"HAS GANADO PAPEL GANA A PIEDRA"+" Dinero ganado "+victoria);
        total=total+victoria;
        }else if ((n2==2)&&(n1==1)){
        System.out.println(nombre+"HAS GANADO TIJERA GANA A PAPEL"+" Dinero ganado "+victoria);
        total=total+victoria;
        }
        System.out.println(total);
        System.out.println("Desea seguir jugando: 1 seguir  0  salir");
        seguir=lectura.nextInt();
        }
        System.out.println("Fin de juego");
        System.out.println("Las vidas se acabaron gracias por jugar");
        lectura.close();
    }
    
}
