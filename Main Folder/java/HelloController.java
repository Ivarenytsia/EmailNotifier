package hello;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.Map;

@RestController
public class HelloController {

    @RequestMapping("/hi/{name}")
    public String hi(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @RequestMapping("/bye/{name}")
    public String bye(@PathVariable String name) {
        return "Goodbye, " + name + ".";
    }

    @RequestMapping("/time")
    public String time() {
       Time currentFull = new Time();
        return currentFull.lDate();
    }

    @RequestMapping("/ip")
    public String ip() throws IOException {
        IPLocator myIP = new IPLocator();
        return "\nYour ip: " + myIP.sayIP() + "\n\n";
    }

   @RequestMapping("/location")
    public String loc() throws IOException {
        String tempLoc = (new GeoLoc()).sayGEO((new IPLocator().sayIP()));

        Map<String, String> myMap = (new Splitter()).split(tempLoc);

        String trimLoc = "";
        for (String x : myMap.keySet()) {
            trimLoc += "\n" + x + " : " + myMap.get(x);
        }
        System.out.println(trimLoc);
        return trimLoc;
    }

    @RequestMapping("/")
    public String whitelabel() {
        return "THIS IS NOT AN ERROR";
    }
}