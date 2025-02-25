package com.example.MicroservicioEmail;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notificaciones")
@AllArgsConstructor
public class Controller {

    private final EmailService emailService;

    @PostMapping("/enviar")
    public String enviarCorreo(@RequestParam String destinatario,
                               @RequestParam String asunto,
                               @RequestParam String mensaje) {
        emailService.enviarCorreo(destinatario, asunto, mensaje);
        return "Correo enviado correctamente a " + destinatario;
    }
}
