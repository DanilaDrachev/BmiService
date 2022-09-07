public class BmiService {
    public double calculate(int weight, double growth) {
        double growthsquared = growth * growth;
        double index = weight / growthsquared;

        return index;
    }
}
