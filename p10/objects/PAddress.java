package objects;

import java.util.StringTokenizer;

public class PAddress {
    String country, region, city, street, house, building, apartments;
    public PAddress(String address, String delimiter){
        if (delimiter.length() == 1) parsWithStringTokenizer(address, delimiter);
        else parse(address, delimiter);
    }

    private void parse(String s, String delimiter){
        String[] t = s.split(delimiter);
        country = t[0];
        region = t[1];
        city = t[2];
        street = t[3];
        house = t[4];
        building = t[5];
        apartments = t[6];
    }

    private void parsWithStringTokenizer(String s, String delimiter){
        StringTokenizer tokenizer = new StringTokenizer(s, delimiter);
        String[] t = new String[tokenizer.countTokens()];
        int i = 0;
        while (tokenizer.hasMoreTokens()){
            t[i++] = tokenizer.nextToken();
        }
        country = t[0];
        region = t[1];
        city = t[2];
        street = t[3];
        house = t[4];
        building = t[5];
        apartments = t[6];
    }

    @Override
    public String toString() {
        return "Address [country=" + country + ", region=" + region + ", city=" + city + ", street=" + street
                + ", house=" + house + ", building=" + building + ", apartments=" + apartments + "]";
    }
}
