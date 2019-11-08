import java.util.ArrayList;

public class NotReplySymbArray {


    public ArrayList NotReplySymbol(int[] array) {

        ArrayList SuperNum = new ArrayList();

        int counterSuperNum = 0;

        for (int i = 0; i < array.length; i++) {
            boolean fl = true;
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    fl = false;
                }
            }
            if (fl) {
                SuperNum.add(0,array[i]);
            }
        }
        return SuperNum;
    }
}