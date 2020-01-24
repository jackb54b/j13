import java.util.Arrays;

public class Odd<X> {

    private X[] array;

    public Odd(X[] array) {
        this.array = array;
    }

    public X invoke() {
        if(array == null || array.length ==0)
            return null;
        if(array.length == 1 ) {
                return array[0];
        }

        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (i == 0 && !array[i].equals(array[i+1])) {
                return array[0];
            }
            if (i == array.length-1 && !array[i-1].equals(array[i])) {
                return array[i];
            }
            if (i < array.length-2 && !array[i].equals(array[i+1]) && !array[i+1].equals(array[i+2] )) {
                return array[i+1];
            }
        }
        return null;
    }
}
