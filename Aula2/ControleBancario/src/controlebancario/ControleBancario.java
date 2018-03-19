/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlebancario;
//importa a classe operacional 
import controlebancario.Operacional;
import controlebancario.contaCliente;
        
/**
 *
 * @author Wesley
 */
public class ControleBancario {

    /**
     * @param args the command line arguments
     */
    
        
    public static void main(String[] args) {
        // TODO code application logic here
        
        //criando uma variavel operacao que vai ser do tipo classe operacional 
        
        Operacional operacao; 
        
        //criando uma classe 
        
        operacao = new Operacional();
        
        // cliando obj cliente 
        
        contaCliente cCliente;
        cCliente = new contaCliente(1,"","",1,1);
        
        boolean retornoop = false; 
        
        //usando método da classe
        
        retornoop = Operacional.realizaSaque(1000);
        System.out.print(retornoop);
        
    }
    
}
