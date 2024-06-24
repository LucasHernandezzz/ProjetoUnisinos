// Importar as classes Endereco e Data, se necessário
public class Alimentacao extends Loja {
    private Data dataAlvara;

    // Construtor
    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara, int capacidadeEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, capacidadeEstoque);
        this.dataAlvara = dataAlvara;
    }

    // Getters e Setters para taxaComercializacao
    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    // Sobrescrita do método toString para incluir a taxa de comercialização
    public String toString(){
        return "Nome é: " + getNome() + "a quantidade de funcionários é: " + getQuantidadeFuncionarios() + "e o salario base é: " + getSalarioBaseFuncionario() +
        "o endereço é " + getEndereco() + "e a data de fundação é" + getDataFundacao() + "a data é " + getDataAlvara();
    }
}
