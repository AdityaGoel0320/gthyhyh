public class arrray {
    public static void main(String[] args) {
        int[][] arr1 = {
            {1,2} , 
            {3,4}
        } ; 
        int[][] arr2 = {
            {5,6} , 
            {7,8}
        } ; 
        int[][] arr3 =  new int[2][] ;
        for(int i =0 ; i<=arr1.length-1 ; i++){
            for(int j = 0 ; j<=arr2.length-1 ; j++){

                arr3[i][j] = arr1[i][j]  +arr2[i][j] ; 

            }
        }

        for(int i =0 ; i<=arr1.length-1 ; i++){
            for(int j = 0 ; j<=arr2.length-1 ; j++){

                System.out.println(arr3[i][j]) ;


                

            }
        }
        

    }
    
}
