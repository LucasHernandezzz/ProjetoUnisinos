public class Cosmetico extends Loja {
    private double taxaComercializacao;

    // Construtor
    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int capacidadeEstoque, double taxaComercializacao) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, capacidadeEstoque);
        this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    // Sobrescrita do método toString para incluir a taxa de comercialização
    public String toString(){
        return "Nome é: " + getNome() + "a quantidade de funcionários é: " + getQuantidadeFuncionarios() + "e o salario base é: " + getSalarioBaseFuncionario() +
        "o endereço é " + getEndereco() + "e a data de fundação é" + getDataFundacao() + "a taxa é" + getTaxaComercializacao();
    }
}
