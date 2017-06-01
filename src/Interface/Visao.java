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
                        System.out.print( "Senha errada.\n");
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
        System.out.print( " 2) Expressoes iniciadas por uma determinada letra\n");
        System.out.print( " 3) Expressoes terminadas por uma determinada letra\n");
        System.out.print( " 4) Expressões que contenham um determinado número de palavras\n");
        System.out.print( " 5) Expressões que não contenham uma determinada palavra\n");
        System.out.print( " 6) Listar expressões\n");
        System.out.print( " 7) Verificar existência\n");
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
                System.out.printf("Insira uma letra: ");
                aux1 = entrada.next();
                controller.consultaLetraInicial(aux1);
                menuConsulta();
                break;
            case 3:
                System.out.printf("Insira uma letra: ");
                aux1 = entrada.next();
                controller.consultaLetraFinal(aux1);                
                menuConsulta();
                break;
            case 4:
                System.out.printf("Insira um número: ");
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
                System.out.printf("Insira uma expressão: ");
                //fix entrada de opção
                entrada.nextLine();
                aux1 = entrada.nextLine();
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
            System.out.print( " 1) Adicionar expressão\n");
            System.out.print( " 2) Excluir expressão\n");
            System.out.print( " 3) Alterar expressão\n");
            System.out.print( " 4) Verificar expressão \n");
            System.out.print( " 5) Listar expressões\n");
            System.out.print( " 6) Voltar\n");
            int aux = entrada.nextInt();
            switch (aux) {
                case 1:
                    System.out.printf("Insira uma expressão: ");
                    //fix entrada de opção
                    entrada.nextLine();
                    aux1 = entrada.nextLine();
                    controller.adicionar(aux1);
                    menuCrudExpressao();
                    break;
                case 2:
                    System.out.printf("Insira uma expressão: ");
                    //fix entrada de opção
                    entrada.nextLine();
                    aux1 = entrada.nextLine();
                    controller.deletar(aux1);
                    menuCrudExpressao();
                    break;
                case 3:
                    System.out.printf("Insira a expressão: ");
                    //fix entrada de opção
                    entrada.nextLine();
                    aux1 = entrada.nextLine();
                    System.out.printf("Insira a expressão corrigida: ");
                    String aux3 = entrada.nextLine();
                    controller.alterar(aux1, aux3);
                    menuCrudExpressao();
                    break;
                case 4:
                    System.out.printf("Insira uma expressão: ");
                    //fix entrada de opção
                    entrada.nextLine();
                    aux1 = entrada.nextLine();
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
