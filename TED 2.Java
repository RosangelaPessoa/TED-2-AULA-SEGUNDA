  public  static  void  main ( String [] args ) {
        Scanner  a = new  Scanner ( System . in );
        duplo  n1 , n2 , n3 ;
         soma dupla = 0 ;
         mídia dupla ;
        dupla  recuperação ;
        double  prova_final ;


        Sistema . fora . println ( "Digite a Primeira Nota: " );
        n1 = um . próximoDouble ();
        Sistema . fora . println ( "Digite a Segunda Nota: " );
        n2 = um . próximoDouble ();
        Sistema . fora . println ( "Digite a Terceira Nota: " );
        n3 = a . próximoDouble ();

        soma = n1 + n2 + n3 ;
        mídia = soma / 3 ;
        Sistema . fora . println ( "Sua mídia e:" + mídia );

        recuperação = 10 - mídia + 2 ;
        prova_final = 10 + mídia ;

        if ( ( mídia >= 0 ) && ( mídia <= 4,9 ) ){
            Sistema . fora . println ( "Aluno em RECUPERAÇÃO" );
            Sistema . fora . println ( "Voce precisa de" + recuperacao + "para ser Aprovado!" );
        } else  if ( ( mídia >= 5 ) && ( mídia <= 6.9 ) ) {
            Sistema . fora . println ( "Aluno vai fazer PROVA FINAL" );
            Sistema . fora . println ( "Voce precisa de " + prova_final + " para ser Aprovado!" );
        } senão {
            Sistema . fora . println ( "Aluno APROVADO POR MÍDIA!" );
        }



    }

