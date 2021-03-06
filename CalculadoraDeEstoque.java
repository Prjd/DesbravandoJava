/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudando;

/**
 *
 * @author Lait
 */
public class CalculadoraDeEstoque{ 
/*    public static void main(String[] args) {
    
    Livro livro = new Livro();
    
    livro.nome = "aaa";
    
    double soma = 0;
    
    for (double i = 0;i < 35;i++){
    soma += 59.90;
    }
    
    System.out.println("O Total em estoque é "+soma);
    
    if (soma < 150){
    System.out.println("Seu estoque está baixo");
    }else if (soma >= 2000) {
    System.out.println("Seu estoque está alto");
    }else {
    System.out.println("Seu estoque está bom");
    }
    System.out.println(livro.nome);
    } */   
    
//    public static void main(String[] args) {
//        Autor autor = new Autor();
//        autor.nome = "Rodrigo Turini";
//        autor.email = "123@gmail.com";
//        autor.cpf = "123.456.789.10";
//        
//        Livro livro = new Livro();
//        livro.nome = "Java 8 prático";
//        livro.des = "Novos recursos da linguagem";
//        livro.valor = 59.90;
//        livro.isbn = "978-85-66250-46-6";
//               
//        livro.autor = autor;
//        livro.mostrarDetalhes();
//
//    }
//    public static void main(String[] args) { // Regras de desconto
//        Autor autor = new Autor();
//        autor.setNome("Rodrigo Turini");
//        autor.setEmail("rogrido@caelum.com");
//        autor.setCpf("123.456.789.10");
//        
//        Livro livro = new Livro(autor);
//        livro.setNome("Java 8");
//        livro.setDes("Novos recursos");
//        livro.setValor(59.90);
//        
//
//        livro.mostrarDetalhes();
//
//    }
//    
//    public static void main(String[] args) {
//        Autor autor = new Autor();
//        autor.setNome("Rodrigo Turini");
//        
//        Livro livro = new Livro(autor);
//        livro.setValor(59.90);
//        
//        if (!livro.aplicaDescontoDe(0.3)){
//            System.out.println("Desconto no livro não pode ser maior do que 30%");
//        }else {
//            System.out.println("Valor do livro com desconto: "+livro.getValor());
//        }
//        Ebook ebook = new Ebook(autor);
//        ebook.setValor(29.90);
//        
//        if (!ebook.aplicaDescontoDe(0.15)){
//            System.out.println("Desconto no ebook não pode ser maior do que 15%");
//        }else {
//            System.out.println("Valor do ebook com desconto: "+ebook.getValor());
//        }
//        
//    }
    
    public static void main(String[] args){ // RegistroDeEventos
        Autor autor = new Autor();
        autor.setNome("Maurircio aniche");
        
        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test-Driven Development");
        fisico.setValor(59.90);
        
        Ebook ebook = new Ebook(autor);
        ebook.setNome("Test-Driven Development");
        ebook.setValor(29.90);
        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);
        
        System.out.println("Total "+ carrinho.getTotal());
    }
    
    public static class Livro {
        private String nome;
        private String des;
        protected double valor;
        private String isbn;
        private Autor autor;
        private boolean impresso;
        
        public Livro(Autor autor){
            this.autor = autor;
            this.isbn = "000-00-00000-00-0";
            this.impresso = true;
        }
        public Livro(){ 
            this.isbn = "000-00-00000-00-0";
        }
        public boolean aplicaDescontoDe(double porcetagem){
            if (porcetagem > 0.3){
                return false;
            }
            this.valor -= this.valor * porcetagem;
            return true;
        }        
        boolean temAutor() {
            return this.autor !=null;
        }
        public double getValor(){
            return valor;
        }
        public void setValor(double valor){
            this.valor = valor;
        }
        public String getNome(){
            return nome;
        }
        public void setNome(String nome){
            this.nome = nome;
        }
        public String getDes(){
            return des;
        }
        public void setDes (String des){
            this.des = des;
        }
        public String getIsbn(){
            return isbn;
        }
        public void setIsbn(String isbn){
            this.isbn = isbn;
        }
        public Autor getAutor(){
            return autor;
        }
        public void setAutor(Autor autor){
            this.autor = autor;
        }

        void mostrarDetalhes() {
            System.out.println("Mostrando detalhes do livro ");
            System.out.println("Nome: " + nome);
            System.out.println("Descrição: " + des);
            System.out.println("Valor: " + valor);
            System.out.println("ISBN: " + isbn);
            System.out.println("--");
            if (this.temAutor()){
                autor.mostrarDetalhes();
            }
            System.out.println("--");
        }
    }
}