/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Dominio.ColecaoDeExpressoes;
import java.util.Set;

/**
 *
 * 
     */
public class ExpressaoController {
    private ColecaoDeExpressoes dicionario;
    
    
    public static void main(String[] args) {

        ExpressaoController e = new ExpressaoController();
        e.listar();
    }
    public ExpressaoController(){
        dicionario = new ColecaoDeExpressoes();
        
    }
    
    public boolean adicionar(String s){
            return dicionario.incluirExpressao(s);
    }
    
    public boolean verificar(String s){
            return dicionario.verificarExistencia(s);
    }
    
    public boolean deletar(String s){
            return dicionario.deletarexpressao(s);
    }
    
    public boolean alterar(String s1, String s2){
            return dicionario.alterarExpressao(s1, s2);
    }

    public void consultaNumPalvara(int i){
        Set<String> aux = dicionario.getcolecao();
        System.out.printf("------------");                
        for (String j:aux){
            if (j.length() == 3){
                System.out.printf(j,"\n");
            }
        }
        System.out.printf("------------");                
    }
   
    public void consultaDeterminadaPalavra(String s){
        s = s.toLowerCase();
        Set<String> aux = dicionario.getcolecao();
        System.out.printf("------------");                
        for (String j:aux){
            if (j.contains(s)){
                System.out.printf(j,"\n");
            }
        }
        System.out.printf("------------");                
    }
   
    public void consultaSemPalavra(String s){
        s = s.toLowerCase();
        Set<String> aux = dicionario.getcolecao();
        System.out.printf("------------");                        
        for (String j:aux){
            if (!j.contains(s)){
                System.out.printf(j,"\n");
            }
        }
        System.out.printf("------------");                        
    }
   
    public void consultaLetraInicial(String s){
        s = s.toLowerCase();
        Set<String> aux = dicionario.getcolecao();
        System.out.printf("------------");                
        for (String j:aux){
            if (j.startsWith(s)){
                System.out.printf(j,"\n");
            }
        }
        System.out.printf("------------");                
    }

    public void consultaLetraFinal(String s){
        s = s.toLowerCase();
        Set<String> aux = dicionario.getcolecao();
        System.out.printf("------------");                
        for (String j:aux){
            if (j.endsWith(s) ){
                System.out.printf(j,"\n");
            }
        }
        System.out.printf("------------");                
    }

    public void listar(){
        Set<String> aux = dicionario.getcolecao();
        System.out.printf("------------");                
        for (String j:aux){
                System.out.printf(j,"\n");
        }
        System.out.printf("------------");                
    }

}
