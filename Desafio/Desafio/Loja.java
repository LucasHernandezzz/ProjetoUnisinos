public class Loja {
    // Atributos
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco; // associação classe Endereco
    private Data dataFundacao; // associação classe Data
    private Produto[] estoqueProdutos;

    // Construtores
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int capacidadeEstoque) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[capacidadeEstoque];
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int capacidadeEstoque) {
        this(nome, quantidadeFuncionarios, -1, endereco, dataFundacao, capacidadeEstoque);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }
    


    // toString
    public String toString() {
        return "Nome: " + getNome() +
               ", Quantidade de Funcionários: " + getQuantidadeFuncionarios() +
               ", Salário Base: " + getSalarioBaseFuncionario() +
               ", Endereço: " + getEndereco() +
               ", Data de Fundação: " + getDataFundacao();
    }

    // Gasto da loja com o salário
    public double gastosComSalario() {
        if (salarioBaseFuncionario == -1) {
            return -1; // Não é possível calcular
        } else {
            return quantidadeFuncionarios * salarioBaseFuncionario;
        }
    }

    public char tamanhoDaLoja() {
        if (quantidadeFuncionarios < 10) {
            return 'P';
        } else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30) {
            return 'M';
        } else {
            return 'G';
        }
    }

    // Métodos adicionais
    public void imprimeProdutos() {
        for (Produto produto : estoqueProdutos) {
            if (produto != null) {
                System.out.println(produto);
            }
        }
    }

    public boolean insereProduto(Produto produto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = produto;
                return true;
            }
        }
        return false;
    }

    public boolean removeProduto(String nomeProduto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)) {
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }
}
