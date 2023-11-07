public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 64;
        double height = 1.59;
        int miles = service.calculate(mass, height);
        System.out.println(miles);
    }
}