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

        /*
        *From - here goes the string of your gmail inbox, add it without @gmail.com
        *Password - your password as a string
        *To - recipient's email, this time with @gmail.com
        *CC - Who needs this anyways
        *Title - title of your email
        *Message - content of the email
        */
        GoogleMail mailG = new GoogleMail();
        mailG.Send("From", "Password", "To", "CC", "Title", "Message");
    }
}
