public class calcul {
    public static void main(String[] args) {

        int a = 2;
        int b = 4;
        int c = 1;
        double delta = b * b - (4 * a * c);
        double x;
        double x1;
        double x2;

        System.out.println("le nombre de a est " + a);
        System.out.println("le nombre de b est " + b);
        System.out.println("le nombre de c est " + c);
        System.out.println("delta =" + delta);

        if (delta < 0) {
            System.out.println("il n'y a pas de solution réelle");
        }
        if (delta == 0) {
            System.out.println("il admet une solution réelle x");
            x = -b / (2 * a);
            System.out.println("x =" + x);
        }
        if (delta > 0) {
            System.out.println("il admet deux solutions réelles:");
            x1 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("x1 =" + x1);
            x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("x2 =" + x2);
        }

    }

}
