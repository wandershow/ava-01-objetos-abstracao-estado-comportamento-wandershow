class TV{
  // caracteristicas sao constantes!!!
  final String fabricante;
  final String modelo;
  final String tamanho;
  final String resolucao;

  int canal = 9;
  private static final int Canal_min = 2;
  private static final int Canal_max = 69;
  int volume = 20;
  int volumeant = 0;
  private static final int Volume_min = 0;
  private static final int Volume_max = 100;

  TV(String f, String m, String t, String r){
    fabricante = f;
    modelo = m;
    tamanho = t;
    resolucao = r;
  }

  //comando!
void aumentarVolume(){
  if (volume == Volume_max ) return;
  volume = volume + 1;
  }


    void dimunirVolume(){
      if (volume == Volume_min ) return;
      volume = volume - 1;
    }
        void aumentarCanal(){
          if (canal == Canal_max  ){
          canal = Canal_min;
          } else {
          canal = canal +1;
        }
      }
        void diminuirCanal(){
              if (canal == Canal_min ){
              canal = Canal_max;
              }else{
              canal = canal -1;
            }
          }
        void Mudo(){
           if(volume > 1){
            volumeant = volume;
            volume = Volume_min;
          } else {
            volume = volumeant;
          }
          }



}
