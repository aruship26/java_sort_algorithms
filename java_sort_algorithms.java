// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Sorting {
    //static int [] arr = {9,8,7,6,5,4,3,2,1};
    static int [] arr = {1,2,3,4,5,6,7,8,9};
    Sorting(){};
        
    public static  void bubbleSort_asc_l2r(){
        for(int v = arr.length-1; v>=0;v--){
            for(int i =0;i<v;i++){
                if(arr[i]>arr[i+1]){
                    swap(i,i+1);
                }
            }
        printArr();
    }
}
 
 public static  void bubbleSort_asc_r2l(){
        for(int v=0; v < arr.length-1; v++){
            for(int i = arr.length-1;i>v;i--){
                if(arr[i-1]>arr[i]){
                    swap(i,i-1);
                }
            }
        printArr();
    }
}
    
    public static  void bubbleSort_dsc_l2r(){
        for(int v = arr.length-1; v>=0;v--){
            for(int i =0;i<v;i++){
                if(arr[i]<arr[i+1]){
                    swap(i,i+1);
                }
            }
        printArr();
    }
}


    public static  void bubbleSort_dsc_r2l(){
        for(int v=0; v < arr.length;v++){
            for(int i =arr.length-1;i>v;i--){
                if(arr[i]>arr[i-1]){
                    swap(i,i-1);
                }
            }
        printArr();
    }
}

 public static  void selectSort_asc_l2r(){
     for(int v=0; v<arr.length-1; v++){
         int minIndex = v;
         for(int i=v; i<=arr.length-1; i++){
             if(arr[i]<arr[minIndex]){
                 minIndex = i;
             }
         }
         swap(v,minIndex);
         printArr();
     }
}
 
 public static  void selectSort_asc_r2l(){
     for(int v=arr.length-1; v>=0; v--){
         int maxIndex = v;
         for(int i=v; i>=0; i--){
             if(arr[i]>arr[maxIndex]){
                 maxIndex = i;
             }
         }
         swap(v,maxIndex);
         printArr();
     }
     
}
    
    public static  void selectSort_dsc_l2r(){
        for(int v=0; v<arr.length-1; v++){
         int maxIndex = v;
         for(int i=v; i<=arr.length-1; i++){
             if(arr[i]>arr[maxIndex]){
                 maxIndex = i;
             }
         }
         swap(v,maxIndex);
         printArr();
     }
}


    public static  void selectSort_dsc_r2l(){
        for(int v=arr.length-1; v>=0; v--){
         int minIndex = v;
         for(int i=v; i>=0; i--){
             if(arr[i]<arr[minIndex]){
                 minIndex = i;
             }
         }
         swap(v,minIndex);
         printArr();
    }
}
    
    

    public static  void insertSort_asc_r2l(){
       for(int v=arr.length-2;v>=0;v--){
           int temp=arr[v];
           int i=v+1;
           while(i<=arr.length-1 && arr[i]<temp){
               arr[i-1]=arr[i];
               i++;
           }
           arr[i-1]=temp;
        printArr();

       }
    }

public static  void insertSort_asc_l2r(){
       for(int v=1; v<arr.length;v++){
           int temp=arr[v];
           int i=v-1;
           while(i>=0 && arr[i]>temp){
               arr[i+1]=arr[i];
               i--;
           }
           arr[i+1]=temp;
           printArr();
       }
    }


public static  void insertSort_dsc_l2r(){
       for(int v=1; v<arr.length;v++){
           int temp=arr[v];
           int i=v-1;
           while(i>=0 && arr[i]<temp){
               arr[i+1]=arr[i];
               i--;
           }
           arr[i+1]=temp;
           printArr();
       }
    }

public static  void insertSort_dsc_r2l(){
       for(int v=arr.length-2; v>=0;v--){
           int temp=arr[v];
           int i=v+1;
           while(i<arr.length && arr[i]>temp){
               arr[i-1]=arr[i];
               i++;
           }
           arr[i-1]=temp;
           printArr();
       }
    }


    
    static public void swap(int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    static public void printArr(){
        for(int i =0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
            System.out.println();
    }
    public static void main(String[] args) {
        //Sorting mySort;
        //bubbleSort_asc_l2r();
        //bubbleSort_asc_r2l();
        //bubbleSort_dsc_l2r();
        //bubbleSort_dsc_r2l();
       // selectSort_asc_l2r();
        //selectSort_asc_r2l();
        //selectSort_dsc_l2r();
        //selectSort_dsc_r2l();
        //insertSort_asc_r2l();
        //insertSort_asc_l2r();
        //insertSort_dsc_l2r();
        insertSort_dsc_r2l();
    }
}