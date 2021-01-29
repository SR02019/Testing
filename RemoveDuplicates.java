import java.util.*;

/**
 * InnerRemoveDuplicates
 */

class RemoveDuplicates {
    static int[] sort(int[] a){
        Map <Integer, Integer> mapsort = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < a.length-1; i++) {
            if (mapsort.containsKey(a[i])) {
                mapsort.put(a[i], mapsort.get(a[i]) + 1);
            } else {
                mapsort.put(a[i], 1);
            }
        }
        System.out.println(mapsort);
        for (Integer key: mapsort.keySet()){
            if(mapsort.get(key) == 1){
                result.add(key);
                
            }
        }
        return result.stream().filter(Objects::nonNull).mapToInt(i -> i).toArray();
    }
   public static void main(String[] args) {
        
        int[] arr = {2,0,3,1,3};
        int[] results = sort(arr);
        System.out.println(Arrays.toString(results));

    }
}
