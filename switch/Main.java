import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcao;

        Scanner input = new Scanner(System.in);

        System.out.print("1 - Pastel de carne\n");
        System.out.print("2 - Coxinha de frango\n");
        System.out.println("3 - Kibe de queijo\n");

        System.out.print("Escolha uma opção: ");
        opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Pastel de carne adicionado ao carrinho!");
                break;
            case 2:
                System.out.println("Coxinha de frango adicionado ao carrinho!");
                break;
            case 3:
                System.out.println("Kibe de queijo adicionado ao carrinho!");
                break;
            case 4:
                System.out.println("Compra finalizada! Itens comprados:");
            default:
                System.out.println("Opção inválida!");
                break;
        }
        input.close();
    }
}
