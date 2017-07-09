public class HowManyTimeSomeValueInclude {
    public String howManyTimeSomeValueInclude(int[] mass){
        try{
            int k = 0;
            for (int i = 0; i<mass.length; i++){
                if (mass[i] == 5){
                    k++;
                }
            }
            return Integer.toString(k);
        }catch (ArrayIndexOutOfBoundsException ex){
            return "Array is empty";
        }
    }
}
