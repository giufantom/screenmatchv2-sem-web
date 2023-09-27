package br.com.alura.principal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Teste {




        public static void main(String[] args) {
            LocalDateTime hoje = LocalDateTime.now();
            System.out.println(hoje);

            DateTimeFormatter formatador = DateTimeFormatter.ofPattern("E DDD dd/MM/yyyy hh:mm:ss");
            LocalDateTime agora = LocalDateTime.now();
            System.out.println(hoje.format(formatador));

            System.out.println("teste");
        }


}
