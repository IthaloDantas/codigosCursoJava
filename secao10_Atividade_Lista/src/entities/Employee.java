package entities;

public class Employee {

    private Integer id;
    private String name;
    private Double salary;

    public Employee(){
        //É considerado uma boa prática a criação do construtor vazio, este construtor vazio é utilizado por alguns
        // frameworks em sua aplicação. Então este construtor vazio será consumido por este framework. Nas salas de aula
        // já vi muitos professores utilizarem, porém creio que eles estão acostumados tanto com este construtor vazio
        // que acabe passando despercebido a utilização dele.
    }

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Double getSalary() {

        return salary;
    }

    public void setSalary(Double salary) {

        this.salary = salary;
    }

    public void increaseSalary(double percentage){
        salary = salary + salary * percentage/100.0; // não precisa this.salary pq o java ja entende que esta acessando um membro da classe
    }

    public String toString(){
        return id + "," + name + "," + String.format("%.2f" , salary);
    }
}
