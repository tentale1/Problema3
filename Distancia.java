import java.util.Scanner;

/**
 * Programa para hallar distacia entre 2 ciudades
 * 
 * @author Carlos Alvarez 
 * @version 20190803
 */
public class Distancia
{
    public static void main(String[] args)
    {
        double t1,g1,t2,g2,dist,sent1,sent2,cost1,cost2,cosg1,arcos,t1rad,g1rad,t2rad,g2rad;
        
        Scanner Teclado = new Scanner (System.in);
        
        System.out.println("Por favor inserte la latitud de la 1ra ciudad");
        t1 = Teclado.nextDouble();
        
        System.out.println("Por favor inserte la longitud de la 1ra ciudad");
        g1 = Teclado.nextDouble();
        
        System.out.println("Por favor inserte la latitud de la 2da ciudad");
        t2 = Teclado.nextDouble();
        
        System.out.println("Por favor inserte la longitud de la 2da ciudad");
        g2 = Teclado.nextDouble();
        
        //calculos de gradoas a radianes
        t1rad = Math.toRadians(t1);
        g1rad = Math.toRadians(g1);
        t2rad = Math.toRadians(t2);
        g2rad = Math.toRadians(g2);
        sent1 = Math.sin(t1rad);
        sent2 = Math.sin(t2rad);
        cost1 = Math.cos(t1rad);
        cost2 = Math.cos(t2rad);
        cosg1 = Math.cos(g2rad);
        arcos = Math.acos(sent1);
        
        //calculo de distancia
        dist =6371.07*arcos*sent2+cost1*cost2*cosg1-g2;
        
        System.out.println("la distancia entre las ciudad en KM es " + dist);
    }
}

