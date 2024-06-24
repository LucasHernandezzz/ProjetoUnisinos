// Importar as classes Endereco e Data, se necessário
public class Bijuteria extends Loja {
    private double metaVendas;

    // Construtor
    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int capacidadeEstoque, double metaVendas) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, capacidadeEstoque);
        this.metaVendas = metaVendas;
    }

    // Getters e Setters para taxaComercializacao
    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    // Sobrescrita do método toString para incluir a taxa de comercialização
    public String toString(){
        return "Nome é: " + getNome() + "a quantidade de funcionários é: " + getQuantidadeFuncionarios() + "e o salario base é: " + getSalarioBaseFuncionario() +
        "o endereço é " + getEndereco() + "e a data de fundação é" + getDataFundacao() + "a meta é " + getMetaVendas();
    }
}
