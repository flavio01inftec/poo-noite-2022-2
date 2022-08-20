package br.edu.fatecfranca.lista1.exe0;

import br.edu.fatecfranca.lista1.Produto;

public class Lista1 {

    public static void main(String[] args) {
        
        //criar objetos da classe Produto
        //criar instâncias da classe Produto
        
        Produto obj1 = new Produto ();
                obj1.nome = "Máscara";
                obj1.qtde = 100;
                obj1.preco = 5; 
                
                obj1.comprar(10);
                obj1.vender(2);               
                obj1.altera_preco_maior(5.99);
                obj1.altera_preco_menor(2.25);
                obj1.mostrar();
                             
                //vamos instanviar explorando o metodo construtor
                //metodo que tem o mesmo nome da classe
                //metodo que inicializa as variaveis da classe
                
                Produto obj2 = new Produto ("Bola de basquete", 10, 93.90); 
                obj2.comprar(3);
                obj2.vender(2);
                obj1.altera_preco_maior(5.99);
                obj1.altera_preco_menor(2.25);
                obj2.mostrar();
                               
                Produto obj3 = new Produto ("Fortnite", 1, 39.90);   
                obj3.comprar(1);  
                obj3.vender(15);
                obj1.altera_preco_maior(5.99);
                obj1.altera_preco_menor(325.25);
                obj3.mostrar();            
    }
}
