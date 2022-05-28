
public class HelloGoodbye {
    public static void main(String[] args) {
        if (args.length != 2) {
            return;
        }
        String s1 = "Hello ".concat(args[0]).concat(" and ").concat(args[1]).concat(".");
        String s2 = "Goodbye ".concat(args[1]).concat(" and ").concat(args[0]).concat(".");
        System.out.println(s1);
        System.out.println(s2);
    }
}
