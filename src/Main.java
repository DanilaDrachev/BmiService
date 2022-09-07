public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        int weight = 60; // вес в килограммах
        double growth = 1.7; // рост в метрах;
        double index = service.calculate(weight,growth);

        System.out.println("Индекс массы тела " + index);
    }
}
