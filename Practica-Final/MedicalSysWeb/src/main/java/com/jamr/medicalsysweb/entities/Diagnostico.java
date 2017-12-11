
package com.jamr.medicalsysweb.entities;

import javax.persistence.Entity;


@Entity
public class Diagnostico extends Catalogo {
    
    public final static String FIND_DIAGNOSTICO_BY_ID="buscarDiagnosticoPorId";
        
    public final static String FIND_DIAGNOSTICO_ALL="buscarDiagnosticoTodos";
    
    private Long id;
    
    private Cita cita;
    private Medico medico;
    private Paciente paciente;
    
    
    public Long getId(){
        return id;    
    }
    
    public void setId(Long id){
        this.id = id;
    }
    
    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    
}