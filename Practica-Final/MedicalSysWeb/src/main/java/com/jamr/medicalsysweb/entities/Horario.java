
package com.jamr.medicalsysweb.entities;

import javax.persistence.Entity;

@Entity
public class Horario extends Catalogo {
    
    private Long id;
    
    public Long getId(){
        return id;    
    }
    
    public void setId(Long id){
        this.id = id;
    }
     
     
}