//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

void main() {
        int anos;
        int  meses;

        System.out.println("Quantos anos você tem?");
        Scanner input = new Scanner (System.in);
        anos = input.nextInt ();

        meses = anos * 12;

        System.out.print("Sua idade em meses é " + meses);
}
