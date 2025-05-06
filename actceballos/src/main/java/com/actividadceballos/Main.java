package com.actividadceballos;

    import java.util.Scanner;

    public class Main {
       public Main() {
       }
    
       public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
    
          int opcion;
          do {
             System.out.println("\nMENÚ");
    
             for(int i = 1; i <= 30; ++i) {
                System.out.println("" + i + ". Ejercicio " + i);
             }
    
             System.out.println("0. Salir");
             System.out.print("Seleccione una opción: ");
             opcion = scanner.nextInt();
             if (opcion >= 1 && opcion <= 30) {
                try {
                   Main.class.getMethod("ejercicio" + opcion, Scanner.class).invoke((Object)null, scanner);
                } catch (Exception var4) {
                   System.out.println("Error al ejecutar el ejercicio " + opcion + ": " + var4.getMessage());
                }
             } else if (opcion != 0) {
                System.out.println("Opción no válida. Intente de nuevo.");
             }
          } while(opcion != 0);
    
          scanner.close();
       }
    
       public static void ejercicio1(Scanner scanner) {
          System.out.print("Ingrese un número: ");
          int numero = scanner.nextInt();
          System.out.println("El número ingresado es: " + numero);
       }
    
       public static void ejercicio2(Scanner scanner) {
          System.out.print("Ingrese su nombre: ");
          String nombre = scanner.next();
          System.out.println("Hola, " + nombre + "!");
       }
    
       public static void ejercicio3(Scanner scanner) {
          System.out.print("Ingrese su edad: ");
          int edad = scanner.nextInt();
          System.out.println("Tienes " + edad + " años.");
       }
    
       public static void ejercicio4(Scanner scanner) {
          System.out.print("Ingrese el primer número: ");
          int a = scanner.nextInt();
          System.out.print("Ingrese el segundo número: ");
          int b = scanner.nextInt();
          System.out.println("La suma es: " + (a + b));
       }
    
       public static void ejercicio5(Scanner scanner) {
          System.out.print("Ingrese un número: ");
          int num = scanner.nextInt();
          if (num % 2 == 0) {
             System.out.println("El número es par.");
          } else {
             System.out.println("El número es impar.");
          }
    
       }
    
       public static void ejercicio6(Scanner scanner) {
          System.out.print("Ingrese una nota: ");
          double nota = scanner.nextDouble();
          if (nota >= 3.0) {
             System.out.println("Aprobado");
          } else {
             System.out.println("Reprobado");
          }
    
       }
    
       public static void ejercicio7(Scanner scanner) {
          System.out.print("Ingrese un número: ");
          int num = scanner.nextInt();
          System.out.println("El cuadrado del número es: " + num * num);
       }
    
       public static void ejercicio8(Scanner scanner) {
          System.out.print("Ingrese su salario: ");
          double salario = scanner.nextDouble();
          System.out.println("Su salario con aumento del 10% es: " + salario * 1.1);
       }
    
       public static void ejercicio9(Scanner scanner) {
          System.out.print("Ingrese un número: ");
          int numero = scanner.nextInt();
    
          for(int i = 1; i <= numero; ++i) {
             System.out.println(i);
          }
    
       }
    
       public static void ejercicio10(Scanner scanner) {
          System.out.print("Ingrese un número: ");
          int numero = scanner.nextInt();
          int factorial = 1;
    
          for(int i = 1; i <= numero; ++i) {
             factorial *= i;
          }
    
          System.out.println("El factorial es: " + factorial);
       }
    
       public static void ejercicio11(Scanner scanner) {
          System.out.print("Ingrese un número: ");
          int num = scanner.nextInt();
          if (num > 0) {
             System.out.println("Es positivo");
          } else if (num < 0) {
             System.out.println("Es negativo");
          } else {
             System.out.println("Es cero");
          }
    
       }
    
       public static void ejercicio12(Scanner scanner) {
          System.out.print("Ingrese un número para ver su tabla de multiplicar: ");
          int num = scanner.nextInt();
    
          for(int i = 1; i <= 10; ++i) {
             System.out.println("" + num + " x " + i + " = " + num * i);
          }
    
       }
    
       public static void ejercicio13(Scanner scanner) {
          System.out.print("Ingrese el número base: ");
          int base = scanner.nextInt();
          System.out.print("Ingrese el exponente: ");
          int exponente = scanner.nextInt();
          int resultado = 1;
    
          for(int i = 0; i < exponente; ++i) {
             resultado *= base;
          }
    
          System.out.println("Resultado: " + resultado);
       }
    
       public static void ejercicio14(Scanner scanner) {
          System.out.print("Ingrese un número: ");
          int numero = scanner.nextInt();
    
          int suma;
          for(suma = 0; numero > 0; numero /= 10) {
             suma += numero % 10;
          }
    
          System.out.println("La suma de los dígitos es: " + suma);
       }
    
       public static void ejercicio15(Scanner scanner) {
          System.out.print("Ingrese un número: ");
          int numero = scanner.nextInt();
    
          int invertido;
          for(invertido = 0; numero != 0; numero /= 10) {
             int digito = numero % 10;
             invertido = invertido * 10 + digito;
          }
    
          System.out.println("Número invertido: " + invertido);
       }
    
       public static void ejercicio16(Scanner scanner) {
          System.out.println("Ejercicio 16: Calcular promedio de tres notas");
          System.out.print("Nota 1: ");
          double n1 = scanner.nextDouble();
          System.out.print("Nota 2: ");
          double n2 = scanner.nextDouble();
          System.out.print("Nota 3: ");
          double n3 = scanner.nextDouble();
          double promedio = (n1 + n2 + n3) / 3.0;
          System.out.println("Promedio: " + promedio);
       }
    
       public static void ejercicio17(Scanner scanner) {
          System.out.println("Ejercicio 17: Verificar año bisiesto");
          System.out.print("Ingrese el año: ");
          int año = scanner.nextInt();
          if ((año % 4 != 0 || año % 100 == 0) && año % 400 != 0) {
             System.out.println("No es bisiesto");
          } else {
             System.out.println("Es bisiesto");
          }
    
       }
    
       public static void ejercicio18(Scanner scanner) {
          System.out.println("Ejercicio 18: Convertir grados Celsius a Fahrenheit");
          System.out.print("Ingrese grados Celsius: ");
          double c = scanner.nextDouble();
          double f = c * 9.0 / 5.0 + 32.0;
          System.out.println("Fahrenheit: " + f);
       }
    
       public static void ejercicio19(Scanner scanner) {
          System.out.println("Ejercicio 19: Número primo");
          System.out.print("Ingrese un número: ");
          int num = scanner.nextInt();
          boolean primo = num > 1;
    
          for(int i = 2; (double)i <= Math.sqrt((double)num); ++i) {
             if (num % i == 0) {
                primo = false;
                break;
             }
          }
    
          System.out.println("" + num + (primo ? " es primo" : " no es primo"));
       }
    
       public static void ejercicio20(Scanner scanner) {
          System.out.println("Ejercicio 20: Mostrar los primeros 10 números pares");
    
          for(int i = 1; i <= 10; ++i) {
             System.out.println(i * 2);
          }
    
       }
    
       public static void ejercicio21(Scanner scanner) {
          System.out.println("Ejercicio 21: Calcular área de un triángulo");
          System.out.print("Base: ");
          double base = scanner.nextDouble();
          System.out.print("Altura: ");
          double altura = scanner.nextDouble();
          double area = base * altura / 2.0;
          System.out.println("Área: " + area);
       }
    
       public static void ejercicio22(Scanner scanner) {
          System.out.println("Ejercicio 22: Verificar mayor de edad");
          System.out.print("Edad: ");
          int edad = scanner.nextInt();
          System.out.println(edad >= 18 ? "Mayor de edad" : "Menor de edad");
       }
    
       public static void ejercicio23(Scanner scanner) {
          System.out.println("Ejercicio 23: Suma de los 100 primeros números naturales");
          int suma = 0;
    
          for(int i = 1; i <= 100; ++i) {
             suma += i;
          }
    
          System.out.println("Suma: " + suma);
       }
    
       public static void ejercicio24(Scanner scanner) {
          System.out.println("Ejercicio 24: Mostrar los primeros 10 múltiplos de 3");
    
          for(int i = 1; i <= 10; ++i) {
             System.out.println(i * 3);
          }
    
       }
    
       public static void ejercicio25(Scanner scanner) {
          System.out.println("Ejercicio 25: Mostrar los divisores de un número");
          System.out.print("Número: ");
          int num = scanner.nextInt();
    
          for(int i = 1; i <= num; ++i) {
             if (num % i == 0) {
                System.out.println(i);
             }
          }
    
       }
    
       public static void ejercicio26(Scanner scanner) {
          System.out.println("Ejercicio 26: Calcular promedio de números hasta ingresar cero");
          int suma = 0;
          int count = 0;
    
          int num;
          do {
             System.out.print("Ingrese número (0 para terminar): ");
             num = scanner.nextInt();
             if (num != 0) {
                suma += num;
                ++count;
             }
          } while(num != 0);
    
          if (count > 0) {
             System.out.println("Promedio: " + (double)suma / (double)count);
          } else {
             System.out.println("No se ingresaron números");
          }
    
       }
    
       public static void ejercicio27(Scanner scanner) {
          System.out.println("Ejercicio 27: Mostrar la tabla ASCII");
    
          for(int i = 32; i <= 126; ++i) {
             System.out.println("" + i + ": " + (char)i);
          }
    
       }
    
       public static void ejercicio28(Scanner scanner) {
          System.out.println("Ejercicio 28: Mostrar los dígitos de un número");
          System.out.print("Número: ");
          int num = scanner.nextInt();
          String numStr = String.valueOf(num);
          char[] var6;
          int var5 = (var6 = numStr.toCharArray()).length;
    
          for(int var4 = 0; var4 < var5; ++var4) {
             char c = var6[var4];
             System.out.println(c);
          }
    
       }
    
       public static void ejercicio29(Scanner scanner) {
          System.out.println("Ejercicio 29: Convertir días a semanas y días");
          System.out.print("Ingrese la cantidad de días: ");
          int dias = scanner.nextInt();
          int semanas = dias / 7;
          int restoDias = dias % 7;
          System.out.println("" + semanas + " semanas y " + restoDias + " días");
       }
    
       public static void ejercicio30(Scanner scanner) {
          System.out.println("Ejercicio 30: Mostrar los números del 100 al 1 de 5 en 5");
    
          for(int i = 100; i >= 1; i -= 5) {
             System.out.println(i);
          }
    
       }
    }
    