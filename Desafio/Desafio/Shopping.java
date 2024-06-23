public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int capacidadeLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[capacidadeLojas];
    }

    // Métodos de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    //  toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Shopping [nome=").append(nome)
          .append(", endereco=").append(endereco)
          .append(", lojas=").append(lojas.length).append(" lojas]");
        return sb.toString();
    }

    // Inserir 
    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    // Remover loja
    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    //  contar lojas por tipo
    public int quantidadeLojasPorTipo(String tipoLoja) {
    int count = 0;  // Inicializa um contador
    for (Loja loja : lojas) {  // Itera sobre o array de lojas
        if (loja != null) {  // Verifica se a posição do array não é nula
            switch (tipoLoja) {
                case "Cosmético":
                    if (loja instanceof Cosmetico) {  // Verifica se a loja é do tipo Cosmetico
                        count++;
                    }
                    break;
                case "Vestuário":
                    if (loja instanceof Vestuario) {  // Verifica se a loja é do tipo Vestuario
                        count++;
                    }
                    break;
                case "Bijuteria":
                    if (loja instanceof Bijuteria) {  // Verifica se a loja é do tipo Bijuteria
                        count++;
                    }
                    break;
                case "Alimentação":
                    if (loja instanceof Alimentacao) {  // Verifica se a loja é do tipo Alimentacao
                        count++;
                    }
                    break;
                case "Informática":
                    if (loja instanceof Informatica) {  // Verifica se a loja é do tipo Informatica
                        count++;
                    }
                    break;
                default:
                    return -1;  // Retorna -1 se o tipo não for válido
            }
        }
    }
    return count;  // Retorna a quantidade de lojas do tipo especificado
}

    //  encontrar a loja de informática com o seguro mais caro
    public Informatica lojaSeguroMaisCaro() {
        double maiorValorSeguro = 0;  
        Informatica lojaSeguroMaisCaro = null;  

        for (Loja loja : lojas) { 
            if (loja instanceof Informatica) {  // Verifica se a loja é do tipo Informatica
                Informatica informatica = (Informatica) loja;  // Converte para o tipo Informatica
                if (informatica.getSeguroEletronicos() > maiorValorSeguro) {
                    maiorValorSeguro = informatica.getSeguroEletronicos();
                    lojaSeguroMaisCaro = informatica;
                }
            }
        }

        return lojaSeguroMaisCaro;  // Retorna a loja com o maior valor de seguro de eletrônicos
    }
}
