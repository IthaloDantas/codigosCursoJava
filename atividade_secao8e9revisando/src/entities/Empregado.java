package entities;

public class Empregado {

    public String name;
    public  double salariobruto;
    public double taxa;

    public double descontodataxa(){
        return salariobruto - taxa;
    }

    public void salariocomporcentagem(double porcentagem){
        salariobruto += salariobruto * porcentagem /100;
    }

    public String toString(){
        return "Updated data : " + name + ",  $ " + String.format("%.2f" , descontodataxa());
    }


}
