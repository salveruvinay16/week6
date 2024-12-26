import java.util.*;
import java.io.*;
class Cook{
    public static void main(String[] args){
        Map<String,String> cookie =new HashMap<>();
        cookie.put("username","vinay");
        cookie.put("session_id","abc123");
        cookie.put("language","en");
        for(Map.Entry<String,String> entry : cookie.entrySet()){
            System.out.println("name"+entry.getKey());
            System.out.println("value"+entry.getValue());
            System.out.println();
        }
    }
}