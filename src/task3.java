public class task3 {
    public static void main(String[] args) {
        int year = 2012;

        if ((year%4 == 0 && year%100 != 0) || year%400 == 0 ) {

            System.out.println("Год високосный");
        }  else {
            System.out.println("Год не високосный");
        }
    }
}
