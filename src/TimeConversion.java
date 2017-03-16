

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion {

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        SimpleDateFormat twelveHourFormat = new SimpleDateFormat("hh:mm:ssa");
        SimpleDateFormat twentyFourHourFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = twelveHourFormat.parse(time);
        System.out.println(twentyFourHourFormat.format(date));
    }
}
