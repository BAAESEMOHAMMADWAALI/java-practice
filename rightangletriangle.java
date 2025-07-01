class rightangletriangle {
    public static void main(String[] args) {
        rightangletriangle sol = new rightangletriangle();
        sol.printPattern(5); // Example usage
    }

    public void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.println("* ");
                continue;
            }
            if (i == n) {
                for (int j = 0; j < n; j++) {
                    System.out.print("* ");
                }
                System.out.println();
                continue;
            }
            System.out.print("* ");
            for (int j = 2; j < i; j++) {
                System.out.print("  ");
            }
            System.out.println("* ");
        }
    }
}
