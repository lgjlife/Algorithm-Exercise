package utils;

public class TimeDelayUtil {

    public static   void delayMs(long ms){
        try{
            Thread.sleep(ms);
        }
        catch(Exception ex){ }
    }

}
