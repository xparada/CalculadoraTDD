package unir;

public class Calculadora {
    public int sumar(int a, int b){
        return a+b;
    }
    //Metodo auxiliar para poder sumar 2 floats
    public float sumarAux(float a, float b){
        return a+b;
    }
    public int restar(int a, int b){
        return a-b;
    }
    public int multiplicar(int a, int b){
        return a*b;
    }
    //Metodo auxiliar para poder multiplicar 2 floats
    public float multiplicarAux(float a, float b){
        return a*b;
    }
    public int dividir(int a, int b){
        return a/b;
    }
    //Metodo auxiliar para poder dividir 2 floats
    public float dividirAux(float a, float b){
        return a/b;
    }
    public float sqrt(int a){
        float x = (float)a;
        float n=0;

        //Aqui obtenemos el numero que multiplicado por si mismo es el que mas se acerca al que deseamos
        //siempre siendo menor
        for (int i=0;i*i<=x;i++){
            n=i;
        }
        //Aqui comprobamos que el numero n anterior que hemos conseguido sea el mas cercano o si es el siguiente
        //en nuestro caso el numero n seria 10 pero el que necesitamos sera 11 que es mas cercano el 11*11 a 120
        if(x-multiplicarAux(n,n)>multiplicarAux(n+1,n+1)-x){
            n=n+1;
        }

      //  float r = (n*n*n*n + 6*n*n*x + x*x) / (4*n*n*n + 4*n*x);
        float r = dividirAux( sumarAux(sumarAux(multiplicarAux(multiplicarAux(n,n),multiplicarAux(n,n)),6*multiplicarAux(multiplicarAux(n,n),x)), multiplicarAux(x,x)), sumarAux(4*multiplicarAux(multiplicarAux(n,n),n),4*multiplicarAux(n,x)));
        return r;

    }
}
