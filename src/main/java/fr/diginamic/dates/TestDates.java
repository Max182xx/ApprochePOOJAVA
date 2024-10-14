package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

// TP17  DATES ET CALENDAR
public class TestDates {
    public static void main(String[] args) {

        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(date.format(new Date()));

        SimpleDateFormat formateur = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(formateur.format(new Date(116, 4, 19, 23, 59, 30)));

    }
}
