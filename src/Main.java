import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner vernome = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = vernome.nextLine();
        if (nome.equals ( "Arthur" )) {
            System.out.println("Voce é lindo"   );
            } else {
                System.out.println("Voce é feio");
            }

        Scanner veridade = new Scanner(System.in);
        System.out.println("Digite sua Idade: ");
        int idade = veridade.nextInt();
        if (idade >= 18) {
            System.out.println("Voce é maior de idade!!!");

        }else {
            System.out.println("Você é menor de idade!!!");
        }
       }
}