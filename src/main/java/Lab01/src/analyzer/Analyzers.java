package analyzer;

import output.Outputs;
import sorters.Sorts;
import fillers.Fillers;

/**
 * Created by Max on 30.10.2018.
 */
public class Analyzers {
    public static long end;
    public static long start;
    //public static int[] sortedArray;

    public static void main(String[] args) {

        Outputs outp = new Outputs();
        Sorts sort = new Sorts();
        Fillers fillers = new Fillers();


        outp.showGenArr();

        System.out.println("\n\t\t\tСортировка пузырьком");

        outp.showGenArraySort();
        start = System.nanoTime();
        sort.BubbleSortDirect(fillers.genArraySort());
        //System.out.println(Arrays.toString(fillers.genArraySort()));
        end = System.nanoTime();
        outp.showResults();

        outp.showGenArraySortRand();
        start = System.nanoTime();
        sort.BubbleSortDirect(fillers.genArraySortRand());
        end = System.nanoTime();
        outp.showResults();


        outp.showGenArraySortReverse(fillers.genArraySortReverse());
        start = System.nanoTime();
        sort.BubbleSortDirect(fillers.genArraySortReverse());
        end = System.nanoTime();
        outp.showResults();

        outp.showGenArrayRandom();
        start = System.nanoTime();
        sort.BubbleSortDirect(fillers.genArrayRandom());
        end = System.nanoTime();
        outp.showResults();

        ///////////////////////////////////////////////////////////

        System.out.println("\n\t\t\tСортировка пузырьком обратно");

        outp.showGenArraySort();
        start = System.nanoTime();
        sort.BubbleSortReverse(fillers.genArraySort());
        end = System.nanoTime();
        outp.showResults();

        outp.showGenArraySortRand();
        start = System.nanoTime();
        sort.BubbleSortReverse(fillers.genArraySortRand());
        end = System.nanoTime();
        outp.showResults();

        outp.showGenArraySortReverse(fillers.genArraySortReverse());
        start = System.nanoTime();
        sort.BubbleSortReverse(fillers.genArraySortReverse());
        end = System.nanoTime();
        outp.showResults();

        outp.showGenArrayRandom();
        start = System.nanoTime();
        sort.BubbleSortReverse(fillers.genArrayRandom());
        end = System.nanoTime();
        outp.showResults();

        /////////////////////////////////////////////////////////

        System.out.println("\n\t\t\tQuickSort");

        outp.showGenArraySort();
        start = System.nanoTime();
        sort.QuickSort(fillers.genArraySort());
        end = System.nanoTime();
        outp.showResults();

        outp.showGenArraySortRand();
        start = System.nanoTime();
        sort.QuickSort(fillers.genArraySortRand());
        end = System.nanoTime();
        outp.showResults();

        outp.showGenArraySortReverse(fillers.genArraySortReverse());
        start = System.nanoTime();
        sort.QuickSort(fillers.genArraySortReverse());
        end = System.nanoTime();
        outp.showResults();

        outp.showGenArrayRandom();
        start = System.nanoTime();
        sort.QuickSort(fillers.genArrayRandom());
        end = System.nanoTime();
        outp.showResults();

        //////////////////////////////////////////////////////////

        System.out.println("\n\t\t\tArrays.sort");

        outp.showGenArraySort();
        start = System.nanoTime();
        sort.arraysSort(fillers.genArraySort());
        end = System.nanoTime();
        outp.showResults();

        outp.showGenArraySortRand();
        start = System.nanoTime();
        sort.arraysSort(fillers.genArraySortRand());
        end = System.nanoTime();
        outp.showResults();

        outp.showGenArraySortReverse(fillers.genArraySortReverse());
        start = System.nanoTime();
        sort.arraysSort(fillers.genArraySortReverse());
        end = System.nanoTime();
        outp.showResults();

        outp.showGenArrayRandom();
        start = System.nanoTime();
        sort.arraysSort(fillers.genArrayRandom());
        end = System.nanoTime();
        outp.showResults();

        /////////////////////////////////////////////////////////

        System.out.println("\n\t\t\tСортировка пузырьком + слияние");

        outp.showGenArraySort();
        start = System.nanoTime();
        sort.BubbleSortDirectMod(fillers.genArraySort());
        end = System.nanoTime();
        outp.showResults();

        outp.showGenArraySortRand();
        start = System.nanoTime();
        sort.BubbleSortDirectMod(fillers.genArraySortRand());
        end = System.nanoTime();
        outp.showResults();

        outp.showGenArraySortReverse(fillers.genArraySortReverse());
        start = System.nanoTime();
        sort.BubbleSortDirectMod(fillers.genArraySortReverse());
        end = System.nanoTime();
        outp.showResults();

        outp.showGenArrayRandom();
        start = System.nanoTime();
        sort.BubbleSortDirectMod(fillers.genArrayRandom());
        end = System.nanoTime();
        outp.showResults();

        ///////////////////////////////////////////////////////////

        System.out.println("\n\t\t\tСортировка пузырьком обратно + слияние");

        outp.showGenArraySort();
        start = System.nanoTime();
        sort.BubbleSortReverseMod(fillers.genArraySort());
        end = System.nanoTime();
        outp.showResults();

        outp.showGenArraySortRand();
        start = System.nanoTime();
        sort.BubbleSortReverseMod(fillers.genArraySortRand());
        end = System.nanoTime();
        outp.showResults();

        outp.showGenArraySortReverse(fillers.genArraySortReverse());
        start = System.nanoTime();
        sort.BubbleSortReverseMod(fillers.genArraySortReverse());
        end = System.nanoTime();
        outp.showResults();

        outp.showGenArrayRandom();
        start = System.nanoTime();
        sort.BubbleSortReverseMod(fillers.genArrayRandom());
        end = System.nanoTime();
        outp.showResults();

        //////////////////////////////////////////////////////////

        System.out.println("\n\t\t\tQuickSort + слияние");

        outp.showGenArraySort();
        start = System.nanoTime();
        sort.QuickSortMod(fillers.genArraySort());
        end = System.nanoTime();
        outp.showResults();

        outp.showGenArraySortRand();
        start = System.nanoTime();
        sort.QuickSortMod(fillers.genArraySortRand());
        end = System.nanoTime();
        outp.showResults();

        outp.showGenArraySortReverse(fillers.genArraySortReverse());
        start = System.nanoTime();
        sort.QuickSortMod(fillers.genArraySortReverse());
        end = System.nanoTime();
        outp.showResults();

        outp.showGenArrayRandom();
        start = System.nanoTime();
        sort.QuickSortMod(fillers.genArrayRandom());
        end = System.nanoTime();
        outp.showResults();

        //////////////////////////////////////////////////////////

        System.out.println("\n\t\t\tArrays.sort + слияние");

        outp.showGenArraySort();
        start = System.nanoTime();
        sort.arraysSortMod(fillers.genArraySort());
        end = System.nanoTime();
        outp.showResults();

        outp.showGenArraySortRand();
        start = System.nanoTime();
        sort.arraysSortMod(fillers.genArraySortRand());
        end = System.nanoTime();
        outp.showResults();

        outp.showGenArraySortReverse(fillers.genArraySortReverse());
        start = System.nanoTime();
        sort.arraysSortMod(fillers.genArraySortReverse());
        end = System.nanoTime();
        outp.showResults();

        outp.showGenArrayRandom();
        start = System.nanoTime();
        sort.arraysSortMod(fillers.genArrayRandom());
        end = System.nanoTime();
        outp.showResults();


    }

}
