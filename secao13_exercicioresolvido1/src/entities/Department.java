package entities;

public class Department {
    private String name;

    public Department() {  // construtor vazio boa pratica
    }

    public Department(String name) {
        this.name = name;               // construtor com argumentos
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
