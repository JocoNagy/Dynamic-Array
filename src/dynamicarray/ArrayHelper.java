/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicarray;

import java.lang.reflect.Array;

/**
 *
 * @author Joco
 */
public final class ArrayHelper {

    /**
     * It takes an Array and removes an element at the specified index
     *
     * @param <T> Type
     * @param typeClass the class of the type of the array
     * @param array the array you want to operate on
     * @param index the index of the element you want to remove
     * @return the new reduced array
     */
    public static <T> T[] removeElementAtIndex(Class<T> typeClass, T[] array, int index) {
        @SuppressWarnings("unchecked")
        T[] newArray = (T[]) Array.newInstance(typeClass, array.length - 1);
        int ujTombIndex = 0;
        for (int eredetiTombIndex = 0; eredetiTombIndex < array.length; eredetiTombIndex++) {
            if (eredetiTombIndex != index) {
                newArray[ujTombIndex] = array[eredetiTombIndex];
                ujTombIndex++;
            }
        }
        return newArray;
    }

    /**
     * It takes an Array and add the specified element to the end of the it
     *
     * @param <T> Type
     * @param typeClass the class of the type of the array
     * @param array the array you want to operate on
     * @param element the element you want to add
     * @return the new extended array
     */
    public static <T> T[] addElement(Class<T> typeClass, T[] array, T element) {
        @SuppressWarnings("unchecked")
        T[] newArray = (T[]) Array.newInstance(typeClass, array.length + 1);
        int i = 0;
        while (i < array.length) {
            newArray[i] = array[i];
            i++;
        }
        newArray[i] = element;

        return newArray;
    }

    /**
     *
     * /**
     * It takes an Array and inserts an element to the specified index
     *
     * @param <T> Type
     * @param typeClass the class of the type of the array
     * @param array the array you want to operate on
     * @param index the index where you want to insert the element
     * @param element the element you want to add
     * @return the new extended array
     */
    public static <T> T[] insertElement(Class<T> typeClass, T[] array, int index, T element) {
        if (index > array.length - 1) {
            return addElement(typeClass, array, element);
        }
        @SuppressWarnings("unchecked")
        T[] newArray = (T[]) Array.newInstance(typeClass, array.length + 1);
        int ujTombIndex = 0;  

        for (int eredetiTombIndex = 0; eredetiTombIndex < array.length; eredetiTombIndex++) {
            if (ujTombIndex == index) {  
                newArray[ujTombIndex] = element;
                ujTombIndex++;
            }
            newArray[ujTombIndex] = array[eredetiTombIndex];
            ujTombIndex++;
        }
        return newArray;
    }

    /**
     *
     * /**
     * It takes an Array removes all of its elements that equals with element
     * parameter
     *
     * @param <T> Type
     * @param typeClass the class of the type of the array
     * @param array the array you want to operate on
     * @param element the element you want to remove
     * @return if there was no change it returns the original array otherwise
     * the reduced array
     */
    public static <T> T[] removeElement(Class<T> typeClass, T[] array, T element) {
        int objectCount = contains(typeClass, array, element);
        if (objectCount > 0) {
            @SuppressWarnings("unchecked")
            T[] newArray = (T[]) Array.newInstance(typeClass, array.length - objectCount);
            int j = 0;
            for (T t : array) {
                if (!t.equals(element)) {
                    newArray[j] = t;
                    j++;
                }
            }

            return newArray;
        }
        return array;
    }

    /**
     * Takes an array and counts how many of its elements equals with the
     * parameter
     *
     * @param <T> Type
     * @param typeClass the class of the type of the array
     * @param array the array you want to operate on
     * @param element the element you want to check
     * @return how many times the element exists in the array
     */
    public static <T> int contains(Class<T> typeClass, T[] array, T element) {
        int counter = 0;
        for (T t : array) {
            if (t.equals(element)) {
                counter++;
            }
        }
        return counter;
    }
}
