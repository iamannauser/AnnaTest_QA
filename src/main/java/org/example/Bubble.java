package org.example;

public class Bubble {

        public static void main(String[] args) {
            int[] array = {64, 34, 25, 12, 22, 11, 90};

            printArray(array);

            int n = array.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }


            printArray(array);
        }

        static void printArray(int[] arr) {
            for (int value : arr) {
                System.out.print(value + " ");
            }
            System.out.println();
        }


}
