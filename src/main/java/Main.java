public class Main {

    public static void main(String[] args) {

        int[] mass = {2};

        MinValue minValue = new MinValue();
        System.out.println(minValue.minValue(mass));

        IsArraySorted isArraySorted = new IsArraySorted();
        System.out.println(isArraySorted.isArraySorted(mass));

        HowManyTimeSomeValueInclude howManyTimeSomeValueInclude = new HowManyTimeSomeValueInclude();
        System.out.println("5 is present in the array " + howManyTimeSomeValueInclude.howManyTimeSomeValueInclude(mass) + " times");


        CompareQuantityNegativeAndPositiveValues compareQuantityNegativeAndPositiveValues =
                new CompareQuantityNegativeAndPositiveValues();
        System.out.println(compareQuantityNegativeAndPositiveValues.compareQuantity(mass));

        MoreEvenOrUneven moreEvenOrUneven = new MoreEvenOrUneven();
        System.out.println(moreEvenOrUneven.evenOrUneven(mass));
    }
}
