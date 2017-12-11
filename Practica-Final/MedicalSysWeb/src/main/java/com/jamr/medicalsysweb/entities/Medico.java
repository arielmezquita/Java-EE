
package com.jamr.medicalsysweb.entities;


import java.util.List;
import javax.persistence.Entity;



@Entity
public class Medico extends Persona {
   
    private Long medicoId;
   private Especialidad especialidad;
   private Horario horario;
    
    private List<Cita> citaList;
    

    public Long getMedicoId() {
        return medicoId;
    }

    public void setMedicoId(Long medicoId) {
        this.medicoId = medicoId;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }


    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

  
}