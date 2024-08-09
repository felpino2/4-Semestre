package entities;

public class Person {
  private double peso; // em quilos
  private double altura; //em metros

  public Constructor(double peso, double altura) { //Construtor atributos podem ser nomes diferentes, mas por padrão é igual, cria na instância que o objeto é chamado
  this.peso = peso; // Atributo objeto = parametro do método
  this.altura = altura;
}

  public double IMC() {
    return this.peso/(this.altura*this.altura);
  }
}
