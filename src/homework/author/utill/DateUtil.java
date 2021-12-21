package homework.author.utill;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    SimpleDateFormat s=new SimpleDateFormat("dd|MM|yyyy| HH:mm");


  public   String printMyTime(Date date){
         return s.format(date);
    }


}
