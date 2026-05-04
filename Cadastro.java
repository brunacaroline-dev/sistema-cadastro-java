import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] nomes = new String[10];
        int[] idades = new int[10];

        int contador = 0;
        int opcao;

        do {
            System.out.println("\n=== SISTEMA DE CADASTRO ===");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Listar usuários");
            System.out.println("3 - Sair");
            System.out.println("4 - Buscar usuário");

            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();
            input.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    if (contador < 10) {
                        System.out.print("Digite o nome: ");
                        nomes[contador] = input.nextLine();

                        System.out.print("Digite a idade: ");
                        idades[contador] = input.nextInt();
                        input.nextLine();

                        contador++;
                        System.out.println("Usuário cadastrado com sucesso!");
                    } else {
                        System.out.println("Limite de usuários atingido!");
                    }
                    break;

                case 2:
                    System.out.println("\n=== USUÁRIOS CADASTRADOS ===");
                    for (int i = 0; i < contador; i++) {
                        System.out.println("Nome: " + nomes[i] + " | Idade: " + idades[i]);
                    }
                    break;

                case 3:
                        System.out.println("Saindo...");
                    break;

                case 4:
                    System.out.print("Digite o nome para buscar: ");
                    String busca = input.nextLine();

                    boolean encontrado = false;
                    
                for (int i = 0; i < contador; i++) {
               if (nomes[i].equalsIgnoreCase(busca)) {
                   System.out.println("Encontrado!");
                   System.out.println("Nome: " + nomes[i] + " | Idade: " + idades[i]);
                   encontrado = true;
                    break;
                }
                }

                if (!encontrado) {
                   System.out.println("Usuário não encontrado.");
             }
                    break;    

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 3);
    }
}