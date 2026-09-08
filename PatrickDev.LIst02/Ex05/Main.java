import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        double grauCelsios;
        grauCelsios = input.nextDouble();

        System.out.println("Digite 1 para Fahrenheit ou 2 para Kelvin: ");

        double opcao = input.nextDouble();

        if ( opcao == 1 ) {

            System.out.println("Em Fahrenheit é: " + opcao);
            opcao = grauCelsios * 1.8 + 32;

        } else if ( opcao == 2 ){


            System.out.println("Em Kelvin é: " + opcao);
           opcao = grauCelsios * 273.15;

        }


    }
}