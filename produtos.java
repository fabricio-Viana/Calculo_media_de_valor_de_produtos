
package entidades;

public class produtos {
    
    private String nome;
    private double preco;
    
    public produtos(){}
    public produtos(String nome, double preco)
    {
        this.nome = nome;
        this.preco = preco;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
   public void setPreco(double preco){
       this.preco = preco;
   
   }
    
    
}
