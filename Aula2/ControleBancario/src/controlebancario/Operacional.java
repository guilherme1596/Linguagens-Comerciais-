/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlebancario;
import  controlebancario.contaCliente; 

/**
 *
 * @author Wesley
 */
public class Operacional {
    
    //Metodos
    
    public static boolean realizaSaque(float valorSaque){
    
        boolean retorno = true;
        if(limiteSaqueCaixa() == true)
        {
            if (limiteSaqueConta() == true)
            {
               // saldoAtual = saldoAtual - valorSaque; 
            }
            else
            {
                System.out.print("Valor nao disponivel para saque na conta do cliente");
                retorno = false;
            }
        }else
        {
            System.out.print("Valor nao disponivel para saque no caixa");
            retorno = false;
        }    
        return retorno;
    }
     
       
    public static float deposito(float valorDeposito){
        
        float saldoAtual = 2000;
        saldoAtual = saldoAtual + valorDeposito; 
        return saldoAtual; 
    }
    
    // metodo de saldo disponivel do cliente 
    
    private static float saldoDisponivelCliente (){
       
        float valor = 2000;
        return valor;            
    }
    
    
    private static boolean limiteSaqueCaixa(){
    
        return true;
    }
   
      
    private static boolean limiteSaqueConta(){
                 
        return true; 
    }
    
    
    private static float limiteSaque(float valorSaque){
        
        return 1200;
    }
    
    
    private static boolean notasDisponivelSaque(){
         return true;
    }
    
    
}
