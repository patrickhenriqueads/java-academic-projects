import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero1;
        int numero2;
        int numero3;

        numero1 = input.nextInt();
        numero2 = input.nextInt();
        numero3 = input.nextInt();

        if (numero1 >= numero2 && numero1 >= numero3) {

            System.out.println("O numero maior será : " + numero1);

        } else if (numero2 >= numero3) {

            System.out.println("O numero maior será : " + numero2);

        } else {

            System.out.println("O numero maior será: " + numero3);
        }


    }
}