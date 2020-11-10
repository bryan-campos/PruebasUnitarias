package Datos;
public class ProbarFunciones {
    public static void main(String[] args){
        Funciones var = new Funciones();
        //Imprimir funcion comprobar
         System.out.println("Funcion de comprobar\n");
        var.comprobar(-1);
        var.comprobar(4);
        var.comprobar(-2);
        
        //Imprimir Funcion tartamudo
        System.out.println("\nFuncion de tartamudo\n");
        var.tartamudeo("tartamudo");
        var.tartamudeo("Goleador");
        var.tartamudeo("pelicula");
        
        //Imprimir Funcion regalo de tazas
        System.out.println("\nFuncion de regalo de tazas\n");
        var.tazas(12);
        var.tazas(18);
        var.tazas(60);
        //Imprimir Funcion leer
        System.out.println("\nFuncion de leer palabras\n");
        var.leer("Buenos dias Alegria");
        var.leer("Hola que hace");
        var.leer("Hola mundo");
    }
}
