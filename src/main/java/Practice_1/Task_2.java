package Practice_1;

public class Task_2 {
//    Дан массив nums = [3,2,2,3] и число val = 3. Если в массиве есть числа,
//    равные заданному, нужно перенести эти элементы в конец массива. Таким
//    образом, первые несколько (или все) элементов массива должны быть отличны
//    от заданного, а остальные - равны ему.
    public static void main (String[] args){
        int[] nums = {3, 3, 2, 3, 2, 1, 3, 5, 5, 3, 3, 7};
        int val = 3;
        swap(nums, val);
        for (int num : nums) {
            System.out.print(num + " ");
            
        }
    }
    static void swap(int[] array, int val){
        int tmp;
        int size = array.length -1;
        for(int i = 0; i <= size; i++){
            while (array[size] == val){
                size--;
            }
            if (array[i] == val) {
                tmp = array[size];
                array[size] = array[i];
                array[i] = tmp;
                size --;
            }
        }
    }
}

