package sort123;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Sorter{
    private Comparable compare;

    public void setComparable(Comparable compare) {
        this.compare = compare;
    }
    
    public void bubbleSort(Object[] obj) {
        for (int i = 0; i < obj.length - 1; i++) {
            for (int j = 0; j < obj.length - i - 1; j++) {
                if (compare.compareTo(obj[j], obj[j + 1]) > 0) { // swap
                    Object temp = obj[j];
                    obj[j] = obj[j + 1];
                    obj[j + 1] = temp;
                }
            }
        }
    }
}