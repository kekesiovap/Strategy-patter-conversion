public class Octa implements Strategy{
    public int doOperation(int num) {
        System.out.println(Integer.toOctalString(num));
        return num;
    }
}
