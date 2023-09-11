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

@Entity(name = "PetOwnerPetOwnerImage")
@Table(schema = "\"petreg\"", name = "\"PetOwnerPetOwnerImage\"")
@Data
public class PetOwnerPetOwnerImage{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"Pet_ownerId\"")
	private Integer pet_ownerId;

    
    @Column(name = "\"ImageId\"")
    private Integer imageId;
 
}