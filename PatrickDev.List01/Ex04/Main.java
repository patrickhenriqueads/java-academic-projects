//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int valor;
    int porcentagem;

    System.out.println("Quanto está o valor desse produto? ");
    Scanner input = new Scanner (System.in);
    valor = input.nextInt();

    porcentagem = valor * 10/100;

    System.out.println("Esse produto com 10% de desconto est-a saindo á " + porcentagem);


}
