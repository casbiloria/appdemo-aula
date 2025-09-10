import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class RelogioBrasilia {

    public static void main(String[] args) {
        ZoneId zonaBrasilia = ZoneId.of("America/Sao_Paulo");

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH:mm:ss");
        while (true) {
            ZonedDateTime agora = ZonedDateTime.now(zonaBrasilia);

            String horaFormatada = agora.format(formatador);

            System.out.print("\rHora de Brasília: " + horaFormatada);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
