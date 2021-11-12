package entities;

public class Triangle {

    public  double a;
    public  double b;             // classe para ser usada no problema POO
    public  double c;


    public double area(){
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));    /* Ou pode ser double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                                                                                      return result;            */


    }

}


