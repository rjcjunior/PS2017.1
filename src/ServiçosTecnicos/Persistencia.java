/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiçosTecnicos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * 
 */public class Persistencia {
	private String fileName = "arquivo.bin";
        File arquivo = new File("arquivo.bin");
        
        public Persistencia() throws IOException{
            if (!arquivo.exists()){
                            new File("arquivo.bin").createNewFile();
            }
        }
        
        public boolean gravaBinario(Set<String> expressoes){
            try{
                    ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName));
                    os.writeObject(expressoes);
                    os.close();
                    return true;
            }
            catch(IOException e){
            }
            return false;
        
    }
    
        public HashSet<String> lerBinario(){
            HashSet<String> expressoes = new HashSet<String>();    
            try{    

                    ObjectInputStream is = new ObjectInputStream(new FileInputStream(fileName));
                    @SuppressWarnings("unchecked")
                    HashSet<String> expressoes1 = (HashSet<String>) is.readObject();
                    is.close();
                    return expressoes1;
                
            }
            catch(IOException e){
            }

            catch(ClassNotFoundException e){
            }
            return expressoes;
    }
}