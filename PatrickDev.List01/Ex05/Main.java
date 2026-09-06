//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite seu peso (em kg): ");
    double peso = input.nextDouble();

    System.out.print("Digite sua altura (em metros): ");
    double altura = input.nextDouble();

    double imc = peso / (altura * altura);

    System.out.println("O valor do seu IMC é: " + imc);

    input.close();
}


