package org.example;

public class ArrayWithHash {
    public static void main(String[] args) {
        int[] array = {2, 2, 3, 4, 7, 6, 4, 5, 6, 7};
        int[] hash = new int[6];
        getHash(array, hash);
        printLines(hash);
    }

    public static int[] getHash(int[] array, int[] hash) {
        if (array.length >= hash.length) {
            for (int i = 0; i < hash.length; i++) {
                if ((array[i] + array[i + 1]+sum(array))%hash.length == 0) {
                    hash[i] = 9;
                }
                if ((array[i] + array[i + 1]+sum(array))%hash.length == 1) {
                    hash[i] = 8;
                }
                if ((array[i] + array[i + 1]+sum(array))%hash.length== 2) {
                    hash[i] = 7;
                }
                if ((array[i] + array[i + 1]+sum(array))%hash.length== 3) {
                    hash[i] = 6;
                }
                if ((array[i] + array[i + 1]+sum(array))%hash.length== 4) {
                    hash[i] = 5;
                }
                if ((array[i] + array[i + 1]+sum(array))%hash.length== 5) {
                    hash[i] = 4;
                }
                if ((array[i] + array[i + 1]+sum(array))%hash.length== 6) {
                    hash[i] = 3;
                }
                if ((array[i] + array[i + 1]+sum(array))%hash.length== 7) {
                    hash[i] = 2;
                }
                if ((array[i] + array[i + 1]+sum(array))%hash.length== 8) {
                    hash[i] = 1;
                }
                if ((array[i] + array[i + 1]+sum(array))%hash.length== 9) {
                    hash[i] = 0;
                }
            }
        }
        if (array.length < hash.length) {
            for (int i = 0; i < array.length; i++) {
                if ((array[i] + array[i + 1]+sum(array))%hash.length== 0) {
                    hash[i] = 0;
                }
                if ((array[i] + array[i + 1]+sum(array))%hash.length== 1) {
                    hash[i] = 1;
                }
                if ((array[i] + array[i + 1]+sum(array))%hash.length== 2) {
                    hash[i] = 2;
                }
                if ((array[i] + array[i + 1]+sum(array))%hash.length== 3) {
                    hash[i] = 3;
                }
                if ((array[i] + array[i + 1]+sum(array))%hash.length== 4) {
                    hash[i] = 4;
                }
                if ((array[i] + array[i + 1]+sum(array))%hash.length== 5) {
                    hash[i] = 5;
                }
                if ((array[i] + array[i + 1]+sum(array))%hash.length== 6) {
                    hash[i] = 6;
                }
                if ((array[i] + array[i + 1]+sum(array))%hash.length== 7) {
                    hash[i] = 7;
                }
                if ((array[i] + array[i + 1]+sum(array))%hash.length== 8) {
                    hash[i] = 8;
                }
                if ((array[i] + array[i + 1]+sum(array))%hash.length== 9) {
                    hash[i] = 9;
                }
            }
        }
        return hash;
    }
    public static int sum(int [] array){
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum=sum+array[i]+ array.length;
        }
        return sum;
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
