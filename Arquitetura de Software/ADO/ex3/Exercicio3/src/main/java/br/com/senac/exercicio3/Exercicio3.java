package br.com.senac.exercicio3;
//Com base no exercício quais são as classes de contexto e as estratégias? 

//Classes de Contexto:
//SortingContext
//
//Estratégias:
//InsertionSort
//SelectionSort
//BubbleSort
//Essas classes seguem o padrão Strategy: interface SortingStrategy 
//É implicitamente (InsertionSort, SelectionSort, BubbleSort). 

interface SortingStrategy {

    int[] sort(int[] array);
}

class InsertionSort implements SortingStrategy {

    @Override
    public int[] sort(int[] array) {
        int i, j, temp;
        for (i = 1; i < array.length; i++) {
            temp = array[i];
            j = i;
            while (j > 0 && array[j - 1] >= temp) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp;
        }
        return array;
    }
}

class SelectionSort implements SortingStrategy {

    @Override
    public int[] sort(int[] array) {
        int i, j, min, aux;
        for (i = 0; i < array.length - 1; i++) {
            min = i;
            for (j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }

            aux = array[i];
            array[i] = array[min];
            array[min] = aux;
        }
        return array;
    }
}

class BubbleSort implements SortingStrategy {

    @Override
    public int[] sort(int[] array) {
        int i, j, temp;
        for (j = 0; j < array.length - 1; j++) {
            for (i = 0; i < array.length - 1 - j; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }
}

class SortingContext {

    private SortingStrategy sortingStrategy;

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public int[] executeSort(int[] array) {
        if (sortingStrategy == null) {
            throw new IllegalStateException("A estratégia de ordenação não foi definida.");
        }

        return sortingStrategy.sort(array);
    }
}

public class Exercicio3 {

    public static void main(String[] args) {
        int[] array1 = {5, 2, 8, 7, 1, 3, 6, 4, 9, 10};
        int[] array2 = {15, 22, 8, 17, 11, 13, 26, 14, 19, 20};
        int[] array3 = {3, 9, 18, 4, 12, 7, 10, 6, 11, 14};

        SortingContext context = new SortingContext();

        // Teste com InsertionSort
        context.setSortingStrategy(new InsertionSort());
        context.executeSort(array1);
        System.out.println("InsertionSort: " + java.util.Arrays.toString(array1));

        // Teste com SelectionSort
        context.setSortingStrategy(new SelectionSort());
        context.executeSort(array2);
        System.out.println("SelectionSort: " + java.util.Arrays.toString(array2));

        // Teste com BubbleSort
        context.setSortingStrategy(new BubbleSort());
        context.executeSort(array3);
        System.out.println("BubbleSort: " + java.util.Arrays.toString(array3));
    }
}
