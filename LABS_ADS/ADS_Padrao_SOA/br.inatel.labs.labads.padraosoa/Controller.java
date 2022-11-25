import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping
    public Mymessage processarGetHello() {
        MyMessage msg = new MyMessage();
        msg.setInfo("Olá, padrão arquitetural SOA");
        return msg;
    }
}