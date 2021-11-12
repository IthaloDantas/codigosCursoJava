package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy ");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss ");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss ");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT")); //Vai transformar de horario de grenwich

        Date x1 = new Date(); //Cria data com horario atual

        Date y1 = sdf1.parse("25/06/2018 ");
        Date y2 = sdf2.parse("25/06/2018 15:42:07 ");
        Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z")); // o Z significa que esta em formato UTC ou seja vai
                                                                    // mostrar o horario br pois a maquina pega o formato do pc

        System.out.println("y1 primeira forma: " + y1); //sem format fica mostrando o dia e o mes
        System.out.println("y1 forma com horario igual a segunda : " + sdf2.format(y1));
        System.out.println("y1 no horario de Grenwich : " + sdf3.format(y1));
        System.out.println("y2 : " + y2);
        System.out.println(); // dar espaço de 1 linha
        System.out.println("Data atual : " + x1);

        System.out.println("y3 : " + y3);
    }
}
