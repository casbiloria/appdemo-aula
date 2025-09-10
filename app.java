import static spark.Spark.*;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class RelogioWeb {
    public static void main(String[] args) {
        port(3000); // Spark vai rodar na porta 3000

        get("/", (req, res) -> {
            ZoneId zonaBrasilia = ZoneId.of("America/Sao_Paulo");
            ZonedDateTime agora = ZonedDateTime.now(zonaBrasilia);
            DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH:mm:ss");

            return "<html><head><meta http-equiv='refresh' content='1'></head><body>" +
                   "<h1>Hora de Brasília: " + agora.format(formatador) + "</h1>" +
                   "</body></html>";
        });
    }
}
