package com.med.voll.api.controller;

import com.med.voll.api.medico.DatosRegistroMedico;
import com.med.voll.api.medico.Medico;
import com.med.voll.api.paciente.DatosRegistroPaciente;
import com.med.voll.api.paciente.IPacienteRepository;
import com.med.voll.api.paciente.Paciente;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private IPacienteRepository repository;

    @Transactional
    @PostMapping
    public void registrar(@Valid @RequestBody DatosRegistroPaciente datos) {
        repository.save(new Paciente(datos));
    }
}
