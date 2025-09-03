/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class Programa1_Busqueda2D {

    public static void main(String[] args) {
        int[][] matriz = {
            {5, 8, 3},
            {1, 4, 7},
            {9, 6, 2}
        };
        int valorBuscado = 4;
        int[] posicion = buscarValor(matriz, valorBuscado);
        if (posicion[0] != -1) {
            System.out.println("Valor encontrado en la posición: [" + posicion[0] + ", " + posicion[1] + "]");
        } else {
            System.out.println("Valor no encontrado en la matriz.");
        }
    }
    public static int[] buscarValor(int[][] matriz, int valor) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                if (matriz[fila][col] == valor) {
                    return new int[]{fila, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}

