package fillers;


import java.util.Arrays;
import java.util.Random;

/**
 * Created by Max on 30.10.2018.
 */
public class Fillers {
    private static int N = 20;
    public static int[] genArr = new int[N];
    private static int[] array = new int[N];
    private static int[] arrayReserve = new int[N];
    private static int[] arrayBig = new int[N + 1];

    private static Random random = new Random();

    public Object[] massFillers = {genArraySort(), genArraySortRand(), genArraySortReverse(), genArraySortReverse(), genArrayRandom()};

    public Object[] getMassFillers() {
        return massFillers;
    }

    //Массив из рандомных элементов в диапазоне 0-100 в рандомном порядке
    public static int[] GeneretedArray(){
        for (int i = 0; i < N; i++) {
            genArr[i] =  (random.nextInt(100));
        }
        //System.out.println(Arrays.toString(genArr));
        return genArr;
    }

    Object o1 = GeneretedArray();
    /*public static void main(String[] args) {

        genArraySort();
        genArraySortRand();
        genArraySortReverse();
        genArrayRandom();
    }*/

    public static int getN() {
        return N;
    }

    //отсортированный массив
    public static int[] genArraySort() {

        array = new int[N];
        //Random random = new Random();
        //System.out.print("Отсортированный массив:        ");
        for (int i = 0; i < N; i++) {
            array[i] = genArr[i];
        }
        Arrays.sort(array);
        //System.out.println(Arrays.toString(array));


        return array;
    }


    //отсортированный массив +1 рандомный элемент в конце
    public static int[] genArraySortRand() {
        Random random = new Random();
        //System.out.print("Массив со случайным элементом: ");
        for (int i = 0; i < N; i++) {
            arrayBig[i] = array[i];
        }
        arrayBig[N] = random.nextInt(N + 1);
        //System.out.println(Arrays.toString(arrayBig));

        return arrayBig;
    }


    public static int[] genArraySortReverse() {
        int temp;
        //System.out.print("Обратный массив:               ");
        for (int i = 0; i < N / 2; i++) {

            temp = array[i];
            array[i] = array[N - i - 1];
            array[N - i - 1] = temp;
        }
        //System.out.println(Arrays.toString(array));
        return array;
    }

    public static int[] getReverse(){
        for (int i = 0; i < N; i++) {
            arrayReserve[i] = array[i];
        }

        return arrayReserve;
    }


    public static int[] genArrayRandom(){
        Random random = new Random();
        //System.out.print("Элементы в случайном порядке:  ");
        for (int i = 0; i < N; i++) {
            int j = random.nextInt(i+1);
            //array[i] = genArr[i];
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        //System.out.println(Arrays.toString(array)+"\n");
        return array;
    }



}
