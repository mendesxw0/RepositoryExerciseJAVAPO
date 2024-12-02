package OOP;

import java.util.Scanner;

public class SobrecargaTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o nome do produto?");
        String name = sc.next();
        System.out.println("Qual a quantidade em estoque??");
        int valueStok = sc.nextInt();
//        System.out.println("Qual o preço por unidade??");

     double priceValueUniStok =1 ;


        Sobrecarga newSobrecarga = new Sobrecarga(name, valueStok);
        double result2 = newSobrecarga.valorEmEstoque(valueStok);


        System.out.println("Qual o valor atualizado do produto ?");
       double priceValueUniStok2 = sc.nextDouble();
       priceValueUniStok += priceValueUniStok2;

       Sobrecarga newSobrecarga2 = new Sobrecarga(name, valueStok, priceValueUniStok);

        System.out.println("Quantos produtos deseja adicionar ao estoque?");
        int valueStok2 = sc.nextInt();
        valueStok += valueStok2;



        String resullStr = "O valor de " + valueStok  + name + "s, é de "+ priceValueUniStok + "R$ por unidade" + result2;
        System.out.println(resullStr);

        sc.close();
    }
}
