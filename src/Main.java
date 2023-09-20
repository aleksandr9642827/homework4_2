public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int index = service.calculate(60, 1.8);
        System.out.println(index);
    }
}
