package model;

import java.util.Scanner;

public class Decisiones {

    public void estructuraIF(int nota){
        System.out.println("Vamos a explicar la estructura IF ");

        if (nota>=5){
            System.out.println("El examen esta aporbado");
        } else {
            System.out.println("El examen esta suspenso");

        }
        System.out.println("Terminando evaluación");

    }
    public void estructuraIFELSEIF(double nota) {
        // 0 -> desastrozo
        // 1 - 3 -> mal
        // 4 - 4.99 -> raspado
        // 5-7.99 -> bien
        // 8-8.99 -> notable
        // 9-9.99 -> sobresaliente
        //    10 -> MH
        System.out.println("Iniciando la evaluacion del examen");
        if (nota>=0 && nota<=10){
            if (nota<1){
                System.out.println("examen desastrozo");
            } else if (nota<4) {
                System.out.println("examen mal");
            } else if (nota<5) {
                System.out.println("examen suspenso raspado");
            } else if (nota<8) {
                System.out.println("examen bien");
            } else if (nota<9) {
                System.out.println("examen notable");
            } else if (nota<10) {
                System.out.println("examen sobresaliente");
            } else  {
                System.out.println("examen de MH");
            }
            System.out.println("Evaluacion finalizada");
        }else {
            System.out.println("Rango incorrecto");
        }


    }
    public void ejercicio4T2(){
        /*
        Desarrolla un programa que pida un número al usuario y determine si es par o impar usando
         el operador módulo. Muestra el resultado por consola.
         */
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("dime que numero quieres evaluar");
        int numero = lecturaTeclado.nextInt();
        if (numero%2==0){
            System.out.printf("El número %d es par%n", numero);
        }else {
            System.out.printf("El número %d es impar%n ", numero);
        }

        lecturaTeclado = null; // si lo dejo solo cerrado se queda el puntero cerrado, mejor lo igualo a nulo para que deje de ocupar memoria.

    }

    public void ejercicio10T2(int horas){
        /*
        Crea un programa que pida el salario base por hora, las horas trabajadas y si ha hecho horas extra (true/false).
         Si ha hecho horas extra y trabajó más de 40 horas, las horas que excedan de 40 se pagan al doble.
         Usa operadores lógicos, relacionales y aritméticos para calcular el salario total.
         */

        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Introduce el salario por hora");
        int salarioHora = lectorTeclado.nextInt();
        System.out.println("Indica cuantas horas has trabajado");
        int horasTrabajadas = lectorTeclado.nextInt();
        System.out.println("Has trabajado horas extras? (true/false) ");
        boolean horasExtras = lectorTeclado.nextBoolean();

        int salarioTotal=0;
        salarioTotal += horasTrabajadas *salarioHora;

        if (horasExtras && horasTrabajadas>horas){
            int numeroHorasExtras = horasTrabajadas - horas;
            salarioTotal = numeroHorasExtras * (salarioHora*2);

        }else {
            salarioTotal += horas*salarioHora;

        }
        //System.out.println("El salario total de este mes es: "+salarioTotal+" €");
        // 3.19 -> %.2f
        // 3 -> %d
        // true -> %b
        // A -> %c
        System.out.printf("El salario cobrado este mes es %d %s\n", salarioTotal, "dolares");


        lectorTeclado.close();


    }




}
