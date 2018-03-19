/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlebancario;

/**
 *
 * @author wesle
 */
public class contaCliente {
    
    private int codigoCliente;
    private String nomeCliente;
    private String numeroConta;
    private int conta;
    private float saldoConta;
    
    //Criando o Constructor, responsavel por armazernar as info do objeto
    
    contaCliente(int codCliente, String nomCliente, String numConta, int tipConta, float saldConta){
            
        codigoCliente = codCliente; 
        nomeCliente = nomCliente;
        numeroConta = numConta;
        conta = tipConta;
        saldoConta = saldConta;
    }
     
    public float retornaSaldo(){
        return saldoConta;
    }
    
    public void updateSaldo (float valor){
        
        saldoConta = valor; 
    }
}
