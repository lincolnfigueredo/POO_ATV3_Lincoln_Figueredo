import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Cliente>listaClientes = new ArrayList<Cliente>();
        int idade, menu;
        menu = 0;
        String nome;

        //Menu Principal
        do {
            System.out.println("\n********************************************************");
            System.out.println("***** Bem vindo ao Sistema de cadastro de Clientes *****");
            System.out.println("********************************************************");
            System.out.println("1 - Cadastrar Cliente\n2 - Apagar Cliente\n3 - Modificar Cliente\n4 - Listar Clientes\n5 - Sair");
            Scanner scan = new Scanner(System.in);
            System.out.println("--------------------");
            System.out.println("-> Digite uma opção:");
            System.out.println("--------------------");
            menu = scan.nextInt();

            switch (menu) {
                //1 - Cadastrar Cliente
                case 1:
                Scanner scan1 = new Scanner(System.in);
                System.out.println("Informe o nome do cliente: ");
                nome = scan1.nextLine();

                Scanner scan2 = new Scanner(System.in);
                System.out.println("Informe a idade do cliente: ");
                idade = scan2.nextInt();

                System.out.println("***** Cliente [Nome: " + nome + ", Idade: " + idade + "] cadastrado! *****");
                Cliente cliente = new Cliente(nome, idade);
                listaClientes.add(cliente);
                break;

                //2 - Apagar Cliente
                case 2:
                Scanner scan3 = new Scanner(System.in);
                System.out.println("Informe o nome do cliente para exclusão: ");
                nome = scan3.nextLine();

                for (int i = 0; i < listaClientes.size(); i++) {
                    if (listaClientes.get(i).getNome().equals(nome)) {
                        listaClientes.remove(i);
                        System.out.println("***** Cliente [Nome: " + nome + "] excluído! *****");
                    }
                }
                break;

                //3 - Modificar Cliente
                case 3:
                int novaIdade, menuAlterar;
                String novoNome;
                Scanner scan4 = new Scanner(System.in);
                System.out.println("Infome o nome do cliente para alteração: ");
                nome = scan4.nextLine();

                for(int i = 0; i < listaClientes.size(); i++) {
                    if (listaClientes.get(i).getNome().equals(nome)) {
                        do {
                            System.out.println("1 - Nome\n2 - Idade\nInsira a opção correspondente ao que deseja alterar: ");
                            Scanner scan5 = new Scanner(System.in);
                            menuAlterar = 0;
                            menuAlterar = scan5.nextInt();

                            switch (menuAlterar) {
                                case 1:
                                Scanner scan6 = new Scanner(System.in);
                                System.out.println("Informe o novo nome do cliente: ");
                                novoNome = scan6.nextLine();
                                listaClientes.get(i).setNome(novoNome);
                                break;

                                case 2:
                                Scanner scan7 = new Scanner(System.in);
                                System.out.println("Infome a nova idade do cliente: ");
                                novaIdade = scan7.nextInt();
                                listaClientes.get(i).setIdade(novaIdade);
                                break;

                                default:
                                System.out.println("\n--------------------------------");
                                System.out.println("Opção inválida, tente novamente!");
                                System.out.println("--------------------------------");
                            }
                        }
                        while (menuAlterar != 1 && menuAlterar != 2);
                    }
                }
                System.out.println("***** Dados alterados com sucesso! *****");
                break;

                //4 - Listar Clientes
                case 4:
                System.out.println("\n------------------");
                System.out.println("Listando Clientes:");
                System.out.println("------------------");
                String lista = "";
                for (int i = 0; i < listaClientes.size(); i++) {
                    lista = i+1 + " - [Nome: " + listaClientes.get(i).getNome() + ", Idade: " + listaClientes.get(i).getIdade() + "]\n";
                    System.out.println(lista);
                }
                break;

                //5 - Sair
                case 5:
                System.out.println("\n-------------------");
                System.out.println("PROGRAMA ENCERRADO!");
                System.out.println("-------------------");
                break;

                default:
                System.out.println("\n--------------------------------");
                System.out.println("Opção inválida, tente novamente!");
                System.out.println("--------------------------------");
            }
        }
        while (menu != 5);
    }
}