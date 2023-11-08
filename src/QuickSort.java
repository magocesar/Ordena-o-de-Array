package src;
public class QuickSort {
    public static int[] Sort(int[] arr){
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Quick Sort");
        System.out.println(java.util.Arrays.toString(arr));
        Sort(arr, 0, arr.length - 1);
        System.out.println("---------------------------------------------------------------------------");
        return arr;
    }

    private static void Sort(int[] arr, int start, int end){
        //Verifica se o array passado possui mais que um elemento.
        if(start < end){
            int pivot = Part(arr, start, end);
            //O pivô já está na posição correta, então ordena-se os elementos a esquerda e a direita do pivô.
            Sort(arr, start, pivot - 1);
            Sort(arr, pivot + 1, end);
        }
    }

    private static int Part(int[] arr, int start, int end){
        //O ultimo elemento é o pivô
        int pivot = arr[end];
        //A variável i manterá a posição do último elemento menor ou igual ao pivô
        //Inicialmente, i é igual a start - 1. Os numeros <= ao pivô ficam a esquerda.
        int i = start - 1;
        //A variável j percorrerá o array
        for(int j = start; j < end; j++){
            //Se o elemento atual for menor ou igual ao pivô, incrementa-se i e troca-se os elementos
            if(arr[j] <= pivot){                              
                i++;
                //Troca-se os elementos, colocando o elemento menor ou igual ao pivô na posição i
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                System.out.println(java.util.Arrays.toString(arr));
            }
        }
        //Por fim, troca-se o pivô com o elemento na posição i + 1
        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;
        System.out.println(java.util.Arrays.toString(arr));
        return i + 1;
    }
}
