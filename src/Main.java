public class Main {
    public static void main(String[] args) {

        System.out.println("Number 10 in binary is: ");
        Context context = new Context(new Binary());
        context.executeStrategy(10);


        System.out.println("\n Number 10 in hexadecimal is: ");
        context = new Context(new Hexa());
        context.executeStrategy(10);

        System.out.println("\n Number 10 in octal decimal is: ");
        context = new Context(new Octa());
        context.executeStrategy(10);
    }
}
