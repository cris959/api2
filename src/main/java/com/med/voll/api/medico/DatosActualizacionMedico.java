package com.med.voll.api.medico;

import com.med.voll.api.direccion.DatosDireccion;
import jakarta.validation.constraints.NotNull;

public record DatosActualizacionMedico (
        @NotNull Long id,
        String nombre,
        String telefono,
        DatosDireccion direccion
){
}
