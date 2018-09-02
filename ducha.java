class ducha{
  public static void main(String[] args) {

  /* Implementar um Chuveiro 110 ou 220 volts, 5500 ou 6500 watts de potencia, tres temperaturas
  (quente, frio, fria/desligado)
  ducha corona (vagabunda)*/

  Chuveiro ducha = new Chuveiro("corona "," 110 volts"," 5500 watts" );
  System.out.println("marca " + ducha.marca);// ducha corona
  System.out.println("tensâo " + ducha.tensao + " volts"); // 110 volts
  System.out.println("potencia " + ducha.potencia + " watts"); // watts
  System.out.println("temperatura" + ducha.temperatura);// fria/desligado

  ducha.AbrirRegistroAgua();
  System.out.println(ducha.AbrirRegistroAgua() == true); // true
  System.out.println("Saindo Agua");
  System.out.println(" Temperatura" + ducha.temperatura); // Fria

  ducha.MudarTemperaturaQuente();
  System.out.println(ducha.MudarTemperaturaQuente() == true ); // true
  System.out.println("Temperatura " + ducha.temperatura); //quente
  System.out.println(ducha.ChuveiroLigado == true); //true

  ducha.MudarTemperaturaMorno();
  System.out.println(ducha.MudarTemperaturaMorno() == true); // true
  System.out.println("Temperatura " + ducha.temperatura);// morno
  System.out.println(ducha.ChuveiroLigado == true); //true


  ducha.MudarTemperaturaFrio();
  System.out.println(ducha.MudarTemperaturaFrio() == true); // true
  System.out.println("Temperatura " + ducha.temperatura);// Fria
  System.out.println(ducha.ChuveiroLigado == false); //true

  ducha.FecharRegistroAgua();
  System.out.println(ducha.FecharRegistroAgua() == true); // true
  System.out.println("Agua Fechada");
  System.out.println(" Temperatura" + ducha.temperatura); // Fria
  // se nao sai agua chuveiro nao liga.
  ducha.MudarTemperaturaQuente();
  System.out.println(ducha.MudarTemperaturaQuente() == true ); // true
  System.out.println("Temperatura " + ducha.temperatura); //quente
  System.out.println(ducha.ChuveiroLigado == false); // True

  ducha.MudarTemperaturaMorno();
  System.out.println(ducha.MudarTemperaturaMorno() == true); // true
  System.out.println("Temperatura " + ducha.temperatura);// morno
  System.out.println(ducha.ChuveiroLigado == false); //True


  ducha.MudarTemperaturaFrio();
  System.out.println(ducha.MudarTemperaturaFrio() == true); // true
  System.out.println("Temperatura " + ducha.temperatura);// Fria
  System.out.println(ducha.ChuveiroLigado == false); //True





  }
}
