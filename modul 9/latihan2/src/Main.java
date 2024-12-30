public class Main {
    public static void main(String[] args) {
        int score = 750;
        int income = 50000;
        boolean authorized = true;

        if ((score <= 700) && ((income < 40000) || (income > 100000) || !authorized || (score <= 500)) && (income <= 100000))
            reject();
        else
            accept();
    }

    public static void accept() {
        System.out.println("Accepted");
    }

    public static void reject() {
        System.out.println("Rejected");
    }
}
