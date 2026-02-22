package programming_elements.level1;

public class Dividepens {
    public static void main(String args[]){
        int totalpens=14;
        int totalstudents=3;

        int pensperstudent=totalpens/totalstudents;
        int remainingpens=totalpens%totalstudents;
        System.out.print("The Pen Per Student is " + pensperstudent +" and the remaining pen not distributed is " + remainingpens);
    }
}
