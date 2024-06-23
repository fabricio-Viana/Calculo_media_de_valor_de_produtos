
package meiaprodutos;
import entidades.produtos;
import java.util.Scanner;
public class MeiaProdutos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("quantidades de podutos você quer ?");
        int n = sc.nextInt();
        
        produtos [] vetor = new produtos[n];
        
        
        
        for(int i =0 ;i < vetor.length;i++){
            System.out.println("nome do produto: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("preço do produto: ");
            double preco = sc.nextDouble();
            System.out.println("");
            vetor[i] = new produtos(nome,preco);
           
        }
        
        double sum =0;
        for(int i =0 ; i < vetor.length ;i++){
            sum +=  vetor[i].getPreco();
            System.out.println("produto "+i+" : "+vetor[i].getNome() +" R$ "+vetor[i].getPreco() );
        }
        
           double avg = sum/n;
           
           System.out.println("o valor medio dos produtos é de " + avg);
        
        
        
        
        sc.close();
    }
    
}
