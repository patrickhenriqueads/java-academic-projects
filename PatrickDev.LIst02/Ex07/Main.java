import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        double ValorDaRenda = entrada.nextDouble();
        double ValorDaPrestaçãoMensal = entrada.nextDouble();
        double relaçao;
        relaçao = (ValorDaPrestaçãoMensal / ValorDaRenda) * 100;

        if (relaçao > 30 ) {
            System.out.println("Valor da parcela ultrapassa o teto limite da sua renda, tornando insegura, infelizmente" +
                    "seu Fianciamento foi repovrado");
        }else {
            System.out.println("Parabens \\uD83D\\uDE01 ❤\\uFE0F!! Seu Financiamento foi aprovado");
        }
    }
}