//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    System.out.println("Digite um valor numerico inteiro:");
    Scanner input = new Scanner(System.in);
    int i = 1;
    int N = input.nextInt();



    if (N <= 0) {
        System.out.println("Erro: Digite um Numero Inteiro maior que zero");
    } else {
        while (i <= N) {

            System.out.println("Praticando lógica de programação");
            i++;
        }
    }
}
