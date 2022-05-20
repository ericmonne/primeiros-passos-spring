package dio.springboot.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MSN implements CommandLineRunner {

    @Autowired
    Usuario usuario;
    @Override
    public void run(String... args) throws Exception {
        System.out.println(usuario.toString());
    }
}
