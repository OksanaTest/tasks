package net;

public class Main {

    public static void main(String[] args) {

        int[] mass = {0,5,6,7,2,-3,4,1,2};

        MinValue minValue = new MinValue();
        System.out.println(minValue.minValue(mass));

        int[] mass1 = {-900, -899, -700, 4, 34, 45};

        IsArraySorted isArraySorted = new IsArraySorted();
        System.out.println(isArraySorted.isArraySorted(mass1));
        System.out.println(isArraySorted.isArraySorted(mass));


    }
}
