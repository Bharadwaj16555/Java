public class F6classAdvPatterns {
    public static void main(String args[]) {
        int n = 5;
       
        // Butterfly Pattern


        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            int spaces = 2 * (n - i);
            for(int j=1;j<=spaces;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

            for(int i=n;i>=1;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            int spaces = 2 * (n - i);
            for(int j=1;j<=spaces;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }



        // Soild Rhombus Pattern
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        //Pyramid Pattern with Numbers
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }


        // Palindromic Pattern with Numbers

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--) {
                System.out.print(j);
            }
            for(int j=2;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }


        //Diamond Pattern with stars
        for(int i=1;i<=n;i++) {
           for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }

            for(int j=1;j<=2*i-1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--) {
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }

            for(int j=1;j<=2*i-1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }


}           
            
}
