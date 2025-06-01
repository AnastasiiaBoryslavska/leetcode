import java.util.ArrayList;
import java.util.List;

class Solution {
    public void duplicateZeros(int[] arr) {
        List<Integer> ll = new ArrayList();
        int index = 0;
        //index increment as we add elements in List
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                ll.add(index++, arr[i]);      // zero from array
                ll.add(index++, 0);           // add duplicate zero
            } else {
                ll.add(index++, arr[i]);
            }
            arr[i] = ll.get(i);
            // we will update our Arrays form 0 , with respect to our Updated list
        }
    }
}
