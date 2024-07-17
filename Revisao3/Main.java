package Revisao3;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro(5);
       livro.setNome("O menino que roubava livros");
        
        System.out.println(livro.getNome());
        System.out.println("Total de Capitulos: " + livro.getCapitulos().length);
    
        System.out.println("Titulo do primeiro capitulo: " + livro.getTituloCapitulo(3));
        System.out.println("#################################");
        System.out.println(livro.getTitulosCapitulos());
      }
      
}
