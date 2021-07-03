package lecture2;

public class ForEachTest {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int x : numbers) {
            System.out.print(x + " ");
            x = x * 10; // no effect on numbers
        }
        System.out.println();

        int[][] numbers2 = {{1, 2}, {4, 5, 6}, {7, 8, 9}};
        for (int[] x : numbers2) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println("");
        }

        int[][] numbers3 = new int[2][];
        numbers3[0] = new int[2];
        numbers3[1] = new int[3];
        for (int i = 0; i < numbers3.length; i++) {
            for (int k = 0; k < numbers3[i].length; k++) {
                numbers3[i][k] = i + 1;
                // System.out.println(numbers3[i][k]);
            }
        }
        for (int[] x : numbers3) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
