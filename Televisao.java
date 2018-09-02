class Televisao{
public static void main(String[] args) {
  TV Televisao = new TV("Samsung ", "xt37 ", "60 polegadas ","4k " );
  System.out.println("Fabricante " + Televisao.fabricante);
  System.out.println("Modelo " + Televisao.modelo);
  System.out.println("Tamanho " + Televisao.tamanho);
  System.out.println("Resolucao " + Televisao.resolucao);

  System.out.println("Volume " + Televisao.volume);
  System.out.println("Canal " + Televisao.canal);

  while ( Televisao.volume < 99 ){
    Televisao.aumentarVolume();
  }
  System.out.println(Televisao.volume == 99);// true
  Televisao.aumentarVolume();
  System.out.println(Televisao.volume == 100); //true
  Televisao.aumentarVolume();
  System.out.print(Televisao.volume == 101 );// false
  System.out.println(" esperado falso");

  while ( Televisao.volume > 1 ){
    Televisao.dimunirVolume();
  }
  System.out.println(Televisao.volume == 1);// true
  Televisao.dimunirVolume();
  System.out.println(Televisao.volume == 0); //true
  Televisao.dimunirVolume();
  System.out.print(Televisao.volume == -1);// false
  System.out.println(" esperado falso");
  while ( Televisao.canal < 68 ){
    Televisao.aumentarCanal();
  }
  System.out.println(Televisao.canal == 68);// true
  Televisao.aumentarCanal();
  System.out.println(Televisao.canal == 69 ); //true
  Televisao.aumentarCanal();
  System.out.print(Televisao.canal == 70 );// false
  System.out.println(" esperado falso");
  System.out.println(Televisao.canal == 2);// true
  Televisao.aumentarCanal();
  Televisao.aumentarCanal();

  while ( Televisao.canal > 3 ){
    Televisao.diminuirCanal();
  }
  System.out.println(Televisao.canal == 3);// true
  Televisao.diminuirCanal();
  System.out.println(Televisao.canal == 2); //true
  Televisao.diminuirCanal();
  System.out.print(Televisao.canal == 1);// false
  System.out.println(" esperado falso");
  System.out.println(Televisao.canal == 69 ); // true

  Televisao.volume = 30;
  Televisao.Mudo();
  System.out.println("volume " + Televisao.volume);
  System.out.println(Televisao.volume == 0);// true
  Televisao.Mudo();
  System.out.println("volume " + Televisao.volume);
  System.out.println(Televisao.volume == 30);// true
  Televisao.Mudo();
  System.out.println(Televisao.volume == 0);// true
  Televisao.volume = 25;
  Televisao.Mudo();
  System.out.println(Televisao.volume == 0); // true
  Televisao.Mudo();
  System.out.println(Televisao.volume == 25); // true
  Televisao.volume = 25;
  Televisao.Mudo();
  Televisao.Mudo();
  System.out.println(Televisao.volume == 25); // true
  }
}
