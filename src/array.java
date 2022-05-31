
public class array {
    public static void main(String[] args) {
        invertArray();
        System.out.println();
        stoElements();
        System.out.println();
        lessSix();
        System.out.println();
        mass2();
        System.out.println();
        massinitialValue(5,6);
    }

    public static void invertArray() {
        int[] mass = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == 1 ) {
                System.out.print(0 + ", ");
            }
            else {
                System.out.print(1 + ", ");
            }
        }
    }

    public static void stoElements() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
            System.out.print(arr[i] + ", ");
        }
    }

    public static void lessSix() {
        int[] mass = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < 6 ) {
                System.out.print(mass[i]*2 + ", ");
            }
            else {
                System.out.print(mass[i] + ", ");
            }
        }
    }

    public static void  mass2() {
        int[][] mass = new int[5][5];
        for (int i = 0; i < mass.length; i++) {
            mass[i][i] = 1;
        }
        int j = 0;
        for (int i = mass.length-1; i >= 0; i--) {
            mass[i][j] = 1;
            j++;
        }
        for (int i = 0; i < mass.length; i++) {
            for (int k = 0; k < mass[i].length; k++) {
                System.out.print(mass[i][k] + " ");
            }
            System.out.println();
        }
    }

    public static void massinitialValue(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + ", ");
        }
    }
}

