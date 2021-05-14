public class helloJava {
    public static void main(String arg[]) {
        System.out.println("Hello Java");
        int o,m = 3;
        int n = 6;

        n = n + m; //n=9
        System.out.println(n);
        n += m; //n=9
        System.out.println(n);
        m = ++n; //pre increment  m = 7 and n = 7
        System.out.println("m="+m);
        System.out.println("n="+n);
        System.out.println("************");
        m = n++; //post increment m = 6 and n = 7
        System.out.println("m="+m);
        System.out.println("n="+n);

        System.out.println("Add in first branch");
    }
}
