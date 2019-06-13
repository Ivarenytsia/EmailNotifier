package hello;


import javax.mail.MessagingException;
import java.io.IOException;


public class HelloWorld {
    private static String msg = "";
    private static String ip = "";

    public static void main(String[] args) throws MessagingException, IOException {
        ip = new IPLocator().sayIP();
        msg += "Time/Date of access: " + new Time().lDateTime();
        msg += "\n\nFull Info:\n" + new Splitter().toStringS(new GeoLoc().sayGEO(ip));


        GoogleMail mailG = new GoogleMail();
        mailG.Send("Sacrabear", "Ivan27051999v!", "Ivanvarenytsia@gmail.com", "", "Hello World", msg);
    }
}
