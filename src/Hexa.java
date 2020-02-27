public class Hexa implements Strategy{
    public int doOperation(int num) {
        System.out.println(Integer.toHexString(num));
        return num;
    }
}
