package Arrays;

public class ArraysDemo {
    
    public static void main(String[] args) {
        
        //int arr[] = {1,2,3,4,5};

        int arr[] = new int[5];

        arr[0] = new Integer(20);
        arr[1] = 1;
        arr[2] = 3;
        arr[3] = 20;
        arr[4] = 0;

        int lista[] = new int[20];
        for(int i = 0; i < lista.length; i++){
             lista[i] = i*i;
        }

        for(int i = 0; i < lista.length; i++){
            System.out.println(lista[i]);
       }

       for(int i = 0; i < lista.length; i++){
        System.out.println(arr[i]);
        }
    }
}
