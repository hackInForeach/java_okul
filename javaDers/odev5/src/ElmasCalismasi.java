public class ElmasCalismasi {
    public static void main(String[] args) {


        int n = 10;

        patern1(n);
        patern(n);
        System.out.println();
        patern2(n);
        patern3(n);
        patern4(n);
        System.out.println();
        patern5(n);
        patern6(n);

    }

    public static void patern(int n) {
        //soldan dik üçgen
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void patern1(int n) {
        //saoldan dik üçgen
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void patern2(int n) {
        //sağ dik üçgen
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void patern3(int n) {
        //sağdan dik üçgen
        for (int i = 0; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void patern4(int n) {
        // geniş üçgen
        for (int i = 0; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i-1; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void patern5(int n) {
    //geniş üçgen
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < n - 1; j++) {
                System.out.print("* ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void patern6(int n) {
        //elmas
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i-1; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            for (int j = i; j < n-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}