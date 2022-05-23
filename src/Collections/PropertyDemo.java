package Collections;

import java.util.Properties;
import java.io.*;


public class PropertyDemo {
    public static void main(String[] args) throws FileNotFoundException {
        Properties p=new Properties();

        p.setProperty("Brand","Dell");
        p.setProperty("Processor","i7");
        p.setProperty("OS","W10");
        p.setProperty("Model","Latitude");

        //p.store(new FileOutputStream("/Users/Homelane/Desktop/data.txt"),"laptop details");
    }
}
