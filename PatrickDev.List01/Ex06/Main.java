import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salario;
        double porcentagem;
        double aumento;
        double novoSalario;

        System.out.print("Digite o salário atual: ");
        salario = input.nextDouble();

        System.out.print("Digite a porcentagem de aumento: ");
        porcentagem = input.nextDouble();

        aumento = salario * porcentagem / 100;
        novoSalario = salario + aumento;

        System.out.println("Valor do aumento: R$ " + aumento);
        System.out.println("Novo salário: R$ " + novoSalario);

        input.close();
    }
}
