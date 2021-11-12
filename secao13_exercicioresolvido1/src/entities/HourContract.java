package entities;

import java.util.Date;

public class HourContract {  // hour contract é igual a contrato de hora

    private Date date;
    private Double valuePerHour;
    private Integer hours;

    public HourContract() {  // construtor vazio
    }

    public HourContract(Date date, Double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;           // construtor com argumentos
        this.hours = hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {    // getters e setters
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public double totalValue() {
        return valuePerHour * hours;   // metodo para calcular o valor de horas do contrato
    }
}