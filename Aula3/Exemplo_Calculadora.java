/*
Atividade:
    Usando o cohecimento aprendido, implemente uma calculadora.
        A função deverá receber dois valores numéricos inteiros, um valor texto
        representando a operação a ser executada e, por fim, retornar o resultado da operação.
 */
package exemplo01;

import java.util.Scanner;

/**
 * @Date: 23/03/2018
 * @author Bruno Borges Martim
 */
public class Exemplo_Calculadora {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        
                int valor01;   
        int valor02;    
        float resultado;  
        String operador;
        
        System.out.print("Insira o primeiro operador: ");
        valor01 = numeros.nextInt();
        System.out.println();
        System.out.print("Insira o segundo operador: ");
        valor02 = numeros.nextInt();
        System.out.println();
        System.out.print("Insira o operando ('/','*','+','-'): ");
        operador = numeros.next();
        
        resultado = 0;
        
        if(operador.equals("+")){
            resultado = valor01 + valor02;
        }else if (operador.equals("-")){
            resultado = valor01 - valor02;
        }else if (operador.equals("*")){
            resultado = valor01 * valor02;
        }else if (operador.equals("/")){
            resultado = (float) valor01/ (float) valor02;
        }else{
            System.out.println("Operando inválido...");
        }
        
        System.out.println("O resultado é: " + resultado);
    }
}
