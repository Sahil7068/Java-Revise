package array;

public class MissingNumber_Array {
    public static void main(String[] args) {
        int a [] = {1,2,4,6,3,7,8};
        int n = a.length+1;
        int currSum=0;

        int totalSum = n*(n+1)/2;

        for (int k : a){
            currSum +=k;

        }

        int answer = totalSum - currSum;

        System.out.println(answer);

    }
}
