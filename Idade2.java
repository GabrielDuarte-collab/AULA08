import java.util.Scanner;
public class Idade2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Quantas vezes você quer verificar: ");
        int quantidade = sc.nextInt();

        for(int controle = 0; controle < quantidade; controle++) {
            System.out.print("Insira a idade da" + (controle +1) + "pessoa:");
            int idade = sc.nextInt();

            if (idade >= 60 ) {
            System.out.println("Essa pessoa e idosa!");
        } else if (idade >= 18) {
            System.out.println("Essa pessoa e maior de idade!");
        } else if (idade < 0) {
            System.out.println("Esse valor é invalido!");
        } else {
            System.out.println("Essa pessoa é menor de idade!");
        }
        }

        
       sc.close();
    }
}