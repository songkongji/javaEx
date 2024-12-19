package ch7ex;

public class Array {
    public static void main(String[] args){
        int[] nums = new int[5];
        int total = 0;
        int j = 0;

        for(int i = 1; i <= 10; i++){
                if(i % 2 == 0) {
                    nums[j] = i;
                    total += nums[j];
                    System.out.print(nums[j] + " ");
                    j++;
            }
        }
        System.out.println("\n 짝수의 총합 : " + total);
    }
}
