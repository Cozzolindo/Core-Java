package Arrays;

public class ThreeToFive {
    
    public static void main(String[] args) {
        int a[] = {0,1,2,3,4,5,6,7,8,9,1,23,4,5,5,5,5,3};
        for(int i = 0; i<a.length; i++){
            if(a[i]==3){
                a[i]=5;
            }else if(a[i]==5){
                a[i] = 3;
            }
        }
        for(int ele : a){
            System.out.println(ele);
        }
    }
}
