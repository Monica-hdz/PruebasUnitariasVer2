
import com.palmartec.pruebasunitariasver2.Ejercicios;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class EjerciciosTest {
    
   Ejercicios ej = new Ejercicios();
   
   @Test
   public void convertTest(){
     assertEquals(360, ej.convert(6));
     assertEquals(240, ej.convert(4));
     assertEquals(480, ej.convert(8));
     assertEquals(3600, ej.convert(60));
   }
   
   @Test
   public void triAreaTest(){
       assertEquals(3, ej.triArea(3, 2));
       assertEquals(10, ej.triArea(5, 4));
       assertEquals(50, ej.triArea(10, 10));
       assertEquals(0, ej.triArea(0, 60));
       assertEquals(66, ej.triArea(12, 11));
   }
   
   @Test
   public void lessThanTest(){
       assertEquals(true, ej.lessThan(5,57));
       assertEquals(false, ej.lessThan(77,30));
       assertEquals(true, ej.lessThan(0,59));
       assertEquals(false, ej.lessThan(78,35));
       assertEquals(true, ej.lessThan(63,11));
       assertEquals(false, ej.lessThan(37,99));
   }
}
