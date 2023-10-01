public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();

        for (int q = 10; q > 0; q--) {
            System.out.println(q);
        }
        System.out.println();

        for (int o = 0; o < 17; o = o + 2) {
            System.out.println(o);
        }
        System.out.println();

        for (int m = 10; m >= -10; m--) {
            System.out.println(m);
        }
        System.out.println();

        for (int y = 1904; y <= 2096; y = y + 4) {
            System.out.println(y + " год является високосным");
        }
        System.out.println();

        for (int s = 7; s <= 98; s=s+7) {
            System.out.println(s);
        }
        System.out.println();

        for (int t = 1; t <= 512; t=t*2) {
            System.out.println(t);
        }
        System.out.println();

        int saving = 0;
        int income = 29000;
        for (int n = 0; n < 12; n++) {
            saving = saving + income;
            System.out.println("Месяц "+n+", сумма накоплений равна "+saving+" рублей");
        }
        System.out.println();

        int total = 0;
        int invest = 29000;
        for (int p = 0; p < 12; p++) {
            total = total + total/100;
            total = total + invest;
            System.out.println("Месяц "+p+", сумма накоплений равна "+total+" рублей");
        }
        System.out.println();

        for (int h = 1; h <= 10; h++) {
            int equel = 2*h;
            System.out.println("2*"+h+" = "+equel);
        }

    }
}