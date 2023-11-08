package src;
public class InsertionSort {
    public static int[] Sort(int[] arr){
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Insertion Sort");
        System.out.println(java.util.Arrays.toString(arr));
        //Percorre o array
        for(int i = 0; i < arr.length; i++){
            int j = i;
            //Enquanto o elemento anterior for maior que o elemento atual, troca-se os elementos
            while(j > 0 && arr[j - 1] > arr[j]){
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
                System.out.println(java.util.Arrays.toString(arr));
            }
        }
        System.out.println("---------------------------------------------------------------------------");
        return arr;
    }
}