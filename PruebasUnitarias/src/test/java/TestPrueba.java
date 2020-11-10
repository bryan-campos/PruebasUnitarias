import Datos.Funciones;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
    public class TestPrueba {  
        public TestPrueba() {
        }
        Funciones var = new Funciones();
        
        //Test de la comprobacion de numeros
        @Test
        public void testComprobacion1(){
        assertEquals(true, var.comprobar(-1));
        }
        @Test
        public void testComprobacion2(){
        assertEquals(false, var.comprobar(4));
        }
        public void testComprobar3(){
        assertEquals(true, var.comprobar(-2));
        }
    
        //Test de tartamudeo
        @Test
        public void testTartamudeo1(){
        assertEquals("tartamudo", var.tartamudeo("tartamudo"));
        }
        @Test
        public void testTartamudeo2(){
       assertEquals("Goleador", var.tartamudeo("Goleador"));
        } 
        @Test
        public void testTartamudeo3(){
        assertEquals("pelicula", var.tartamudeo("pelicula"));
        } 
    
        //Test de las tazas
        @Test
        public void testTazas1(){
        assertEquals(14, var.tazas(12));
        }
        @Test
        public void testTazas2(){
        assertEquals(21, var.tazas(18));
        }
        @Test
        public void testTazas3(){
        assertEquals(70, var.tazas(60));
        }
    
        //Test para leer una oracion
        @Test
        public void testLeerOracion1(){
        assertEquals(3, var.leer("Buenos Dias Alegria"));
        }
        @Test
        public void testLeer2(){
        assertEquals(3, var.leer("Hola que hace"));
        }
        @Test
        public void testLeer3(){
        assertEquals(2, var.leer("Hola mundo"));
        }
}
