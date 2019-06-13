package hello;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;


public class GeoLoc {
    public String sayGEO(String ip) throws IOException {
        //Enter your API key instead of @@@@@.
        //You can get the key at https://app.ipgeolocation.io
        String url = "https://api.ipgeolocation.io/ipgeo?apiKey=c69e02c5020842de8d3e4540603a09c0&ip=" + @@@@@ +
                "&fields=continent_name,country_name,city,district,zipcode,latitude,longitude";
        String address = (new BufferedReader(new InputStreamReader((new URL(url)).openStream()))).readLine();
        return address;
    }
}
