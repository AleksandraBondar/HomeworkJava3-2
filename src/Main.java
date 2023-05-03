public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightInKilograms = 98;
        double heightInMeters = 1.87;
        int index = service.calculate(weightInKilograms, heightInMeters);
        System.out.println(index);
    }
}