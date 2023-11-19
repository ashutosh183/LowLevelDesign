package strategy;

import java.util.List;

public class BinarySearcher implements Searcher{
    @Override
    public Integer search(Integer key, List<Integer>nums){
        int low = -1, high = nums.size();
        while(low + 1 < high){
            int mid = low + (high - low)/2;
            if(nums.get(mid) > key){
                high = mid;
            }else{
                low = mid;
            }
        }
        if(low == -1){
            return -1;
        }
        if(nums.get(low) == key){
            return low;
        }
        return -1;
    }
}
