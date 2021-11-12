package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // Criou em uma classe para n precisar criar uma sdf para cada Post

    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    // criando a associação :
    private List<Comment> comments = new ArrayList<>(); // criando uma associação e instanciando a lista para colocar os posts

    public Post() {
    }  // construtor vazio

    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;                                  // construtor com argumentos lembrando n se coloca a lista
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    // lembrando que a lista n pode ter o metodo set vai ser criado outro metodo para substituir que é os 2 primeiros a baixo

    public void addComment(Comment comment) {
        comments.add(comment);              // adicionar comentario
    }

    public void removeComment(Comment comment) {
        comments.remove(comment);                   // removendo comentario
    }

    public String toString() {  // criando um toString usando a classe StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n"); // append significa acrescentar no final
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(moment) + "\n"); //so vai pular a linha se colocar a quebra de linha
        sb.append(content + "\n");
        sb.append("Comments:\n");
        for (Comment c : comments) { // criando um foreach = para cada , para percorrer a lista for (tipo variavel_do_tipo_do_seuArray: seuArray)

            sb.append(c.getText() + "\n"); //
        }
        return sb.toString();
    }
}