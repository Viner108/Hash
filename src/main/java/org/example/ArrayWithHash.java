package org.example;

public class ArrayWithHash {
    public static void main(String[] args) {
        testGetHash1();
        testGetHash2();
        testGetHash3();
        testGetHash4();
    }

    public static void testGetHash1() {
        int[] array = {7};
        int[] hash = new int[6];
        getHash(array, hash);
        printLines(hash);
        System.out.println("Completed");
        array[0] = 1;
        getHash(array, hash);
        printLines(hash);
        System.out.println("Completed");
        array[0] = 2;
        getHash(array, hash);
        printLines(hash);
        System.out.println("Completed");
        array[0] = 3;
        getHash(array, hash);
        printLines(hash);
        System.out.println("Completed");
        array[0] = 43456;
        getHash(array, hash);
        printLines(hash);
        System.out.println("Completed testGetHash1");
    }

    public static void testGetHash2() {
        int[] array = {1, 1};
        int[] hash = new int[6];
        getHash(array, hash);
        printLines(hash);
        System.out.println("Completed");
        array[0] = 1;
        array[1] = 2;
        getHash(array, hash);
        printLines(hash);
        System.out.println("Completed");
        array[0] = 2;
        array[1] = 3;
        getHash(array, hash);
        printLines(hash);
        System.out.println("Completed");
        array[0] = 3;
        array[1] = 4;
        getHash(array, hash);
        printLines(hash);
        System.out.println("Completed");
        array[0] = 345645;
        array[1] = 346547;
        getHash(array, hash);
        printLines(hash);
        System.out.println("Completed testGetHash2");
    }

    public static void testGetHash3() {
        int[] array = {1, 1, 1, 1, 1, 1, 1};
        int[] hash = new int[6];
        getHash(array, hash);
        printLines(hash);
        System.out.println("Completed");
        array[1] = 2;
        getHash(array, hash);
        printLines(hash);
        System.out.println("Completed");
        array[3] = 8;
        getHash(array, hash);
        printLines(hash);
        System.out.println("Completed");
        array[4] = 24;
        array[5] = 234;
        getHash(array, hash);
        printLines(hash);
        System.out.println("Completed testGetHash3");
    }
    public static void testGetHash4(){
        int[] array = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        int[] hash = new int[15];
        getHash(array, hash);
        printLines(hash);
        System.out.println("Completed");
        array[14] = 2;
        getHash(array, hash);
        printLines(hash);
        System.out.println("Completed");
        array[4] =4543;
        getHash(array, hash);
        printLines(hash);
        System.out.println("Completed");
        array[7] = 6785;
        array[10] = 22;
        getHash(array, hash);
        printLines(hash);
        System.out.println("Completed testGetHash4");
    }


    public static int[] getHash(int[] array, int[] hash) {
        int i;
        int j=0;
        if (array.length >= hash.length) {
            for (i = 0; i < array.length; i++) {
            if(i<hash.length) {
                condition(array, hash, i, 0, 9);
                condition(array, hash, i, 1, 8);
                condition(array, hash, i, 2, 7);
                condition(array, hash, i, 3, 6);
                condition(array, hash, i, 4, 5);
                condition(array, hash, i, 5, 4);
                condition(array, hash, i, 6, 3);
                condition(array, hash, i, 7, 2);
                condition(array, hash, i, 8, 1);
                condition(array, hash, i, 9, 0);
            }
            if(i>=hash.length&&j<hash.length){
                    hash[j] = hash[j]+array[i]+getSum(hash)+getSum(array)+getMultiplication(hash)+getMultiplication(array);
                    j++;
                }
            }
        }
        if (array.length < hash.length) {
            for (i = 0; i < hash.length; i++) {
            if(i<array.length-1){
                condition(array,hash,i,0,0);
                condition(array,hash,i,1,1);
                condition(array,hash,i,2,2);
                condition(array,hash,i,3,3);
                condition(array,hash,i,4,4);
                condition(array,hash,i,5,5);
                condition(array,hash,i,6,6);
                condition(array,hash,i,7,7);
                condition(array,hash,i,8,8);
                condition(array,hash,i,9,9);
            }
                if (i >= array.length-1) {
                    for (; i < array.length; i++) {
                        for (j = i; j < hash.length; j++) {
                            hash[j] = (hash[j] + array[i] * i + array[array.length - 1]) * hash.length + j * array.length * array[i];
                        }
                        if (array.length == 1) {
                            hash[i] = hash[hash.length - 1] * hash.length+getSum(array)+getMultiplication(array)+array[i];
                        }
                    }
                }
            }
        }
        return hash;
    }

    private static void condition(int[] array, int[] hash, int i, int i2, int i3) {
        if ((array[i] * i + array[i + 1] * (i + 1) - array[array.length - 1] + getSum(array)+getMultiplication(array)) % hash.length == i2) {
            hash[i] = i3+getMultiplication(array)*getSum(array);
        }
    }

    public static int getSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + (array[i] * i) + array.length;

        }
        return sum;
    }
    public static int getMultiplication(int [] array){
        int multiplication = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                multiplication = multiplication * (array[i]) * array.length;
            }else {
                multiplication=multiplication*array.length;
            }
        }
        return multiplication;

    }


    public static void printLines(int[] array) {//функция для выведения массива на консоль
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(String.format(" %2d", array[i]));
        }
        System.out.println("]");
    }
}
