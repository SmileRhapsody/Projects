package test;

public class Q238_Product_of_Array_Except_Self {
	public int[] productExceptSelf(int[] nums) {
        int sum = 1;
        int count = 0;
        for(int i:nums){
            if(i==0){
                count++;
                continue;
            }
            sum *= i;
        }
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if (nums[i]==0){
                if(count==1)
                    result[i]=sum;
                else
                    result[i]=0;
            } 
            else if(count>0)
                result[i] = 0;
            else
                result[i] = sum/nums[i];
        }
        
        return result;
    }
	
	
	public int[] productExceptSelf2(int[] nums) {
        int n = nums.length;
    int[] res = new int[n];
    res[0] = 1;
    for (int i = 1; i < n; i++) {
        res[i] = res[i - 1] * nums[i - 1];
    }
    int right = 1;
    for (int i = n - 1; i >= 0; i--) {
        res[i] *= right;
        right *= nums[i];
    }
    return res;
    }
}
