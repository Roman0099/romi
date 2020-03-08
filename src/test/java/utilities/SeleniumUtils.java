package utilities;

public class SeleniumUtils {
    public static void pause(int seconds){

        //PAUSE CODE
        try{
            Thread.sleep(seconds*1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }


}

