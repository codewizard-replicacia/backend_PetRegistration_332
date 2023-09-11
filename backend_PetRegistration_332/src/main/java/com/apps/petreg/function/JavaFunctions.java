package com.apps.petreg.function;

import com.apps.petreg.model.Visit;
import com.apps.petreg.model.Pet;
import com.apps.petreg.model.PetOwner;
import com.apps.petreg.model.VisitScheduler;
import com.apps.petreg.model.Veterian;
import com.apps.petreg.model.Appointment;
import com.apps.petreg.model.VaccineScheduler;
import com.apps.petreg.model.Image;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.apps.petreg.repository.AppointmentRepository;
import com.apps.petreg.repository.PetOwnerRepository;
import com.apps.petreg.repository.VeterianRepository;
import com.apps.petreg.repository.VisitRepository;
import com.apps.petreg.repository.VaccineSchedulerRepository;
import com.apps.petreg.repository.ImageRepository;
import com.apps.petreg.repository.PetRepository;
import com.apps.petreg.repository.VisitSchedulerRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
