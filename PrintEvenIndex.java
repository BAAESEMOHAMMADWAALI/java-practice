public class PrintEvenIndex {
    public void printEvenIndices(String s ){
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(s.charAt(i));
            }
        }
        System.out.println();
    }
}
