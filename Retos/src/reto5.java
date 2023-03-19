import java.util.Scanner;

public class reto5 {
    public static void main(String[] args) {
        Scanner lectura =new Scanner (System.in);
        
        double p1, p2, p3, p4, p5,valorCompra;
        double iva;
        String nombre1, nombre2, nombre3, nombre4, nombre5;      
        
        //SOLICITAR DATOS
        
        System.out.println("Ingrese el nombre de su producto #1");
        nombre1=lectura.next();
        System.out.println("Ingrese el valor de su producto #1");
        p1=lectura.nextInt();
        System.out.println("Ingrese el nombre de su producto #2");
        nombre2=lectura.next();
        System.out.println("Ingrese el valor de su producto #2");
        p2=lectura.nextInt();
        System.out.println("Ingrese el nombre de su producto #3");
        nombre3=lectura.next();
        System.out.println("Ingrese el valor de su producto #3");
        p3=lectura.nextInt();
        System.out.println("Ingrese el nombre de su producto #4");
        nombre4=lectura.next();
        System.out.println("Ingrese el valor de su producto #4");
        p4=lectura.nextInt();
        System.out.println("Ingrese el nombre de su producto #5");
        nombre5=lectura.next();
        System.out.println("Ingrese el valor de su producto #5");
        p5=lectura.nextInt();

        valorCompra=p1+p2+p3+p4+p5;
        iva=(valorCompra*19)/100;
        valorCompra=valorCompra+iva;
        System.out.println("Su compra fue de "+nombre1+" " + p1+"  "+nombre2 +" "+ p2+"   "+nombre3 +" "+ p3+"  "+nombre4 +" "
        + p4+"   "+nombre5 +" "+ p5);
        System.out.println("y su valor final con iva es de: "+valorCompra);
        lectura.close();
    }
}


