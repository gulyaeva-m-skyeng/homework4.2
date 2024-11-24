public class Main {
    public static void main(String[] args) {

//task 1
        System.out.println("Task 1");
        int desiredSum = 2_459_000;
        int sum = 0;
        int amount = 15_000;
        double percent = 1D / 100;
        int month = 0;
        while (sum < desiredSum) {
            sum += amount;
            sum = (int) (sum * (1 + percent));
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }

        //task 2
        System.out.println("Task 2");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (; number >= 1; number--) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
