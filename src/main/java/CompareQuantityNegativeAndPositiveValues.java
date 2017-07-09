public class CompareQuantityNegativeAndPositiveValues {
    public String compareQuantity(int[] mass){
        if (mass.length>0){
            int pos = 0;
            int neg = 0;
            for (int i = 0; i < mass.length; i++){
                if (mass[i] > 0){
                    pos++;
                }
                if (mass[i] < 0){
                    neg++;
                }
            }
            if (pos<neg){
                return "negative";
            } else if (pos > neg){
                return "positive";
            } else if ((pos == neg)&& (pos != 0)){
                return "equals quantity";
            } else{
                return "only zeros in the array";
            }
        }else {return "Array is empty"; }
    }
}
