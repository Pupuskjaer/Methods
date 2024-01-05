import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void isYearLeap(int year) {
        System.out.print(year);
        if (year % 4 != 0) {
            System.out.println(" год - невисокосный");
        }
        else if (year % 100 == 0){
            if (year % 400 == 0){
                System.out.println(" год - високосный");
            }
            else {
                System.out.println(" год - невисокосный");
            }
        }
        else {
            System.out.println(" год - високосный");
        }

    }

    public static void offerAppVersion(int produceYear,byte clientOs) {
        // метод предназначен для предложения пользователю в зависимости от года
        // выпуска и ОС устройства
        int currentYear = LocalDate.now().getYear();
        if (clientOs == 0 ) {
            if (produceYear < currentYear){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            else if(produceYear > currentYear) {
                System.out.println("Вы из будущего? Введите корректный год");
            }
            else {
                System.out.println("Установите версию приложения для IOS по ссылке ");
            }
        }
        else if (clientOs == 1 ) {
            if (produceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
            else if(produceYear > currentYear) {
                System.out.println("Вы из будущего? Введите корректный год");
            }
            else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static int estimateDeliveryTime(int deliveryDistance ){
        int deliveryTime = 1;
        if (deliveryDistance < 20){
            System.out.println("потребуется : " + deliveryTime + " сутки");
        }
        else if (deliveryDistance >= 20 && deliveryDistance < 60){
            deliveryTime += 1;
            System.out.println("потребуется : " + deliveryTime + " суток");
        }
        else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryTime += 2;
            System.out.println("потребуется : " + deliveryTime + " суток");
        }
        else {
            System.out.println("Доставка невозможна");
        }
        return deliveryTime;
    }
    public static void main(String[] args) {
        isYearLeap(1700);
        offerAppVersion(2023, (byte) 1);
        estimateDeliveryTime(95);
    }
}