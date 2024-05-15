import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor bruto do salário: ");
        float valorBruto = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Digite o valor do adicional dos benefícios: ");
        float adicional = scanner.nextFloat();
        scanner.nextLine();

        float imposto = 0;

        if(valorBruto >= 0 && valorBruto <= 1100.0){
            imposto = 0.05f * valorBruto; 
        }else if(valorBruto >= 1100.0 && valorBruto <= 2500.0){
            imposto = 0.1f * valorBruto;
        }else if(valorBruto > 2500.0){
            imposto = 0.15f * valorBruto;
        }

        float salarioTransferido = (valorBruto - imposto) + adicional;

        System.out.println("O valor do salário a ser transferido para este funcionario é de R$:" + salarioTransferido);
    }
}
