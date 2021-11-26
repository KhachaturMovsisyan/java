package experiments.weather;

public class Weather<month> {
    String season;
    boolean isRun = true;

    public String Weather(int a) {
        do {
            switch (a) {
                case 12:
                case 1:
                case 2:
                    season = "Ձմեռ";
                    break;
                case 3:
                case 4:
                case 5:
                    season = "Գարուն";
                    break;
                case 6:
                case 7:
                case 8:
                    season = "Ամառ";
                    break;
                case 9:
                case 10:
                case 11:
                    season = "Աշուն";
                    break;
                case 0:
                    System.out.println("Դուք դուրս եկաք ծրագրից");
                    isRun=false;
                    season="Հաջողություն";
                    break;
                default:
                    season = "Սխալ ամիս";
            }

            return season;
        }while (isRun);

    }


}
