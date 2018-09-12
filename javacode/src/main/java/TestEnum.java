
import java.util.Calendar;
import java.util.Date;

public class TestEnum {
    public static void main(String[] args){
        change();
        Calendar cal=Calendar.getInstance();
        Date date=cal.getTime();
        System.out.println(date);
        //cal.clear();
        cal.setTime(new Date());
        int day=cal.get(Calendar.DATE);
        int month=cal.get(Calendar.MONTH)+1;
        System.out.println(day+"---"+month+"---"+cal.get(Calendar.DAY_OF_MONTH));
    }

    public static void change(){
        Color color=Color.getColor(2);
        switch (color){
            case blue:
                System.out.println("蓝");
                break;
            case green:
                System.out.println("绿");
                break;
            case yellow:
                System.out.println("黄");
                break;
            default:
                System.out.println("no color");

        }
        System.out.println(color.name());
    }



}
