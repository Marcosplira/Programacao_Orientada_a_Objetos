package Aulas06;

public class Elevador {
    int andarAtual = 0;
    int totalAndares;
    int capacidade;
    int pessoas = 0;
  
    void entra(){
      if(pessoas < capacidade){
        pessoas += 1;
      }
    }
    void sai(){
      if (pessoas > 0){
        pessoas -= 1;
      }
    }
    void sobe(){
      if (andarAtual < totalAndares){
        andarAtual += 1;
      }
    }
    void desce(){
      if (andarAtual > 0){
        andarAtual -= 1;
      }
    }
   
}
