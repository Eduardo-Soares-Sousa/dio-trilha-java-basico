/**
 * <h1>Contador</h1>
 * O contador recebe dois parâmetros via terminal que representarão dois números inteiros, 
 * com estes dois números você deverá obter a quantidade de interações (for) e realizar a impressão no console dos números incrementados
 * 
 * @author Eduardo Soares de Sousa
 * @version 1.0
 * @since 14/05/2024
 */

import java.util.Scanner;

public class Contador {
    /**
     * Este método é o ponto de entrada para a execução do programa.
     * @param args Argumentos da linha de comando (opcional).
     */
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
        terminal.nextLine();

		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
        terminal.nextLine();

        try{
            
            contar(parametroUm, parametroDois);
        }catch(ParametrosInvalidosException exception){
            System.out.println(exception.getMessage());
        }
    }

    /**
    * Este método realiza uma operação que pode gerar uma exceção.
    * 
    * @param parametroUm O primeiro parâmetro da operação.
    * @param parametroDois O segundo parâmetro da operação.
    * @throws ParametrosInvalidosException Se os parâmetros forem inválidos.
    */
    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }else{
            int contagem = parametroDois - parametroUm;
            for(int i = 1; i <= contagem; i++){
                System.out.println("Imprimindo o número " + i);
            }
        }
    }
}
