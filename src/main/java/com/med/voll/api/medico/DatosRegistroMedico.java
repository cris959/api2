package com.med.voll.api.medico;

import com.med.voll.api.direccion.Direccion;

public record DatosRegistroMedico(
        String nombre,
        String email,
        String documento,
        Especialidad especialidad,
        Direccion direccion
) {
}
