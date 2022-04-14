package Arrays;

public class ArraysDemo {
    
    public static void main(String[] args) {
        
        //int arr[] = {1,2,3,4,5};

        int arr[] = new int[5];

        int lista[] = new int[20];
        for(int i = 0; i < lista.length; i++){
             lista[i] = i*i;
        }

        for(int i = 0; i < lista.length; i++){
            System.out.println(lista[i]);
       }

       for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        for(int element : arr){
            arr[element] = element +1;
        }

        for(int i : arr){
            System.out.println(i);
        }
        for(int ele : lista){
            System.out.println(ele);
        }
    }
}
