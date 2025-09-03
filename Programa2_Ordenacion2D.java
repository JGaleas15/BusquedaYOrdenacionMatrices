/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
import java.util.Arrays;

public class Programa2_Ordenacion2D {

    public static void main(String[] args) {
        int[][] matriz = {
            {9, 3, 5},
            {8, 1, 4},
            {2, 7, 6}
        };
        System.out.println("Matriz original:");
        mostrarMatriz(matriz);
        int filaAOrdenar = 1;
        ordenarFila(matriz, filaAOrdenar);
        System.out.println("Matriz después de ordenar la fila " + filaAOrdenar + ":");
        mostrarMatriz(matriz);
    }
    public static void ordenarFila(int[][] matriz, int fila) {
        if (fila >= 0 && fila < matriz.length) {
            Arrays.sort(matriz[fila]);
        } else {
            System.out.println("Fila inválida.");
        }
    }
    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int val : fila) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
