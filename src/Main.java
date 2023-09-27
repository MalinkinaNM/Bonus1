// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int check = 100; // начальный счет
        int summa = 300; // сумма пополнения

        if (summa >= 1000) {
            System.out.println("Бонус равен " + (summa / 100) + " рублям");
            System.out.println("итоговая сумма на счёт клиента — " + (check + summa + summa / 100));
        } else {
            System.out.println("бонусов нет");
            System.out.println("итоговая сумма на счёт клиента — " + (check + summa));
        }


    }
}
