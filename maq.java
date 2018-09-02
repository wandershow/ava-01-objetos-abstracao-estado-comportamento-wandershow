class maq {
public static void main(String[] args) {
  /* Implementar Máquina D'água (0.2 pts)

  Considere um máquina de água sofisticada. Ela é abastecida com uma Bombona de 20L e sempre que isso
   é feito um botão abastecer água é pressionado, efetuando o reset do contador para 20L (ou 20000mL)
    disponíveis. A máquina também armazena internamente os copos descartáveis, de 200mL e 300mL,
     com um repositório de 100 unidades para cada. Feito os abastecimentos,
      os usuários servem-se de água pressionando os botões que servem 200mL ou 300mL.
       A máquina automaticamente saca um copo e o enche de água.
        A máquina mostra no painel a quantidade de água e copos disponíveis.
         Quando um botão servir é pressionado e não há água ou copo, naturalmente o pedido não é atendido.

  Dada esta especificação nosso analista projetou a seguinte interação conforme os Casos de Teste a seguir:*/

  MaquinaAgua maq = new MaquinaAgua("Guarani", 20);
  System.out.println("Marca " + maq.marca);// Guarani
  System.out.println("Capacidade " + maq.Capacidade + " Litros ");// 20000

  System.out.println(maq.agua() == 0); // mL
  System.out.println(maq.copos200() == 0);
  System.out.println(maq.copos300() == 0);

  maq.servirCopo200(); // não efetua

  System.out.println(maq.agua() == 0); // mL
  System.out.println(maq.copos200() == 0);
  System.out.println(maq.copos300() == 0);

  maq.abastecerAgua(); // inicializa 20000mL
  System.out.println(maq.agua() == 20000); // mL

  maq.abastecerAgua(); // mantém consistente
  System.out.println(maq.agua() == 20000); // mL

  maq.servirCopo200(); // não efetua, sem copo
  System.out.println(maq.agua() == 20000); // mL

  maq.abastecerCopo200(); // agora a máquina possui 100 copos de 200
  System.out.println(maq.copos200() == 100);

  // correção (A.K.A. PATCH!) =====================================
  maq.servirCopo200();
  maq.servirCopo200();
  maq.servirCopo200();
  maq.servirCopo200();
  maq.servirCopo200(); // -1000ml e 5 copos de 200

  System.out.println(maq.agua() == 19000);
  System.out.println(maq.copos200() == 95);
  System.out.println(maq.copos300() == 0);

  maq.abastecerCopo200(); // agora a máquina possui 100 copos de 200 novamente
  System.out.println(maq.copos200() == 100);

  maq.servirCopo200(); // -200ml e 1 copo de 200
  // fim correção =====================================

  System.out.println(maq.agua() == 18800);
  System.out.println(maq.copos200() == 99);
  System.out.println(maq.copos300() == 0);

  maq.abastecerCopo300(); // agora a máquina possui 100 copos de 300
  System.out.println(maq.copos300() == 100);

  maq.servirCopo300();
  System.out.println(maq.agua() == 18500);
  System.out.println(maq.copos200() == 99);
  System.out.println(maq.copos300() == 99);

  // servir 50 copos de 300 = 15000ml
  for (int i = 0; i < 50; i++) maq.servirCopo300();

  System.out.println(maq.agua() == 3500);
  System.out.println(maq.copos200() == 99);
  System.out.println(maq.copos300() == 49);

  // servir 17 copos de 200 = 3400ml
  for (int i = 0; i < 17; i++) maq.servirCopo200();

  System.out.println(maq.agua() == 100);
  System.out.println(maq.copos200() == 82);
  System.out.println(maq.copos300() == 49);

  // não há água para atender o pedido
  maq.servirCopo300();

  System.out.println(maq.agua() == 100);
  System.out.println(maq.copos200() == 82);
  System.out.println(maq.copos300() == 49);

  // não há água para atender o pedido
  maq.servirCopo200();

  System.out.println(maq.agua() == 100);
  System.out.println(maq.copos200() == 82);
  System.out.println(maq.copos300() == 49);

  maq.abastecerAgua(); // inicializa 20000mL

  System.out.println(maq.agua() == 20000);
  System.out.println(maq.copos200() == 82);
  System.out.println(maq.copos300() == 49);

  // servir os 49 copos de 300 restantes = 14700ml
  while (maq.copos300() > 0) maq.servirCopo300();

  System.out.println(maq.agua() == 5300);
  System.out.println(maq.copos200() == 82);
  System.out.println(maq.copos300() == 0);

  // não há copo para atender o pedido
  maq.servirCopo300();

  System.out.println(maq.agua() == 5300);
  System.out.println(maq.copos200() == 82);
  System.out.println(maq.copos300() == 0);

  maq.servirCopo200(); // de 200 ok
  maq.servirCopo200(); // de 200 ok

  System.out.println(maq.agua() == 4900);
  System.out.println(maq.copos200() == 80);
  System.out.println(maq.copos300() == 0);

  maq.abastecerCopo300(); // 100 copos de 300

  System.out.println(maq.agua() == 4900);
  System.out.println(maq.copos200() == 80);
  System.out.println(maq.copos300() == 100);

  // 3 copos de 300
  maq.servirCopo300(); maq.servirCopo300(); maq.servirCopo300();

  System.out.println(maq.agua() == 4000);
  System.out.println(maq.copos200() == 80);
  System.out.println(maq.copos300() == 97);
}
}
