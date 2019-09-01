package unir;
import org.junit.Assert;
import org.junit.Test;
public class CalculadoraTest {

    @Test
    public void testSuma(){
        //Arrange
        int a = 2;
        int b = 3;
        int esperado = 5;
        Calculadora calc = new Calculadora();
        //Act
        int resultado = calc.sumar(a,b);
        //Assert
        Assert.assertEquals(esperado,resultado);
    }
    @Test
    public void testResta(){
        //Arrange
        int a = 4;
        int b = 2;
        int esperado = 2;
        Calculadora calc = new Calculadora();
        //Act
        int resultado = calc.restar(a,b);
        //Assert
        Assert.assertEquals(esperado,resultado);
    }

}
