
public class CountingElements {
    private int[] array;
    private int value;
    private int count;
    private boolean[] occurs;

    public CountingElements(int[] array, int value) {
        this.array = array;
        this.value = value;
        occurs = new boolean[100000];
        this.count = 0;
    }

    public int invoke() {
        for(int i=0; i < array.length; i++) {
            if(!occurs[array[i]] && array[i]<= value) {
                occurs[array[i]] = true;
                count++;
            }
            if(count == value) {
                return i;
            }
        }
        return -1;
    }
}
