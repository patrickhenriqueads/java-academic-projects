//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
        Scanner input =  new Scanner (System.in);

        double kWh;
        double ValorConta;

        kWh = input.nextDouble();

        if ( kWh <= 100 ) {

            ValorConta = kWh * 0.50;
            System.out.println( "O valor da sua conta de energia do mès é: " + ValorConta);

        } else if ( kWh <=200 ) {

            ValorConta = kWh * 0.70;
            System.out.println("O valor da sua conta de energia do mês é: " + ValorConta);

        } else {

            ValorConta= kWh * 0.90;
            System.out.println("O valor da sua conta de energia do mês é: " + ValorConta);

        }


}
