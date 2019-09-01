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
    @Test
    public void testMultiplicacion(){
        //Arrange
        int a = 4;
        int b = 2;
        int esperado = 8;
        Calculadora calc = new Calculadora();
        //Act
        int resultado = calc.multiplicar(a,b);
        //Assert
        Assert.assertEquals(esperado,resultado);
    }

    @Test
    public void testDivision(){
        //Arrange
        int a = 4;
        int b = 2;
        int esperado = 2;
        Calculadora calc = new Calculadora();
        //Act
        int resultado = calc.dividir(a,b);
        //Assert
        Assert.assertEquals(esperado,resultado);
    }

    @Test
    public void testRaizCuadrada(){
        //Arrange
        boolean correcto=false;
        int a = 120;
        float esperado = 10.9544511F;
        Calculadora calc = new Calculadora();
        //Act
        float resultado = calc.sqrt(a);
        //Assert
        float diff=resultado-esperado;
        if(diff<0){
            diff *= -1;
        }
        if(diff<=0.0001F){
            correcto=true;
        }
        Assert.assertTrue(correcto);

    }

}
