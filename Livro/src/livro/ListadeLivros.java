
package livro;

import javax.swing.JOptionPane;

public class ListadeLivros {
        
    public static void main(String[] args) {
            int ncads =0;
            ncads = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de livros de Livraria a  serem cadastrados"));   
        Livro[] livros;
        livros = new Livro[ncads];
        for (int i = 0; i<=ncads; i++){
           LivrodeLivraria l =new LivrodeLivraria();
            l.Autor = JOptionPane.showInputDialog("Informe o Autor");
            l.Editora = JOptionPane.showInputDialog("Informe a Editora");
            l.ISBN = JOptionPane.showInputDialog("Informe o ISBN");
            l.NumPage = Integer.parseInt(JOptionPane.showInputDialog("Informe o Número de Páginas"));
            l.Titulo = JOptionPane.showInputDialog("Informe o Titulo");
            l.Valor = Float.parseFloat(JOptionPane.showInputDialog("Informe o Valor do Livro"));
            livros[i]=l;
        }
            int ncads1 =0;    
            ncads1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de livros Biblioteca a  serem cadastrados"));   
        Livro[] livros1; 
        livros1= new Livro[ncads1];
        for (int i = 0; i<=ncads1; i++){
            LivrodeBiblioteca l = new LivrodeBiblioteca();
            l.Autor = JOptionPane.showInputDialog("Informe o Autor");
            l.Editora = JOptionPane.showInputDialog("Informe a Editora");
            l.ISBN = JOptionPane.showInputDialog("Informe o ISBN");
            l.NumPage = Integer.parseInt(JOptionPane.showInputDialog("Informe o Número de Páginas"));
            l.Titulo = JOptionPane.showInputDialog("Informe o Titulo");
            l.QtdExemplares = Integer.parseInt(JOptionPane.showInputDialog("Informe a Quantidade de Exemplares"));
            livros1[i] = l;
        }
        for (int i = 0; i<=ncads1; i++) {
         JOptionPane.showMessageDialog("Autor: "+livros1[ncads1].Autor+" Editora: "+livros1[ncads1].Editora+" ISBN: "+livros1[ncads1].ISBN+" Titulo: "+livros1[ncads1].Titulo+"\n");
        }

            
        }
        }
   


    
