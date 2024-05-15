import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor bruto do salário: ");
        float valorBruto = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("\n");

        System.out.println("Digite o valor do adicional dos benefícios: ");
        float adicional = scanner.nextFloat();
        scanner.nextLine();

        float salarioTransferido = (valorBruto - calcularImposto(valorBruto)) + adicional;
        
        System.out.println("O valor do salário a ser transferido para este funcionario é de R$:" + String.format("%.2f", salarioTransferido));
    }
    
    public static float calcularImposto(float valorBruto){
        float imposto = 0;
        if(valorBruto >= 0 && valorBruto <= 1100.0){
            imposto = 0.05f * valorBruto; 
        }else if(valorBruto >= 1100.01 && valorBruto <= 2500.0){
            imposto = 0.1f * valorBruto;
        }else if(valorBruto > 2500.0){
            imposto = 0.15f * valorBruto;
        }

        return imposto;
    }
}
