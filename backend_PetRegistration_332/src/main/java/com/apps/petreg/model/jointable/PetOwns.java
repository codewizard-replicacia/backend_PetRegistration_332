package com.apps.petreg.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.apps.petreg.model.Visit;
import com.apps.petreg.model.Pet;
import com.apps.petreg.model.PetOwner;
import com.apps.petreg.model.VisitScheduler;
import com.apps.petreg.model.Veterian;
import com.apps.petreg.model.Appointment;
import com.apps.petreg.model.VaccineScheduler;
import com.apps.petreg.model.Image;

@Entity(name = "PetOwns")
@Table(schema = "\"petreg\"", name = "\"PetOwns\"")
@Data
public class PetOwns{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"Pet_id\"")
	private Integer pet_id;

    
    @Column(name = "\"Pet_ownerId\"")
    private Integer pet_ownerId;
 
}