package test;
import java.util.*;

public class Q015_3Sum {
	public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for(int i=0;i<nums.length-2;i++){
            int start = i+1;
            int end = nums.length-1;
            while(start<end){
                if(nums[start]+nums[end]>0-nums[i])
                    end--;
                else if(nums[start]+nums[end]<0-nums[i])
                    start++;
                else if(nums[start]+nums[end] == 0-nums[i]){
                    result.add(Arrays.asList(nums[i],nums[start],nums[end]));
                    start++;
                }
            }
        }
        return new ArrayList<>(result);
    }
}
