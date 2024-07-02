public class Converter {
    int stepLength = 75; // centimeter
    int stepMeter = 100; //1 meter = 100 centimeter
    int stepKm = 1000; // 1 km = 1000 meter
    int stepsToKilocalories = 50; // calories
    int kilocalorie = 1000; // 1 kilo = 1000 calories

    int convertStepsToKilocalories(int steps) {
        steps = steps * stepsToKilocalories / kilocalorie;
        return steps;
    }

    int convertToKm(int steps) {
        steps = steps * stepLength / stepMeter / stepKm;
        return steps;
    }
}