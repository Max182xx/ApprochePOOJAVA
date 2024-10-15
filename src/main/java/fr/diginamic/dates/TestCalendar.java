package fr.diginamic.dates;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

// TP17  DATES ET CALENDAR
public class TestCalendar  {

    public static void main(String[] args) throws Exception {

        Calendar cal = Calendar.getInstance();
        cal.set(2016,4,19,23,59,30);
        System.out.println(cal.getTime());
        Date date2016 = cal.getTime();

        String  pattern = "EEEE dd MMMM yyyy HH:mm:ss";
        SimpleDateFormat formateur = new SimpleDateFormat(pattern);
        System.out.println(formateur.format(date2016));

        Date dateJour = Calendar.getInstance().getTime();
        SimpleDateFormat formateurJourHeure = new SimpleDateFormat(pattern);
        System.out.println(formateurJourHeure.format(dateJour));

        SimpleDateFormat formateurJourHeureFR = new SimpleDateFormat(pattern);
        System.out.println(formateurJourHeureFR.format(dateJour));

        SimpleDateFormat formateurJourHeureCH = new SimpleDateFormat(pattern, Locale.CHINA);
        System.out.println(formateurJourHeureCH.format(dateJour));

        SimpleDateFormat formateurJourHeureAL = new SimpleDateFormat(pattern, Locale.GERMAN);
        System.out.println(formateurJourHeureAL.format(dateJour));

        SimpleDateFormat formateurJourHeureUR = new SimpleDateFormat(pattern, new Locale("ru"));
        System.out.println(formateurJourHeureUR.format(dateJour));

    }
}
