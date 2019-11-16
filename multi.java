import java.util.Arrays;
public class HelloWorld{
 
    public static void pro(int arr[]){
        int  a[]= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int mul=1;
            for(int k=0;k<i;k++){
                mul=mul*arr[k];
            }
            for(int j=i+1;j<arr.length;j++){
             mul=mul*arr[j];
            }
            a[i]=mul;
        }
    
        System.out.println(Arrays.toString(a));
        
    }
     public static void main(String []args){
        int arr[]={1,2,3,4,5};
      HelloWorld.pro(arr);
     }
}
