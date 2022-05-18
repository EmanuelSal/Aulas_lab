import java.util.*;

/**
*   Laboratorio de programacao II - Lab 01
*   
*
*   Autor: Emanuel Vinicius Sa de Lima e Lima - Matricula: 120210785
*/

public class AlunoseNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int acima = 0;
        int abaixo = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;
        int cont = 0;
        int media;
            
        while (true) {
            String entradas = sc.nextLine();

            if (entradas.equals("-")) {
                break;
            }
            cont += 1; 
            String[] nomes = entradas.split(" ");
            
            int notas = Integer.parseInt(nomes[1]);
            soma += notas;
            if (notas > maior) {
                maior = notas;
            }if (notas < menor) {
                menor = notas;
            }if (notas >= 700) {
                acima += 1;
            } else if (notas < 700){
                abaixo += 1;
            }

            
            
            
            
            
        }
        media = soma / cont;
        System.out.println("maior: " + maior);    
        System.out.println("menor: " + menor);
        System.out.println("media: " + media);    
        System.out.println("acima: " + acima);
        System.out.println("abaixo: " + abaixo);
    }   
}
