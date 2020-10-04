/**
Merge two sorted array without additional space
 */

 class MergeTwoSortedArray{

     public static int getGap(int gap){

         if(gap <=1){
             return 0;
         }
         return (gap/2)+ (gap%2);
     }

     public static void mergeTwoArray(int arr1[],int arr2[],int n,int m){

         //use the gap methodology
        //process until the gap is not 0
         int gap;
        for(gap=getGap(m+n); gap >0 ; gap=getGap(gap)){
            int i,j;
            //compare the element for first array
            for(i=0;i+gap<n;i++){

                if(arr1[i]> arr1[i+gap]){
                    int temp=arr1[i+gap];
                    arr1[i+gap]=arr1[i];
                    arr1[i]=temp;
                }
            }

            //compare the element for first and second array
            for(j=gap>n?gap-n:0;j<m && i<n;j++,i++){
                
                if(arr1[i]>arr2[j]){
                    int temp=arr2[j];
                    arr2[j]=arr1[i];
                    arr1[i]=temp;
                }
            }

            //compare the element for the last array
            if(j<m){

                for(j=0;j+gap<m;j++){
                    if(arr2[j]> arr2[j+gap]){
                        int temp=arr2[j+gap];
                        arr2[j+gap]=arr2[j];
                        arr2[j]=temp;
                    }
                }
            }
        }
        
     }
     public static void main(String args[]){

         int arr1[]={1, 5, 9, 10, 15, 20};
         int arr2[]={2, 3, 8, 13};
         MergeTwoSortedArray.mergeTwoArray(arr1,arr2,arr1.length,arr2.length);
         for(int number:arr1){
             System.out.print(number+" ");
         }
         System.out.println();

         for(int number:arr2){
             System.out.print(number+" ");
         }
         System.out.println();
     }
 }