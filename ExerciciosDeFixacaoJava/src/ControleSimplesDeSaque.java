import java.util.Scanner;

public class ControleSimplesDeSaque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        double limiteDiario = scanner.nextDouble();
        scanner.nextLine();

        for(;;){
            double saque = scanner.nextDouble();
            scanner.nextLine();

            if(saque == 0){
                System.out.println("Transacoes encerradas.");
                break;
            }else if(saque > limiteDiario){
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }else{
                limiteDiario -= saque;
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            }
        }

        scanner.close(); 
    }    
}
