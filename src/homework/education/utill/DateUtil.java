package homework.education.utill;

import java.text.SimpleDateFormat;
import java.util.Date;

public interface DateUtil {
    SimpleDateFormat s=new SimpleDateFormat("dd|MM|yyyy| HH:mm");


    static String printMyTime(Date date){
         return s.format(date);
    }


}
