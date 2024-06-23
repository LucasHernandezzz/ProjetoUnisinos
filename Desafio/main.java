import java.io.PrintStream;
import java.util.Scanner;
import java.nio.charset.StandardCharsets;
import java.io.*;

public class main {
    //Comando usado para printar no console utilizando acentuação.
    static PrintStream printStream = new PrintStream(System.out, true, StandardCharsets.UTF_8);
    //Iniciando scanner e utilizando ".useDelimiter" para mudar o delimitador padrão para tecla enter.
    static Scanner input = new Scanner(System.in).useDelimiter("\n");
    

    public static void main(String[] args) throws IOException  {
         String userChoice = "";
        
        //Utilizando While para utilização do menu principal da aplicação.
        while (!userChoice.equals("3")) {

            printStream.println("-------------------------------MENU------------------------------");
            printStream.println("1 - Criar loja.");
            printStream.println("2 - Criar Produto");
            printStream.println("3 - Encerrar programa.");
            printStream.println("------------------------------------------------------------------");
            //Utilizando Switch case para direcionar a função escolhida pelo usuário.
            userChoice = input.next();
            switch (userChoice) {
                case "1" -> criarLoja();
                case "2" -> criarProduto();
                case "3" -> printStream.println("Programa encerrado");
                default -> printStream.println("Digite novamente um número entre 1 e 3");
            }
        }
    }
    
    public static void criarLoja() {
    printStream.println("Digite o nome da loja:");
    String nome = input.next();

    printStream.println("Digite a quantidade de funcionários:");
    int quantidadeFuncionarios = input.nextInt();

    printStream.println("Digite o salário base dos funcionários:");
    double salarioBaseFuncionario = input.nextDouble();
    
    printStream.println("------------------------------------------------------------------");
    
    printStream.println("Agora digite o endereço");
    printStream.println("Digite a rua:");
    String nomeDaRua = input.next();
    printStream.println("Digite a cidade:");
    String cidade = input.next();
    printStream.println("Digite o estado:");
    String estado = input.next();
    printStream.println("Digite a pais:");
    String pais = input.next();
    printStream.println("Digite o cep:");
    String cep = input.next();
    printStream.println("Digite o numero:");
    String numero = input.next();
    printStream.println("Digite o complemento:");
    String complemento = input.next();
    Endereco endereconovo = new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento); //cria o endereco
    
    printStream.println("------------------------------------------------------------------");
    
    printStream.println("Agora digite a data de fundação");
    printStream.println("Digite o dia:");
    int dia = input.nextInt();
    printStream.println("Digite o mês:");
    int mes = input.nextInt();
    printStream.println("Digite o ano:");
    int ano = input.nextInt();
    Data dataFundacao = new Data(dia, mes, ano);
    
    printStream.println("Agora digite a capacidade");
    int capacidadeEstoque = input.nextInt();

    // Criar uma instância da classe Loja com as informações fornecidas pelo usuário
    Loja loja2 = new Loja (nome, quantidadeFuncionarios, salarioBaseFuncionario, endereconovo, dataFundacao, capacidadeEstoque);

    printStream.println("------------------------------------------------------------------");

    // informacoes da loja
    printStream.println("Nova loja criada com sucesso:");
    printStream.println("Nome da loja é: "+ nome.toString());
    printStream.println("QTD DE FUN é: "+ quantidadeFuncionarios);
    printStream.println("Salario base é: "+ salarioBaseFuncionario);
    printStream.println("Endereco é: "+ endereconovo.toString());
    printStream.println("data de fundação da loja é: "+ dataFundacao);
    }
    
    //produto
    public static void criarProduto() {
    printStream.println("Digite o nome do produto:");
    String nome = input.next();

    printStream.println("Digite o preço do produto:");
    double preco = input.nextDouble();

    printStream.println("------------------------------------------------------------------");

    printStream.println("Digite a data de validade do produto:");
    printStream.println("Digite o dia:");
    int dia = input.nextInt();
    printStream.println("Digite o mês:");
    int mes = input.nextInt();
    printStream.println("Digite o ano:");
    int ano = input.nextInt();
    Data dataValidade = new Data(dia, mes, ano);
     
    //criaproduto
    Produto produtonovo =  new Produto(nome, preco, dataValidade);
    
        if(dataValidade.getAno() > 2023) 
           printStream.println("Produto Vencido");
        else if(dataValidade.getAno() == 2023) 
             if(dataValidade.getMes() > 10) 
             printStream.println("Produto Vencido");  
             else if(dataValidade.getMes() == 10) 
                  if(dataValidade.getDia() >= 20)  
                     printStream.println("Produto Vencido");
        else   printStream.println("Produto não vencido");                  
                     
             
    
    printStream.println("Novo produto criado com sucesso:");
    printStream.println("Nome do produto é: "+ nome.toString());
    printStream.println("Preco é: "+ preco);
    printStream.println("Data de validade é: "+ dataValidade);
    }
}
