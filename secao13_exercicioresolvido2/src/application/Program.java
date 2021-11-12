package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

    public static void main(String[] args) throws ParseException { // correção padrão para n dar erro na data na linha 18

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  // definindo um formato para a data

        Comment c1 = new Comment("Have a nice trip!");  // dando valor aos comentarios e instanciando eles como objetos
        Comment c2 = new Comment("Wow that's awesome!"); // dando valor aos comentarios e instanciando eles como objetos
        Post p1 = new Post(
                sdf.parse("21/06/2018 13:05:44"),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country!",  // criando o primeiro post e inserindo os dados
                12);
        p1.addComment(c1); // usando o metodo addComment da classe Post para associoar / add os comentarios ao post 1
        p1.addComment(c2); // usando o metodo addComment da classe Post para associar / add os comentarios ao post 1

        // com o add comment esta instanciando os comentarios ao post o objeto post esta apontando para os 2 comentarios

        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the Force be with you");
        Post p2 = new Post(
                sdf.parse("28/07/2018 23:14:19"),
                "Good night guys",
                "See you tomorrow",
                5);
        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p1);
        System.out.println(p2);
    }
}