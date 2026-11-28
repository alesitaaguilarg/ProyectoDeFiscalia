package vista;

import controlador.UsuarioControlador;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsuarioVista {

    private final UsuarioControlador usuarioControlador = new UsuarioControlador();

    // Muestra la pantalla de inicio de sesión
    @GetMapping({"/", "/login"})
    public String mostrarLogin() {
        return "login"; // busca templates/login.html
    }

    // Recibe lo que el usuario escribió en el formulario
    @PostMapping("/login")
    public String procesarLogin(@RequestParam String rfc,
                                @RequestParam String contrasena,
                                Model model) {

        if (!usuarioControlador.validarRFC(rfc)) {
            model.addAttribute("error", "El RFC no es válido.");
            return "login";
        }

        if (!usuarioControlador.validarCredenciales(rfc, contrasena)) {
            model.addAttribute("error", "Escribe tu RFC y tu contraseña.");
            return "login";
        }

        // PENDIENTE: aquí falta comparar el RFC y la contraseña con la base de datos
        // (requiere un repositorio de Usuario). Por ahora solo se valida el formato.
        model.addAttribute("mensaje", "Datos con formato válido.");
        return "login";
    }
}