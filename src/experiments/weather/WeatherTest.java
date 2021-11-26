package experiments.weather;

import experiments.weather.Weather;

import java.util.Scanner;

public class WeatherTest {
    public static void main(String[] args) {
        Weather weather = new Weather();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Եղանակի ծրագիր");
        System.out.println("Ծրագրից դուրս գալու համար սեղմել 0");
        System.out.println("որերորդ ամիսը՞ ");

        do {
            int a = scanner.nextInt();
            System.out.println(weather.Weather(a));

        }while (weather.isRun);


    }
}
