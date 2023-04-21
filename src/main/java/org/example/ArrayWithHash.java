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
        int[] hash = new int[8];
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
        int j=1;
        if (array.length >= hash.length) {
            for (i = 0; i < array.length; i++) {
                if (i < hash.length-1 &&(array[i] * i + array[i + 1] * (i + 1) - array[array.length - 1] + getSum(array)+getMultiplication(array)) % hash.length == 0) {
                    hash[i] = 9;
                }
                if (i < hash.length-1 &&(array[i] * i + array[i + 1] * (i + 1) - array[array.length - 1] + getSum(array)+getMultiplication(array)) % hash.length == 1) {
                    hash[i] = 8;
                }
                if (i< hash.length-1 &&(array[i] * i + array[i + 1] * (i + 1) - array[array.length - 1] + getSum(array)+getMultiplication(array)) % hash.length == 2) {
                    hash[i] = 7;
                }
                if (i < hash.length-1 &&(array[i] * i + array[i + 1] * (i + 1) - array[array.length - 1] + getSum(array)+getMultiplication(array)) % hash.length == 3) {
                    hash[i] = 6;
                }
                if (i < hash.length-1 &&(array[i] * i + array[i + 1] * (i + 1) - array[array.length - 1] + getSum(array)+getMultiplication(array)) % hash.length == 4) {
                    hash[i] = 5;
                }
                if (i < hash.length-1 &&(array[i] * i + array[i + 1] * (i + 1) - array[array.length - 1] + getSum(array)+getMultiplication(array)) % hash.length == 5) {
                    hash[i] = 4;
                }
                if (i < hash.length-1 &&(array[i] * i + array[i + 1] * (i + 1) - array[array.length - 1] + getSum(array)+getMultiplication(array)) % hash.length == 6) {
                    hash[i] = 3;
                }
                if (i < hash.length-1 &&(array[i] * i + array[i + 1] * (i + 1) - array[array.length - 1] + getSum(array)+getMultiplication(array)) % hash.length == 7) {
                    hash[i] = 2;
                }
                if (i < hash.length-1 &&(array[i] * i + array[i + 1] * (i + 1) - array[array.length - 1] + getSum(array)+getMultiplication(array)) % hash.length == 8) {
                    hash[i] = 1;
                }
                if (i < hash.length-1 &&(array[i] * i + array[i + 1] * (i + 1) - array[array.length - 1] + getSum(array)+getMultiplication(array)) % hash.length == 9) {
                    hash[i] = 0;
                }
                if(i>=hash.length-1&&j<hash.length){
                    hash[j] = hash[j - 1]+getSum(hash)+getSum(array)+getMultiplication(hash)+getMultiplication(array);
                    j++;
                }
            }
        }
        if (array.length < hash.length) {
            for (i = 0; i < hash.length; i++) {
                if (i < array.length - 1 && ((array[i] * i + array[i + 1] * (i + 1) - array[array.length - 1] + getSum(array)+getMultiplication(array)) % hash.length == 0)) {
                    hash[i] = 0;
                }
                if (i < array.length - 1 && ((array[i] * i + array[i + 1] * (i + 1) - array[array.length - 1] + getSum(array)+getMultiplication(array)) % hash.length == 1)) {
                    hash[i] = 1;
                }
                if (i < array.length - 1 && ((array[i] * i + array[i + 1] * (i + 1) - array[array.length - 1] + getSum(array)+getMultiplication(array)) % hash.length == 2)) {
                    hash[i] = 2;
                }
                if (i < array.length - 1 && ((array[i] * i + array[i + 1] * (i + 1) - array[array.length - 1] + getSum(array)+getMultiplication(array)) % hash.length == 3)) {
                    hash[i] = 3;
                }
                if (i < array.length - 1 && ((array[i] * i + array[i + 1] * (i + 1) - array[array.length - 1] + getSum(array)+getMultiplication(array)) % hash.length == 4)) {
                    hash[i] = 4;
                }
                if (i < array.length - 1 && ((array[i] * i + array[i + 1] * (i + 1) - array[array.length - 1] + getSum(array)+getMultiplication(array)) % hash.length == 5)) {
                    hash[i] = 5;
                }
                if (i < array.length - 1 && ((array[i] * i + array[i + 1] * (i + 1) - array[array.length - 1] + getSum(array)+getMultiplication(array)) % hash.length == 6)) {
                    hash[i] = 6;
                }
                if (i < array.length - 1 && ((array[i] * i + array[i + 1] * (i + 1) - array[array.length - 1] + getSum(array)+getMultiplication(array)) % hash.length == 7)) {
                    hash[i] = 7;
                }
                if (i < array.length - 1 && ((array[i] * i + array[i + 1] * (i + 1) - array[array.length - 1] + getSum(array)+getMultiplication(array)) % hash.length == 8)) {
                    hash[i] = 8;
                }
                if (i < array.length - 1 && ((array[i] * i + array[i + 1] * (i + 1) - array[array.length - 1] + getSum(array)+getMultiplication(array)) % hash.length == 9)) {
                    hash[i] = 9;
                }
                if (i >= array.length - 1) {
                    for (; i < array.length; i++) {
                        for (j = i + 1; j < hash.length; j++) {
                            hash[j] = (hash[j - 1] + array[i] * i + array[array.length - 1]) % hash.length + j * array.length % array[i];
                        }
                        if (array.length == 1) {
                            hash[i] = hash[hash.length - 1] % hash.length;
                        }
                    }
                }
            }
        }
        return hash;
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
