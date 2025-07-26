public class RBSusingRecursion {
    public static void main(String[] args) {
        int[] arr = {5,6,7,1,2,3,4};
        System.out.println(RBS(arr,0,arr.length-1,2));
    }
    static int RBS(int[] arr, int s,int e, int t){
        if(s > e) return -1;

        int m = s + (e-s)/2;

        if(arr[m] == t) return m;

        if(arr[m] >= arr[s]){
            if(t >= arr[s] && t <= arr[m]){
                return RBS(arr,s,m-1,t);
            }
            else{
                return RBS(arr,m+1,e,t);
            }
        }
        if(t >= arr[m] && t <= arr[e]){
            return RBS(arr,m+1,e,t);
        }
        return RBS(arr,s,m-1,t);

    }
}

