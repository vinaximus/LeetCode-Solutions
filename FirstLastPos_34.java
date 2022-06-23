public class FirstLastPos_34 {

    public static int searchFirstElement(int[] nums,int target) {
        //returns the index of the element that is found, returns -1 if not found
        //TC=O(logn)
        
        int start=0;
        int end=nums.length-1;
        int mid=((start+end)/2);
        int first=-1;
        while (start<=end) {
            
            if (target>nums[mid]) {
                start=mid+1;
            }
            else if (target<nums[mid]) {
                end=mid-1;
            } else {
                first=mid;
                end=mid-1;
            }
            
            mid=((start+end)/2);
            
        }

        return first; 
    }

    public static int searchLastElement(int[] nums,int target) {
        //returns the index of the element that is found, returns -1 if not found
        //TC=O(logn)
        int start=0;
        int end=nums.length-1;
        int mid=((start+end)/2);
        int last=-1;
        while (end>=start) {
            
            if (target>nums[mid]) {
                start=mid+1;
            }
            else if (target<nums[mid]) {
                end=mid-1;
            } else {
                last=mid;
                start=mid+1;
            }
            mid=((start+end)/2);
            
        }

        return last;
    }

   

    public static void main(String[] args) {
        int[] arr={1,2,2,6,6,6,7,8,9,14,15};
        int t=15;
        int m=searchFirstElement(arr, t);
        int n=searchLastElement(arr, t);
        System.out.println(m+", "+n);
        //System.out.println(GetLeftElement(arr, t, m));


    }

}