package Array;
import java.util.HashMap;
public class countelement {
    public static void main(String[] args) {
        int arr[]={1,1,2,3,4,4,5,5,6,6,6,6,6};
        HashMap<Integer ,Integer>set=new HashMap<>();
        int i;
        for(i=0;i<arr.length;i++){
            if(set.containsKey(arr[i])){
                set.put(arr[i], set.get(arr[i])+1);
            }
            else{
                set.put(arr[i], 1);
            }
        }
        System.out.println(set);
    }
}
