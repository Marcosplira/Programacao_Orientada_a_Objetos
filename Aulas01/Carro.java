package Aulas01;

public class Carro{
    String marca; 
    String modelo; 
    int ano = 2017; 
    double km; 
    String cor;
    double velocidade = 0; 
  
    double acelerar(){
      velocidade = velocidade + 1;
      return velocidade;
    }
    
    double andar(double KmPercorrido){
      km = km + KmPercorrido;
      return KmPercorrido;  
    }
  }