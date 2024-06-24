public class Produto{
//atributos
  private String nome;
  private double preco;
  private Data dataValidade;
  
  //construtores
  public Produto (String nome, double preco, Data dataValidade){
    this.nome = nome;
    this.preco = preco;
    this.dataValidade = dataValidade; 
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
    
  public Data getDataValidade(){
    return dataValidade;
    }
    
  public void setDataValidade(Data dataValidade){
    this.dataValidade = dataValidade;
    }
      
  public void imprimeInformacoes(){
    System.out.println("Informações do produto:");
    System.out.println("\t- Nome: "+nome);
    System.out.println("\t- Preço: R$"+preco);
    System.out.println("\t- Data de validade: "+dataValidade);
    }
    
  public boolean estaVencido(Data dataRecebida){
                     
        if(dataRecebida.getAno() > dataValidade.getAno()) 
           return true;
        else if(dataRecebida.getAno() == dataValidade.getAno()) 
             if(dataRecebida.getMes() > dataValidade.getMes()) 
             return true;    
             else if(dataRecebida.getMes() == dataValidade.getMes()) 
                  if(dataRecebida.getDia() >= dataValidade.getDia())  
                     return true;    
    
        return false;
    }
    
}
