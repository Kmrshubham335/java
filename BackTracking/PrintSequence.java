package BackTracking;
import java.util.ArrayList;
public class PrintSequence {
    public static void main(String[] args) {
                int arr[]={1,2};
                int index;
      int result=  PrintSequence(arr, 0, new ArrayList<Integer>());
      System.out.println(result);

        System.out.println();
    }

    public static int PrintSequence(int arr[], int index,ArrayList<Integer>temparry) {
        if(index==arr.length){   //base condition
            if(temparry.size()>0){
            System.out.println(temparry);
            }
        return 0;
    }
    PrintSequence(arr,index+1, temparry);
    temparry.add(arr[index]);
    PrintSequence(arr, index+1, temparry);
    temparry.remove(temparry.size()-1);
        return 0;
    }
}
