package fr.diginamic.dates;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

// TP17  DATES ET CALENDAR
public class TestCalendar  {

    public static void main(String[] args) throws Exception {

        Calendar cal = Calendar.getInstance();
        cal.set(116,4,19,23,59,30);

        Date date = cal.getTime();
        System.out.println(date);

        SimpleDateFormat formateur = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.US);
        System.out.println(formateur.format(new Date(2016, 4,19,23,59,30)));

        SimpleDateFormat formateur2 = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.FRANCE);
        System.out.println(formateur2.format(new Date(2016, 4,19,23,59,30)));

        SimpleDateFormat formateur3 = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.CHINA);
        System.out.println(formateur3.format(new Date(2016, 4,19,23,59,30)));

        SimpleDateFormat formateur4 = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.GERMAN);
        System.out.println(formateur4.format(new Date(2016, 4,19,23,59,30)));

        SimpleDateFormat formateur5 = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.forLanguageTag("ru"));
        System.out.println(formateur5.format(new Date(2016, 4,19,23,59,30)));

    }
}
