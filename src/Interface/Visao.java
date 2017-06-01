/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;


import Controller.ExpressaoController;
import java.io.IOException;
import java.util.Scanner;

public class Visao {
    private Scanner entrada = new Scanner(System.in);
    private ExpressaoController controller;
    private int aux;
    
    public static void main(String[] args) throws IOException {
        System.out.print( "-------------------------------\n");
        Visao  v = new Visao();
        v.menuVerificarUsuario();
    }

    public Visao() throws IOException {
        this.controller = new ExpressaoController();
    }
    
    private void menuVerificarUsuario(){
        System.out.print( "Selecione o tipo do utilizador:\n");
        System.out.print( " 1) Administrador \n");
        System.out.print( " 2) Consultas \n");
        int aux = entrada.nextInt();
        switch (aux) {
            case 1:
                System.out.print( "Entre com a senha:\n");
                int aux2 = entrada.nextInt();
                if (aux2 != 1234){
                        System.out.print( "Senha errada\n");
                        menuVerificarUsuario();
                        break;
                }
                menuCrudExpressao();
                break;
            case 2:
                menuConsulta();
                break;
            default:
                System.out.printf("Você digitou uma operação inválida.");        
        }
    }
    
    private void menuConsulta(){
        String aux1;
        System.out.print( "Selecione o tipo de consulta:\n");
        System.out.print( " 1) Expressões que contenham uma determinada palavra\n");
        System.out.print( " 2) Expressoes Iniciadas por uma determinada letra\n");
        System.out.print( " 3) Expressoes terminadas por uma determinada letra\n");
        System.out.print( " 4) Expressões que contenham um determinado numero de palavras\n");
        System.out.print( " 5) Expressões que não contenham uma determinada palavra\n");
        System.out.print( " 6) Listar expressoes\n");
        System.out.print( " 7) Verificar existencia\n");
        System.out.print( " 8) Voltar\n");
        int aux = entrada.nextInt();
        switch (aux) {
            case 1:
                System.out.printf("Insira uma palavra: ");
                aux1 = entrada.next();
                controller.consultaDeterminadaPalavra(aux1);
                menuConsulta();
                break;
            case 2:
                System.out.printf("Insira uma palavra: ");
                aux1 = entrada.next();
                controller.consultaLetraInicial(aux1);
                menuConsulta();
                break;
            case 3:
                System.out.printf("Insira uma palavra: ");
                aux1 = entrada.next();
                controller.consultaLetraFinal(aux1);                
                menuConsulta();
                break;
            case 4:
                System.out.printf("Insira um numero");
                int aux2 = entrada.nextInt();
                controller.consultaNumPalvara(aux2);
                menuConsulta();                
                break;
            case 5:
                System.out.printf("Insira uma palavra: ");
                aux1 = entrada.next();
                controller.consultaSemPalavra(aux1);                
                menuConsulta();
                break;
            case 6:          
                controller.listar();                
                menuConsulta();
                break;
            case 7:          
                System.out.printf("Insira uma expressao: ");
                aux1 = entrada.next();
                controller.verificar(aux1);                
                menuConsulta();
                break;
            case 8:
                menuVerificarUsuario();
                break;
            default:
                System.out.printf("Você digitou uma operação inválida.");        
        }
        
    }
    
    private void menuCrudExpressao(){
            String aux1;
            System.out.print( "Selecione o que deseja fazer:\n");
            System.out.print( " 1) Adicionar expressao\n");
            System.out.print( " 2) Excluir expressao\n");
            System.out.print( " 3) Alterar expressao\n");
            System.out.print( " 4) Verificar expressao \n");
            System.out.print( " 5) Listar expressoes\n");
            System.out.print( " 6) Voltar\n");
            int aux = entrada.nextInt();
            switch (aux) {
                case 1:
                    System.out.printf("Insira uma expressao: ");
                    aux1 = entrada.next();
                    controller.adicionar(aux1);
                    menuCrudExpressao();
                    break;
                case 2:
                    System.out.printf("Insira uma expressao: ");
                    aux1 = entrada.next();
                    controller.deletar(aux1);
                    menuCrudExpressao();
                    break;
                case 3:
                    System.out.printf("Insira a expressao: ");
                    aux1 = entrada.next();
                    System.out.printf("Insira a expressao corrigida");
                    String aux3 = entrada.next();
                    controller.alterar(aux1, aux3);
                    menuCrudExpressao();
                    break;
                case 4:
                    System.out.printf("Insira uma expressao: ");
                    aux1 = entrada.next();
                    controller.verificar(aux1);
                    menuCrudExpressao();
                    break;
                case 5:
                    controller.listar();                
                    menuCrudExpressao();
                    break;
                case 6:
                    menuVerificarUsuario();
                    break;
                default:
                    System.out.printf("Você digitou uma operação inválida.");        
            }
           
    } 

}
