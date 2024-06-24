public class Informatica extends Loja {
    private double seguroEletronicos;

    // Construtor
    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int capacidadeEstoque, double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, capacidadeEstoque);
        this.seguroEletronicos = seguroEletronicos;
    }

    // Getters e Setters para taxaComercializacao
    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    // Sobrescrita do método toString para incluir o seguro
    public String toString(){
        return "Nome é: " + getNome() + "a quantidade de funcionários é: " + getQuantidadeFuncionarios() + "e o salario base é: " + getSalarioBaseFuncionario() +
        "o endereço é " + getEndereco() + "e a data de fundação é" + getDataFundacao() + "o seguro é " + getSeguroEletronicos();
    }
}
