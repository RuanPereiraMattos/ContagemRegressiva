/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.ruanmattos.contagemregressiva.main;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ContagemRegressiva {

    public static void main(String[] args) {
        System.out.println("Bem Vindo(a) ao software para realizar uma contagem regressiva");
        System.out.print("Digite o número pelo qual a contagem regressiva irá começar: ");
        Scanner s = new Scanner(System.in);
        int contagem = s.nextInt();
        System.out.println("Iniciando contagem regressiva:");
        for (int i = contagem; i > 0; i--) {
            System.out.println(i);
        }
    }
}
