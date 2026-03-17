package runtimeAnalysis;

public class StringPerformance {

    public static void main(String[] args) {

        int n = 100000;

        // String
        long t1 = System.nanoTime();
        String s = "";
        for (int i = 0; i < n; i++)
            s += "a";
        System.out.println("String: " + (System.nanoTime() - t1));

        // StringBuilder
        long t2 = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++)
            sb.append("a");
        System.out.println("StringBuilder: " + (System.nanoTime() - t2));

        // StringBuffer
        long t3 = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < n; i++)
            sbf.append("a");
        System.out.println("StringBuffer: " + (System.nanoTime() - t3));
    }
}
