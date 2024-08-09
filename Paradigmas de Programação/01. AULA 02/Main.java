package basic01;
import java.util.Scanner;
import entities.Pessoa;
public class Main {

public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		peso = sc.nextDouble();
		altura = sc.nextDouble();

		Pessoa person = new Pessoa(peso, altura); //<Classe> <variável> =  nova instancia()

		double IMC = person.IMC();

		System.out.printf(IMC);
		sc.close();

	}	
}