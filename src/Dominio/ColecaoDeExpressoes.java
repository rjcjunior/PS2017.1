/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;
import java.util.HashSet;
import java.util.Set;
import ServiçosTecnicos.Persistencia;
import java.io.IOException;

/**
 *
 * 
 */
public class ColecaoDeExpressoes {
    
    private Set<String> colecao; 
    private Persistencia persistencia;

    public  ColecaoDeExpressoes() throws IOException {
        colecao = new HashSet<String>();
        persistencia = new Persistencia();
        colecao = persistencia.lerBinario();
    }
        
    public Set getcolecao(){
        return colecao;
    }
    
    public boolean incluirExpressao(String s){
            s = s.toLowerCase();
            colecao.add(s);
            return persistencia.gravaBinario(colecao);
    }
    
    public boolean verificarExistencia(String s){
        s = s.toLowerCase();
        return colecao.contains(s);
    }
    
    public boolean deletarexpressao(String s){
        s = s.toLowerCase();
        colecao.remove(s);
        return persistencia.gravaBinario(colecao);
    }
    
    public boolean alterarExpressao(String s1, String s2){
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if (colecao.contains(s1)){
            colecao.remove(s1);
            colecao.add(s2);
            return persistencia.gravaBinario(colecao);
        }
        return false;
    }
    
}
