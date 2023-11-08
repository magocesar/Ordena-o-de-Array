package src;
public class BubbleSort{
    public static int[] Sort(int[] arr){
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Bubble Sort");
        System.out.println(java.util.Arrays.toString(arr));
        //Percorre o array
        for(int i = 0; i < arr.length; i++){
            //Após a primeira iteração, o maior elemento estará na última posição
            //Por conta disso, não é necessário percorrer o array até o final.
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j + 1] < arr[j]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    System.out.println(java.util.Arrays.toString(arr));
                }
            }
        }
        System.out.println("---------------------------------------------------------------------------");
        return arr;
    }
}