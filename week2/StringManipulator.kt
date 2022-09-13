import java.util.Scanner;
public class StringManipulator{
public static void main(String[] args){
        Scanner info=new Scanner(System.in);
        System.out.println("Enter the name of your favourite city");
        String city=new String();
        city=info.next();
        int length=city.length();
        String upper=new String();
        upper=city.toUpperCase();
        String lower=new String();
        lower=city.toLowerCase();
        String first=new String();
        first=String.valueOf(city.charAt(0));
        System.out.println("You entered the name of your city: "+city+"\n the number of character in your city are: "+length+"\n Your city name in upper case is: "+upper+"\n Your city name in lower case is: "+lower+"\n the first letter of your city is: "+first);
        }
}
