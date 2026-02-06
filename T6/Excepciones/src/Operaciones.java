import utils.ResultadoException;

public class Operaciones {

    public void sumar(int op1, int op2) throws ArithmeticException{
        /*try{

        }catch (){

        }*/
        int suma = op1 + op2;
        int multiplicacion = op1 * op2;
        int division = op1 / op2;
        int resta ;

        try {
            if (op2>op1){
                throw new ResultadoException("El sistema detecta una resta negativa"+(op1 - op2));
            }
            resta= op1 - op2;
        }catch (ResultadoException e){
            resta=0;
        }

                // =op1 - op2;
        // en caso de tener una resta negativa, quiero un fallo. Creamos nuestra propia excepción.
            //la solución será poner la resta a 0.
        System.out.println("Los resultado son");
        System.out.println("Suma " + suma);
        System.out.println("Multiplicacion " + multiplicacion);
        System.out.println("Division " + division);
        System.out.println("Resta = " + resta);
    }
}