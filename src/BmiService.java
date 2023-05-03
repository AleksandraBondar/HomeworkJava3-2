public class BmiService {
    public int calculate (int weightInKilograms, double heightInMeters) {
        double heightForResult = Math.pow(heightInMeters, 2);
        double index = weightInKilograms / heightForResult;
        return (int) index;

    }
}
