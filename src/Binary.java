public class Binary implements Strategy{
    @Override
    public int doOperation(int num) {
        System.out.println(Integer.toBinaryString(num));
        return num;
    }
}
