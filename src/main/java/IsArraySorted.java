public class IsArraySorted {
    public boolean isArraySorted(int[] mass){
        try{
            boolean k = false;
            for (int i = 0; i<mass.length; i++ ){
                int min = mass[i];
                for (int j = i+1; j<mass.length; j++){
                    if (mass[j]<min){
                        k = false;
                        return k;
                    }else{k = true;}
                }

            }
            return k;
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Array is empty");
            return false;
        }
    }
}