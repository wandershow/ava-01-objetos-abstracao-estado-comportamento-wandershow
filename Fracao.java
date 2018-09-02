class Fracao{
int numerador;
int denominador;


  Fracao(int n, int d){
     numerador = n;
     denominador = d;
     if (numerador <= 0 || denominador <= 1){
       throw new IllegalArgumentException(" Denominador invalido");
     }
  }
  Fracao(int n){
     numerador = n;
     denominador = 1;
   }
   Fracao(){
      numerador = 0;
      denominador = 1;
    }
    static int mmc(int n1, int n2){

      int m1 = n1;
      int m2 = n2;

        while  (m1 != m2) {
           if  (m1 < m2){
                m1 = m1+n1;
        }
         else
         {    m2 = m2+n2;
         }
       }

       return (m1);

    }

 void mais(int n2, int d2){

   if (denominador == d2){
     denominador = d2;
     numerador = numerador + n2;
   } else {
     int m = mmc(denominador, d2);
    numerador = (((m / denominador) * numerador) + ((m / d2) * n2));
    denominador = m;
   }
  }
}
