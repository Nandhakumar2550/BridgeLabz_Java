package method_practice.level1;

public class SpringSeasonChecker {
    public static boolean isspring(int month,int day){
        boolean result=(month==3 && day>=20)||(month==4)||(month==5)||(month==6 && day<=20);
         return result;
    }
    public static void main(String[] args) {
        int month=Integer.parseInt(args[0]);
        int day=Integer.parseInt(args[1]);
        if(isspring(month,day)){
            System.out.println("Its a Spring Season");
        }else{
            System.out.println("Not a Spring Season");
        }
    }
}
