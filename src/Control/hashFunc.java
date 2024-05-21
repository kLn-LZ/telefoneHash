package Control;

public class hashFunc {


    public hashFunc(){
        super();
    }


    public static int hash(String phoneNumber, int start, int end) {

        int sum = 0;
        for (int i = 0; i < phoneNumber.length(); i++) {
            sum += phoneNumber.charAt(i);
        }
        int range = end - start + 1;
        int index = (sum % range) + start;
        return index;

    }


}
