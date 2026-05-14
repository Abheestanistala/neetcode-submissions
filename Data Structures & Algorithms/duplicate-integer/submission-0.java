class Solution {
    public boolean hasDuplicate(int[] nums) {

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // for (n = 0; n < 4; n++){
        //     System.out.println("Enter the array: ");
        // }

        // for (int i = 0; i < nums.length; i++)
        // {
        //     for (int j = i + 1; j < nums.length; j++){
        //         if (nums[i] == nums[j]){
        //         return true;
        //         }
        //     }

        // }
        // return false;

        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            if (s.contains(nums[i])){
                return true;
            }
            s.add(nums[i]);
        }
        return false;
    }
        
}
