package entities;

public class Comment {

    private String text;

    public Comment() { // construtor vazio
    }

    public Comment(String text) {
        this.text = text;       // construtor argumentos
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}