public class Produto{
//atributos
  private String nome;
  private double preco;
  
  //construtores
  public Produto (String nome, double preco){
    this.nome = nome;
    this.preco = preco;
    }
    
  //getters e setters  
  public String getNome(){
        return nome;
    }
    
  public void setNome(String nome){
    this.nome = nome;
    }
  
  public double getPreco(){
    return preco;
    }
    
  public void setPreco(double preco){
    this.preco = preco;
    }  
    
  public void imprimeInformacoes(){
    System.out.println("Informações do produto:");
    System.out.println("\t- Nome: "+nome);
    System.out.println("\t- Preço: R$"+preco);
    }
}
