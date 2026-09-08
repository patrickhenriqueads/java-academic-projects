//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
        Scanner input = new Scanner (System.in);

        int numero;
        double resultado1;
        double resultado2;

        numero = input.nextInt();

        if ( numero % 2 == 0 ) {

            System.out.println ("Seu número é Par");
            resultado1 = Math.pow(numero, 2);
            System.out.println("O quadrado do seu valor é " + resultado1);

        } else {

            System.out.println("Seu número é Ìmpar");
            resultado2 = Math.pow(numero, 3);
            System.out.println("O cubo do seu valor é " + resultado2);

        }


}
