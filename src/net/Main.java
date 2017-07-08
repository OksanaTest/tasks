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

        int[] mass2 = {0,5,5,7,2,5,4,5,5};
        HowManyTimeSomeValueInclude howManyTimeSomeValueInclude = new HowManyTimeSomeValueInclude();
        System.out.println("5 is present in the array " + howManyTimeSomeValueInclude.howManyTimeSomeValueInclude(mass2) + " times");
        System.out.println("5 is present in the array " + howManyTimeSomeValueInclude.howManyTimeSomeValueInclude(mass1) + " times");
        System.out.println("5 is present in the array " + howManyTimeSomeValueInclude.howManyTimeSomeValueInclude(mass) + " times");

    }
}
