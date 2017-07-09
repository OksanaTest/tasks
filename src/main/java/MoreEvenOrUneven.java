public class MoreEvenOrUneven {
    public String evenOrUneven(int[] mass){
        if (mass.length>0){
            int even = 0;
            int uneven = 0;
            for (int i = 0; i < mass.length; i++){
                if (mass[i]%2 == 0){
                    even++;
                }else{
                    uneven++;
                }
            }
            if (even > uneven){
                return "even";
            }else if(uneven > even){
                return "uneven";
            } else {
                return "even = uneven";
            }

        }return "Array is empty";
    }
}
