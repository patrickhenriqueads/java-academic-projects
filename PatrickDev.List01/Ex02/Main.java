//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int numero1;
    int numero2;
    int numero3;
    int resultado;
    double media;

    System.out.println("Escolha 3 numeros, para soma e media:");

    Scanner input = new Scanner(System.in);
    numero1 = input.nextInt();
    numero2 = input.nextInt();
    numero3 = input.nextInt();

    resultado = numero1 + numero2 + numero3;
    media = resultado / 3.0;

    System.out.println (resultado);
    System.out.println (media);

}
