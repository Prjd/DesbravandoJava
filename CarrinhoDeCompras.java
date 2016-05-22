/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudando;

import estudando.CalculadoraDeEstoque.Livro;

/**
 *
 * @author Lait
 */
public class CarrinhoDeCompras {
    private double total;
    
    public void adiciona(Livro livro){
        System.out.println("Adicionado: " + livro);
        livro.aplicaDescontoDe(0.05);
        total += livro.getValor();
    }
    public double getTotal(){
        return total;
    }
}
