package hello;

import java.io.*;
import java.net.URL;

public class IPLocator {
    public String sayIP() throws IOException {
        URL url = new URL("http://checkip.amazonaws.com/");
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
        return br.readLine();
    }
}
