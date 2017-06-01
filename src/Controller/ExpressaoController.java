/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Dominio.ColecaoDeExpressoes;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * 
     */
public class ExpressaoController {
    private ColecaoDeExpressoes dicionario;
    
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

    public Set consultaNumPalvara(int i){
        Set<String> aux = dicionario.getcolecao();
        Set<String> aux2 = new HashSet();
        for (String j:aux){
            if (j.length() == 3){
                aux2.add(j);
            }
        }
        return aux2;
    }
   
    public Set consultaDeterminadaPalavra(String s){
        s = s.toLowerCase();
        Set<String> aux = dicionario.getcolecao();
        Set<String> aux2 = new HashSet();
        for (String j:aux){
            if (j.contains(s)){
                aux2.add(j);
            }
        }
        return aux2;
    }
   
    public Set consultaSemPalavra(String s){
        s = s.toLowerCase();
        Set<String> aux = dicionario.getcolecao();
        Set<String> aux2 = new HashSet();
        for (String j:aux){
            if (!j.contains(s)){
                aux2.add(j);
            }
        }
        return aux2;
    }
   
    public Set consultaLetraInicial(String s){
        s = s.toLowerCase();
        Set<String> aux = dicionario.getcolecao();
        Set<String> aux2 = new HashSet();
        for (String j:aux){
            if (j.startsWith(s)){
                aux2.add(j);
            }
        }
        return aux2;
    }

    public Set consultaLetraFinal(String s){
        s = s.toLowerCase();
        Set<String> aux = dicionario.getcolecao();
        Set<String> aux2 = new HashSet();
        for (String j:aux){
            if (j.endsWith(s) ){
                aux2.add(j);
            }
        }
        return aux2;
    }
}
