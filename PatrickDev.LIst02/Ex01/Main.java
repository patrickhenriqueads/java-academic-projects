//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int idade;

    Scanner input = new Scanner (System.in);
        idade = input.nextInt();

     if ( idade <= 12 ) {
         System.out.println("Sua categoria será: Infantil" );
     } else if (idade <= 17) {
         System.out.println("Sua categoria será: Juvenil");
     } else {
         System.out.println("Sua categoria será: Adulto");
     }



}
