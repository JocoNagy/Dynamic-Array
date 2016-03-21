/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicarray;

import java.util.Arrays;

/**
 *
 * @author Joco
 */
public class DynamicArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] sTomb = {"a", "b", "c", "d", "e", "f"};
        Integer[] iTomb = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("String tömb: " + Arrays.toString(sTomb));
        System.out.println("Integer tömb: " + Arrays.toString(iTomb));
        sTomb = ArrayHelper.addElement(String.class, sTomb, "almaFa");
        iTomb = ArrayHelper.addElement(Integer.class, iTomb, 55);
        System.out.println("String tömb: (add)" + Arrays.toString(sTomb));
        System.out.println("String tömb: (add)" + Arrays.toString(sTomb));
        sTomb = ArrayHelper.insertElement(String.class, sTomb, 2, "lll");
        iTomb = ArrayHelper.insertElement(Integer.class, iTomb, 3, 55);
        System.out.println("String tömb: (insert)" + Arrays.toString(sTomb));
        System.out.println("String tömb: (insert)" + Arrays.toString(sTomb));

    }

}
