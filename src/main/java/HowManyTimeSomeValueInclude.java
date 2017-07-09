public class HowManyTimeSomeValueInclude {
    public Integer howManyTimeSomeValueInclude(int[] mass){
        int k = 0;
        for (int i = 0; i<mass.length; i++){
            if (mass[i] == 5){
                k++;
            }
        }
        return k;
    }
}
