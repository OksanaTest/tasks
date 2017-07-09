public class MinValue {
    public Integer minValue(int[] mass){
        int min = mass[0];
        for(int i=0; i<mass.length; i++){
            if (mass[i]<min){
                min = mass[i];
            }

        }
        return min;
    }
}
