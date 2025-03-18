package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el precio del producto");
        double precioOriginal = scanner.nextDouble();
        System.out.println("ingrese la cantidad de productos a comprar");
        int cantidad = scanner.nextInt();
        System.out.println("Es miembro de la tienda?(true/false)");
        boolean esMiembro =scanner.nextBoolean();
        double totalSindescuento = precioOriginal * cantidad;
        double descuento = 0;
        double totalFinal = totalSindescuento;
        if (totalSindescuento>100 && esMiembro) {
            descuento = totalSindescuento *0.15;

        }else if (totalSindescuento>50 && !esMiembro) {
            descuento=totalSindescuento * 0.05;
        }
        totalFinal = totalSindescuento-descuento;
        System.out.println("total original: "+ totalSindescuento);
        if (descuento>0) {
            System.out.println("descuento aplicado "+ descuento);
        }else{
            System.out.println("no se aplica descuento");

        }
        System.out.println("total final"+ totalFinal );

        scanner.close();

        


     
        
        
        
        
    }
}