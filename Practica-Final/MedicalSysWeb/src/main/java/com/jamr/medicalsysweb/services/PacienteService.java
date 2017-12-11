/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jamr.medicalsysweb.services;

import com.jamr.medicalsysweb.entities.Paciente;
import java.util.List;

/**
 *
 * @author -adm-jmezquita
 */
public interface PacienteService {
    void savePaciente(Paciente paciente);
    Paciente findPacienteById(Long id);
    List<Paciente> findPacienteAll();
}
