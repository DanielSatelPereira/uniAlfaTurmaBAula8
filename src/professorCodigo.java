import java.util.Scanner;

public class professorCodigo {
    private static String nome = "";
    private static int idade = 0;
    private static int valorDoado = 0;

    public static void main(String[] args) {
        System.out.println("Little Tiger");
        Scanner objetoScan = new Scanner(System.in);
        int opcaoMenu = 0;
        realizarDoação();
        do {
            System.out.println("""
                    1- adicionar Cliente
                    2- Exibir os Dados do cliente 
                    3- Alterar os Dados do cliente 
                    4- Remover cliente 
                    5- Realizar Doação 
                    6- Sair
                    
                    """);
            if (opcaoMenu == 1) {
                adicionarCliente();
            } else if(opcaoMenu == 2) {
                exibirDados();
            } else {(opcaoMenu == 3) {
                alterarCliente();
            } else {(opcaoMenu == 4) {
                removerCliente();
            } else {(opcaoMenu == 5) {
                realziarDoacao();
            }  else {(opcaoMenu == 6) {


        } while (opcaoMenu != 6)
    }

    private static void adicionarCliente() {
        Scanner objetoScan = new Scanner(System.in);
        System.out.println("Informe seu nome : ");
        nome = objetoScan.nextLine();
        System.out.println("Informe a idade : ");
        idade = objetoScan.nextInt();

        validarIdade();
    }

    private static void exibirDados() {
        System.out.println("Nome do cliente : " + nome);
        System.out.println("Idade do cliente : " + idade);
        System.out.println("Valor doado pelo cliente: " + valorDoado);
    }

    private static void validarIdade() {
        if (idade < 18) {
            System.out.println("Este cliente é menor de idade, cadastro cancelado.");
            removerCliente();
        }
    }

    private static void removerCliente() {
        nome = "";
        idade = 0;
        valorDoado = 0;
        System.out.println(mensagem);
    }

    private static void alterarCliente() {
        if (idade > 17) {
            System.out.println("Alterando os dados do cliente : " + nome);
            adicionarCliente();
            System.out.println("Cliente alterado com sucesso!");
            exibirDados();
        } else {
            System.out.println("Não tem cliente cadastrado aidna.");
        }
    }

    private static void realizarDoação() {
        if (idade == 0) {
            Scanner objetoScan = new Scanner(System.in);
            System.out.println("Informe o valor(número inteiro) da doação : ");
            valorDoado = valorDoado + objetoScan.nextInt();
            System.out.println("O saldo doado do cliente" + nome + " é : " + valorDoado);
        } else {
            System.out.println("Não existe cliente cadastrado ainda.");
        }
    }
}