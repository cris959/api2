package com.med.voll.api.controller;

import com.med.voll.api.domain.usuario.DatosAutenticacion;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AutenticacionController {

<<<<<<< HEAD
    @Autowired
    private AuthenticationManager manager;

    @PostMapping
    public ResponseEntity<DatosAutenticacion> iniciarSesion(@Valid @RequestBody DatosAutenticacion datos) {
        var token = new UsernamePasswordAuthenticationToken(datos.login(), datos.contrasena());
        var autenticacion = manager.authenticate(token);

        return ResponseEntity.ok().build();
    }
=======
        @Autowired
        private AuthenticationManager manager;


        @PostMapping
        public ResponseEntity<DatosAutenticacion> iniciarSesion(@Valid @RequestBody DatosAutenticacion datos) {
            var token = new UsernamePasswordAuthenticationToken(datos.login(), datos.contrasena());
            var autenticacion = manager.authenticate(token);

            return ResponseEntity.ok().build();
        }
>>>>>>> 317b5684ca684f1d768a91422a695a697784f4f5
}
