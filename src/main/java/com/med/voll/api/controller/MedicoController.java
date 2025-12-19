package com.med.voll.api.controller;

import com.med.voll.api.medico.DatosRegistroMedico;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @PostMapping
    public void registrar(@RequestBody DatosRegistroMedico datos) {
        System.out.println(datos);
    }
}
