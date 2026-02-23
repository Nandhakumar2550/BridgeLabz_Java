package control_flows.level1;
import java.util.*;
public class SpringSeason {
    public static void main(String args[]){
        int month=Integer.parseInt(args[0]);
        int day=Integer.parseInt(args[1]);
        boolean isspring=(month==3 && day>=20)||(month==4)||(month==6)||(month==6 && day<=20);
        if(isspring){
            System.out.println("its spring season");
        }else{
            System.out.println("its not spring season");
        }
    }
}

