package SpaceTimeComplexity;

public class Constant {
        public static void main(String args[]){
            int[] arr = new int[]{1,2,3,4,5};

            //Add 10 to the first element of the array
            arr[0] = arr[0] + 10;//Time C => 0(1)

            int sum = arr[arr.length - 1];//S.C => 0(4byte)

            System.out.println(arr[0]);//Time C => 0(1)

            //0(1) + 0(1) = O(2) //constant time complexity
            //O(4byte) = O(1) //constant space commplexity
        }
}


