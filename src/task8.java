public class task8 {
    public static void main(String [] args) {

        int zarplata = 29000;
        int vklad = 0;
        for (int i = 1; i < 13; i ++) {
            vklad += zarplata;
            System.out.println("Месяц " + i + " сумма накоплений " + vklad);
        }
    }
}
