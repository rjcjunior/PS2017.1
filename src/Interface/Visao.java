/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Dominio.Expressao;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Ricardo Junior
 */
public class Visao {

    public static void main(String[] args) {
        Expressao colecaodeexpressoes = new Expressao();
        colecaodeexpressoes.Expressao();
        colecaodeexpressoes.incluirExpressao("Alfabeto");
        colecaodeexpressoes.incluirExpressao("BUZINA");
        colecaodeexpressoes.incluirExpressao("Buzina");
        colecaodeexpressoes.incluirExpressao("Carro");
        Iterator<String> iterator = colecaodeexpressoes.getcolecao().iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + "\n");
        }

        colecaodeexpressoes.deletarexpressao("teste");
        Set <String> teste = colecaodeexpressoes.consultarLetraInicial("e"); 
        System.out.print( "-------------------------------\n");

        for (String j:teste){
              System.out.println(j);
        }
    }

}
