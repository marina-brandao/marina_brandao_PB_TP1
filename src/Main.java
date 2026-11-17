import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int opcao = 0;

            do{
                System.out.println("""
                
                ---- Menu - Acervo Biblioteca ----
                1- Cadastrar Livro
                2- Realizar empréstimo/reserva
                3- Calcular multa
                0- Sair
                """);

                opcao = scanner.nextInt();
                scanner.nextLine();

                switch(opcao) {
                    case 1:
                        System.out.println("Digite o titulo do livro");
                        String nomeLivro = scanner.nextLine();

                        System.out.println("Nome do autor");
                        String nomeAutor = scanner.nextLine();

                        System.out.println("Nome do ISBN");
                        String codISBN = scanner.nextLine();

                        System.out.println("\nCADASTRO OK\nLivro: " + nomeLivro + " | Nome do autor: " + nomeAutor + " | ISBN: " + codISBN);

                        break;

                    case 2:
                        System.out.println("Insira a quantidade de empréstimos ativos:");
                        int emprestimosAtivos = scanner.nextInt();

                        System.out.println("O livro encontra-se disponivel? (true/false):");
                        boolean statusLivro = scanner.nextBoolean();

                        if (statusLivro && emprestimosAtivos < 3){
                            System.out.println("Empréstimo concluido com sucesso! \n");
                        }

                        else if (!statusLivro){
                            System.out.println("O livro já se encontra emprestado, solicitação de reserva registrada\n");
                        }
                        else {
                            System.out.println("Numero máximo de empréstimos atingido - tente novamente após uma devolução\n");
                        }
                            break;

                    case 3:
                        System.out.println("Dias totais do empréstimo:");
                        int diasEmprestimo = scanner.nextInt();

                        int prazoPadrao = 14;
                        int diasAtraso = diasEmprestimo - prazoPadrao;

                        if (diasAtraso > 0){
                            double valorMulta = diasAtraso * 10.00;
                            System.out.println("Valor a pagar: R$ " + valorMulta + "\n");
                        }
                        else{
                            System.out.println("Devolução realizada dentro do prazo.\n");
                        }

                        break;

                    case 0:
                        System.out.println("Fim\n");
                        break;

                    default:
                        System.out.println("Opção Inválida\n");
                        break;

                }
            }while (opcao != 0);
        }
    }
