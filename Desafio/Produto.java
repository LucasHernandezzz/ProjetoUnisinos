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
        //dataValidade       dataRecebida
        //dia/mes/ano          diaR/marR/anoR
        //12/05/2023               
        if(dataRecebida.getAno() > dataValidade.getAno()) //20/06/2022 
           return true;
        else if(dataRecebida.getAno() == dataValidade.getAno()) 
             if(dataRecebida.getMes() > dataValidade.getMes()) //20/04/2023
             return true;    
             else if(dataRecebida.getMes() == dataValidade.getMes()) 
                  if(dataRecebida.getDia() >= dataValidade.getDia())  //10/05/2023
                     return true;    
    
        return false;
    //20/06/2024   //12/06/2023 //20/05/2023 
    }
    
}
