/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author Ricardo Junior
 */
public class ColecaoDeExpressoes {
    
    private Set<String> colecao; 
    
    public void Expressao() {
        colecao = new HashSet<String>();        
    }
        
    public Set getcolecao(){
        return colecao;
    }
    
    public boolean incluirExpressao(String s){
            s = s.toLowerCase();
            return colecao.add(s);
    }
    
    public boolean verificarExistencia(String s){
        s = s.toLowerCase();
        return colecao.contains(s);
    }
    
    public boolean deletarexpressao(String s){
        s = s.toLowerCase();
        return colecao.remove(s);
    }
    
    public boolean alterarExpressao(String s1, String s2){
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if (colecao.contains(s1)){
            colecao.remove(s1);
            return colecao.add(s2);
        }
        return false;
    }
    public Set consultarDeterminadaPalavra(String s){
        s = s.toLowerCase();
        Set<String> aux = new HashSet();
        for (String j:colecao){
            if (j.contains(s)){
                aux.add(j);
            }
        }
        return aux;
    }
   
    public Set consultarLetraInicial(String s){
        s = s.toLowerCase();
        Set<String> aux = new HashSet();
        for (String j:colecao){
            if (j.startsWith(s)){
                aux.add(j);
            }
        }
        return aux;
    }
    
}
