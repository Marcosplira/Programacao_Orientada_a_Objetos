package Aulas07;

public class Elevador{
    int andarAtual = 0; 
    int totalAndares;
    int capacidade;
    int quantidade_pessoas = 0;
  
    void entra(int quantidadeEntrar){
      if((quantidade_pessoas + quantidade_pessoas) <= capacidade){
        quantidade_pessoas += quantidadeEntrar;
        System.out.println("Alguém entrou no elevador");
      }else{
        System.out.println("O total de pessoas exerceu a capacidade do elevador");
      }
    }
      void sai(int quantidadeSai){
        if ((quantidade_pessoas - quantidadeSai) >= 0){
          quantidade_pessoas -= quantidadeSai;
          System.out.println("Uma pessoa saiu do elevador");
        }else{
          System.out.println("Não pode sair mais pessoas do elevador");  
        }
      }
    
      void sobe(int andaresSubir){
        if((andarAtual + andaresSubir) < totalAndares){
          
          andarAtual += andaresSubir;
          
          System.out.println("O elevador subiu de andar: " + andarAtual);
        }else{
          System.out.println("O elevador não pode ultrapassar o último de andar: " + andarAtual);
        }
      }
    
      void desce(int andaresDescer){
        
        if((andarAtual - andaresDescer) >= 0){
           andarAtual -= andaresDescer;
            System.out.println("O elevador desceu um andar: " + andarAtual);
        }else{
        System.out.println("O elevador não pode descer do térreo" + andarAtual);
      }
    }
  }
  
  
  