class MaquinaAgua{
  // caracteristicas sao constantes!!!
  final String marca;
  final int Capacidade;

private int agua = 0;// em mililitros
private static final int CAPACIDADE_MIN = 0;
private static final int CAPACIDADE_MAX = 20000;
private int copos200 = 0;
private int copos300 = 0;
private static final int COPOS_MIN = 0;
private static final int COPOS_MAX = 100;



MaquinaAgua(String m, int c){
  marca = m;
  Capacidade = c;
}
  //comando!
void abastecerAgua(){
  if (agua == CAPACIDADE_MAX ) return;
  agua = 20000;
    }
    // consulta
    int agua(){
      return agua;
    }
    void abastecerCopo200(){
      if (copos200 == COPOS_MAX) return;
        copos200 = 100;
      }
      int copos200(){
        return copos200;
      }
      void abastecerCopo300(){
        if (copos300 == COPOS_MAX) return;
          copos300 = 100;
        }
        int copos300(){
          return copos300;
        }

    void servirCopo200(){
      if (copos200 <= 0 || agua < 200){
      System.out.println("agua ou copos insuficientes");
      }else{
      agua = agua - 200;
      copos200 = copos200 - 1;
    }
    }

    void servirCopo300(){
      if (copos300 <= 0 || agua < 300){
        System.out.println("agua ou copos insuficientes");
      }else{
      agua = agua - 300;
      copos300 = copos300 - 1;
            }
    }

}
