//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int A;
    int B;
    int temp;

    Scanner input = new Scanner (System.in);
        A = input.nextInt();
        B = input.nextInt();

        temp = A;
        A = B;
        B = temp;

        System.out.println("Os valores de A e B invertidos são" +
                " A = " +  A + " B = "+ B);




    }

