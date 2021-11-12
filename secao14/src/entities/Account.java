package entities;

public class Account {

    private Integer number;
    private String holder;
    protected Double balance; //

    public Account() { // construtor padrão
    }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;               // construtor com argumentos
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    // não tem o setter do balance pq n não se pode modificar o saldo da conta livremente

    public void withdraw(double amount) {
        balance -= amount;                  // metodo para retirada de dinheiro
    }

    public void deposit(double amount) {
        balance += amount;                  // metodo para depositar dinheiro no banco add saldo
    }
}