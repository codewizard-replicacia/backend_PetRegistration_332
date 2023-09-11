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

@Entity(name = "VisitSchedulerPetVaccineSchedular")
@Table(schema = "\"petreg\"", name = "\"VisitSchedulerPetVaccineSchedular\"")
@Data
public class VisitSchedulerPetVaccineSchedular{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"VisitSchedId\"")
	private Integer visitSchedId;

    
    @Column(name = "\"Visit_id\"")
    private Integer visit_id;
 
}