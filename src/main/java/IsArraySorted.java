public class IsArraySorted {
    public String isArraySorted(int[] mass){
        if (mass.length>0) {
            String k = "not sorted";
            for (int i = 0; i < mass.length - 1; ++i) {
                if (mass[i] > mass[i + 1]) {
                    return k;
                }
                return k;
            }

        }return "Array is empty";
    }
}
