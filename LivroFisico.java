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
public class LivroFisico extends Livro{
    public LivroFisico(Autor autor){
        super(autor);
    }
    public double getTaxaImpressao(){
        return this.getValor() * 0.05;
    }
}
