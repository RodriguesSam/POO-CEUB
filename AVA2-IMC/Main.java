import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o peso: ");
        double peso = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Digite a altura: ");
        double altura = scanner.nextDouble();

        Pessoa pessoa1 = new Pessoa(nome, peso, altura);
        pessoa1.mostrarImcPessoa();
        scanner.close();
    }
}
