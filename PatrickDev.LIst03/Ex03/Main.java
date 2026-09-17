//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    System.out.println("Numeros pares de 1 a 20:");

    /* AVANÇANDO DE DOIS EM DOIS

    for (int i = 2; i <= 20; i+=2)
System.out.println("Numero: " + i);
         */

   //LAÇO MAIS CONDICIONAL SIMPLES//

        int i = 1;

        while ( i <= 20){

            if ( i % 2 == 0){
                System.out.println("numero:" + i);
            }
            i++;
        }

}
