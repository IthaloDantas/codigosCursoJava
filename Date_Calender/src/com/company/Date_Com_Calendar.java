package com.company;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Date_Com_Calendar {
    public static void main(String[] args) {


        // Somando uma unidade de tempo

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss ");

        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf.format(d)); // esta no horario de sp brasil

        Calendar cal = Calendar.getInstance();

        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY,4);

        d = cal.getTime();

        System.out.println(sdf.format(d));

        // ----------------------------------------------------------
        // Obtendo uma unidade de tempo

        int minutes = cal.get(Calendar.MINUTE); // pega os minutos da data
        System.out.println("Minutes : " + minutes);

        int month = 1 + cal.get(Calendar.MONTH); // pega o mes para o calender começa com o mes 0 por isso o + 1
        System.out.println("Month : " + month);
    }
}
