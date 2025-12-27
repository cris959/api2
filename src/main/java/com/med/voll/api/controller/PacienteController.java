package com.med.voll.api.controller;

import com.med.voll.api.medico.DatosActualizacionMedico;
import com.med.voll.api.medico.DatosListaMedico;
import com.med.voll.api.medico.DatosRegistroMedico;
import com.med.voll.api.medico.Medico;
import com.med.voll.api.paciente.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping
    public Page<DatosListaPaciente> listar(@PageableDefault(size = 10, sort = {"nombre"}) Pageable paginacion) {
        return repository.findAll(paginacion).map(DatosListaPaciente::new);
    }

    @Transactional
    @PutMapping
    public void actualizar(@Valid @RequestBody DatosActualizacionPaciente datos){
        var medico = repository.getReferenceById(datos.id());
        medico.actualizarInformaciones(datos);
    }
}
