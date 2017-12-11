
package com.jamr.medicalsysweb.entities;


import javax.persistence.Entity;

@Entity
public class Expediente {


    private Long id;
    
    private Paciente paciente;
    private Diagnostico diagnostico;

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }
    
    
    
}