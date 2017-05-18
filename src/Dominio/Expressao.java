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
public class Expressao {
    
    private Set<String> colecaodeexpressoes; 
    
    public void Expressao() {
        colecaodeexpressoes = new HashSet<String>();        
    }
        
    public Set getcolecao(){
        return colecaodeexpressoes;
    }
    
    public boolean incluirExpressao(String s){
            s = s.toLowerCase();
            return colecaodeexpressoes.add(s);
    }
    
    public boolean verificarExistencia(String s){
        s = s.toLowerCase();
        return colecaodeexpressoes.contains(s);
    }
    
    public boolean deletarexpressao(String s){
        s = s.toLowerCase();
        return colecaodeexpressoes.remove(s);
    }
    
    public Set consultarDeterminadaPalavra(String s){
        s = s.toLowerCase();
        Set<String> aux = new HashSet();
        for (String j:colecaodeexpressoes){
            if (j.contains(s)){
                aux.add(j);
            }
        }
        return aux;
    }
   
    public Set consultarLetraInicial(String s){
        s = s.toLowerCase();
        Set<String> aux = new HashSet();
        for (String j:colecaodeexpressoes){
            if (j.startsWith(s)){
                aux.add(j);
            }
        }
        return aux;
    }

}
