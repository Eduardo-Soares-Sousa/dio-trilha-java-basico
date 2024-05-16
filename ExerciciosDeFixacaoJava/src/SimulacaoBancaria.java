import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double saldo = 0;
        
        boolean sair = false;
        while(sair != true){
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao){
                case 1:
                    double depositar = scanner.nextDouble();
                    scanner.nextLine();

                    saldo += depositar;
                    System.out.println("Saldo atual: " + String.format("%.1f", saldo)); 
                    break;

                case 2:
                    double sacar = scanner.nextDouble();
                    scanner.nextLine();

                    if(sacar < saldo){
                        saldo -= sacar;
                        System.out.println("Saldo atual: " + String.format("%.1f", saldo)); 
                    }else{
                        System.out.println("Saldo insuficiente.");
                    }
                    break;

                case 3:
                    System.out.println("Saldo atual: " + String.format("%.1f", saldo));
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    sair = true;
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
