public class binarysearch{
    public static int findingtarget(int numbers[],int target){
        int start=0;
        int end=numbers.length-1;
  int mid=(start+end)/2;
             

        while(start<=end){
            if(numbers[mid] == target){
                return mid;
            }
            if(target>numbers[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
            mid=(start+end)/2;
        }
        return -1;
    }

    public static void main(String args[]){
        int numbers[]={-1,0,3,5,9,12};
        int target=9;
        int index=findingtarget(numbers,target);
        System.out.println("index is: "+index);
    }
}
