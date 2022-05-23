package Exceptions;
import java.io.*;
import java.util.*;

public class TryWithResources {

    static void Divide() throws Exception{

        try(FileInputStream f1= new FileInputStream("my.txt");Scanner sc = new Scanner(f1)){
            int a = sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            System.out.println(a/c);
        }
    }
    public static void main(String[] args){
        try{
          Divide();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
