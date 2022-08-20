package br.edu.fatecfranca.lista1;

public class Produto {
    public String nome;
    public int qtde;
    public double preco;
    
    public Produto(){
        
    }
    public Produto(String nome, int qtde, double preco) {
        this.nome = nome;
        this.qtde = qtde;
        this.preco = preco;
    }
    
    public void comprar(int x){
        this.qtde = this.qtde + x;
    }
    
    public void vender(int x){
        if(x <= qtde) {
            this.qtde = this.qtde - x;
        }     
        else System.out.println("Sem estoque");
    }  
    
    public void mostrar() {
             System.out.println(" Nome: " + this.nome + " Qtde: " + this.qtde + " Preço: " + this.preco);              
    }
    
    public void altera_preco_maior(double x) {
        this.preco =+ x;
    }
    
    public void altera_preco_menor (double x) {
        if (x < this.preco){
             this.preco -= x;
        }
        else System.out.println("Não permite valor negativo");
        }    
}
