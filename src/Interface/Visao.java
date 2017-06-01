/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;


import Controller.ExpressaoController;
import java.util.Scanner;

public class Visao {
    private Scanner entrada = new Scanner(System.in);
    private ExpressaoController controller = new ExpressaoController();
    private int aux;
    public  void main(String[] args) {
        System.out.print( "-------------------------------\n");
        Visao  v = new Visao();
        v.menuVerificarUsuario();
    }
    
    private void menuVerificarUsuario(){
        System.out.print( "-------------------------------\n");        
        System.out.print( "Selecione o tipo do utilizador:\n");
        System.out.print( " 1) Administrador \n");
        System.out.print( " 2) Consultas \n");
        int aux = entrada.nextInt();
        switch (aux) {
            case 1:
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
        System.out.print( "-------------------------------\n");
        System.out.print( "Selecione o tipo de consulta:\n");
        System.out.print( " 1) Expressões que contenham uma determinada palavra\n");
        System.out.print( " 2) Expressoes Iniciadas por uma determinada letra\n");
        System.out.print( " 3) Expressoes terminadas por uma determinada letra\n");
        System.out.print( " 4) Expressões que contenham um determinado numero de palavras\n");
        System.out.print( " 5) Expressões que não contenham uma determinada palavra\n");
        System.out.print( " 6) Voltar\n");
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
                menuVerificarUsuario();
                break;
            default:
                System.out.printf("Você digitou uma operação inválida.");        
        }
        
    }
    
    private void menuCrudExpressao(){
        String aux1;
        System.out.print( "-------------------------------\n");
        System.out.print( "Entre com a senha:\n");
        int aux2 = entrada.nextInt();
        if (aux2 != 1234){
            System.out.print( "Senha errada\n");
            menuVerificarUsuario();
        }
        
        else{
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

}
