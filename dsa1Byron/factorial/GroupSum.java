package factorial;

public class GroupSum
{
    public static void main(String[] args)
    {
        int[] testList = {1, 2, 3};
        boolean var = groupSum(0, testList, 3);
        System.out.println(var);
    }    

    public static boolean groupSum(int start, int[] nums, int target)
    {
        if(start == nums.length)
        {
            if(target == 0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        if(nums[start] == 6)
        {
            if(groupSum(start + 1, nums, target - nums[start]))
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        if(groupSum(start + 1, nums, target - nums[start]) || groupSum(start + 1, nums, target))
        {
            return true;
        }
        else
        {
            return false;

        }
    }
}