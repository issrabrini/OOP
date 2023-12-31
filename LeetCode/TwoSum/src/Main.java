import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 1};
        int target=4;
        TwoSum s=new TwoSum();
        int[] r=s.twoSum(nums,target);
        System.out.println("["+r[0]+","+r[1]+"]");
    }


}