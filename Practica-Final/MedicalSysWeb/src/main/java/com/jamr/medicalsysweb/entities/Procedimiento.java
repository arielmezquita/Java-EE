
package com.jamr.medicalsysweb.entities;


import javax.persistence.Entity;


@Entity
public class Procedimiento extends Catalogo{
    
    private Long id;
   

    private Diagnostico diagnostico;
    
       public Long getId(){
        return id;    
    }
    
    public void setId(Long id){
        this.id = id;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }
    
}