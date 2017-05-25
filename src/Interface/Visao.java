/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Dominio.ColecaoDeExpressoes;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Ricardo Junior
 */
public class Visao {

    public static void main(String[] args) {
        ColecaoDeExpressoes dicionario = new ColecaoDeExpressoes();
        dicionario.Expressao();
        dicionario.incluirExpressao("Alfabeto");
        dicionario.incluirExpressao("BUZINA");
        dicionario.incluirExpressao("Buzina");
        dicionario.incluirExpressao("Carro");
        Iterator<String> iterator = dicionario.getcolecao().iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + "\n");
        }

        dicionario.deletarexpressao("teste");
        Set <String> teste = dicionario.consultarLetraInicial("e"); 
        System.out.print( "-------------------------------\n");

        for (String j:teste){
              System.out.println(j);
        }
    }

}
