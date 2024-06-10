package src.lesson5;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static final String REGX = "А.+?а";

    public static void main(String[] args) {
//        String text = "Рома Алла Анна Людмила Александра";
//
//        Pattern pattern = Pattern.compile(REGX);
////        boolean matches = Pattern.matches(REGX, text);
////        System.out.printf(String.valueOf(matches));
//        Matcher matcher = pattern.matcher(text);
//
//        System.out.println(matcher.find());

        Calendar calendar = new GregorianCalendar();
        calendar.add(Calendar.HOUR, -10);
        Date time = calendar.getTime();
        System.out.println(time);


    }





}
