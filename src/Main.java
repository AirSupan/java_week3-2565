public class Main {
    public static void main(String[] args) {
        System.out.println("Bitwise Operator!");
        int a = 12;
        int b = 25;
        int c = 35;
        int d = 2;
        int e = 8;
        int f = 8;
        int val;
        String name = "Supansa";
        int age = 25;
        boolean result = name instanceof String;


        val = a&b;
        System.out.println("Output of Bitwise AND: " + val);
        val = a|b;
        System.out.println("Output of Bitwise OR: " + val);
        val = a^b;
        System.out.println("Output of Bitwise XDR: " + val);
        val = ~c;
        System.out.println("Output of Bitwise ~: " + val);
        val = d<<8;
        System.out.println("Output of Bitwise Signed Left Shit: " + val);
        val = e>>3;
        System.out.println("Output of Bitwise Signed Left Shit: " + val);
        val = f>>>2;
        System.out.println("Output of Bitwise Signed Left Shit: " + val);


        System.out.println("name us a instant of String"+ result);

    }
}