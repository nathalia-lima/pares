import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int cont;
        cont = 0;
        for(int num1 = 1; num1 <= 5; num1++) {
            num = input.nextInt();
            if(num % 2 == 0) {
                cont++;
            }
        }
        System.out.println(cont + " valores pares");
    }
}