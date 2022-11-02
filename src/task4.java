public class task4 {
    public static void main(String[] args) {
        int distance = 75;
        int dostavka = 1;
        if (distance <20) {

            System.out.println("Доставка займет " + dostavka + "дней");
        }  else  if (distance > 20 && distance < 60){
            System.out.println("Доставка займет " + (dostavka + 1 ) + "дней");
        }
        else  if (distance > 60 && distance < 100){
            System.out.println("Доставка займет " + (dostavka + 2 ) + "дней");
        }
    }
}
