public class MinValue {
    public String minValue(int[] mass) {
        try{
            int min = mass[0];
            for (int i = 0; i < mass.length; i++) {
                 if (mass[i] < min) {
                      min = mass[i];
                    }
                }
                return Integer.toString(min);
    }catch (ArrayIndexOutOfBoundsException ex){
            return "Array is empty";
        }
    }
}
