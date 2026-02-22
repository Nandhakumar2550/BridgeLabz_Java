package programming_elements.level1;

public class AverageMarkofSam {
    public static void main(String args[]){
        String name="Sam";
        double mathsmark=94;
        double physicsmark=95;
        double chemistrymark=96;
        double averagemark=(mathsmark + physicsmark + chemistrymark)/3;
        System.out.print(name + "'s average mark in PCM is " + averagemark);
    }
}
