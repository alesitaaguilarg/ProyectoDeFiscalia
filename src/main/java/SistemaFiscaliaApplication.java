import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Le indicamos a Spring que busque tus archivos en estas dos carpetas
@SpringBootApplication(scanBasePackages = {"modelo", "controlador"})
@org.springframework.boot.autoconfigure.domain.EntityScan(basePackages = {"modelo"})
public class SistemaFiscaliaApplication {
    public static void main(String[] args) {
        SpringApplication.run(SistemaFiscaliaApplication.class, args);
        System.out.println("¡El servidor web está encendido en http://localhost:8080!");
    }
}