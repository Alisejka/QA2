import org.junit.jupiter.api.Test;

public class Homework {
    @Test

    public void showMeResults() {
        carSale("Жигули", 9999, 00.01);
        flightFuelPrice(3.57, 17, 500);
        birthdayConverter(9, 15, 1987);
        directDistance(15, 17, 24, 25);
    }

    private void carSale(String carBrand, int mileage, double price) {
        System.out.println("Продаём машину " + carBrand + " с пробегом " + mileage + " за " + price + " денег");
    }

    private void flightFuelPrice(double price, double mileage, int flightKm) {
        double flightPrice = price * mileage * flightKm / 100;
        System.out.println("Стоимость топлива за перелёт: " + flightPrice + " евро");
    }

    private void birthdayConverter(int day, int month, int year) {
        String monthText;
        switch (month) {
            case 1:
                monthText = "января ";
                break;
            case 2:
                monthText = "февраля ";
                break;
            case 3:
                monthText = "марта";
                break;
            case 4:
                monthText = "апреля";
                break;
            case 5:
                monthText = "мая";
                break;
            case 6:
                monthText = "июня";
                break;
            case 7:
                monthText = "июля";
                break;
            case 8:
                monthText="августа";
                break;
            case 9:
                monthText="сентября";
                break;
            case 10:
                monthText="октября";
                break;
            case 11:
                monthText="ноября";
                break;
            case 12:
                monthText="декабря";
                break;
            default:
                monthText = "фиг знает чего ";
        }
        System.out.println("Твоя дата рождения: " + day + " " + monthText + year + " года");
    }
//    посмотреть switch

    private void directDistance(int aX, int aY, int bX, int bY) {
        int mainX = aX - bX;
        int mainY = aY - bY;
        double distance = Math.sqrt(Math.pow(mainX, 2) * Math.pow(mainY, 2));
        System.out.println("Прямое расстояние между этими точками на карте: " + distance + " условных единиц");
    }
}