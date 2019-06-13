package hello;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Splitter {
    private ArrayList<String> list = new ArrayList();
    private Map<String, String> map = new HashMap<>();
    private int count = 0;
    private String temp;

    public Map<String, String> split(String temp) {
        boolean lat = true;
        for (String bits : temp.split("\"")) {
            this.count++;
            if (this.count % 2 == 0) {
                this.list.add(bits);
            } else {
                if (!bits.equals(":") && !bits.equals(",") && bits.length() > 3) {
                    String coord = bits;
                    Double numbr;
                    if (lat == true) {
                        numbr = Double.parseDouble(coord.substring(1, coord.length() - 1));
                        lat = false;
                    } else {
                        numbr = Double.parseDouble(coord.substring(1, coord.length() - 1));
                    }
                    this.list.add(Double.toString(numbr));
                }
            }
        }
        this.count = 0;
        return this.join(list);
    }

    private Map<String, String> join(ArrayList<String> list) {
        for (this.count = 0; this.count < list.size(); this.count++) {
            if (this.count % 2 == 0) {
                temp = list.get(count);

                switch (temp) {
                    case "continent_name":
                        temp = "Continent";
                        break;
                    case "country_name":
                        temp = "Country";
                        break;
                    case "city":
                        temp = "City";
                        break;
                    case "district":
                        temp = "District";
                        break;
                    case "latitude":
                        temp = "Latitude";
                        break;
                    case "longitude":
                        temp = "Longitude";
                        break;
                    case "zipcode":
                        temp = "Zipcode";
                        break;
                    case "ip":
                        temp = "IP";
                        break;
                }
            } else {
                map.put(temp, list.get(count));
            }
        }
        return this.map;
    }
}
