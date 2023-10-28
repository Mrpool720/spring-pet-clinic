package com.mrpool720.springpetclinic.bootstrap;

import com.mrpool720.springpetclinic.model.Owner;
import com.mrpool720.springpetclinic.model.PetType;
import com.mrpool720.springpetclinic.model.Vet;
import com.mrpool720.springpetclinic.services.OwnerService;
import com.mrpool720.springpetclinic.services.PetTypeService;
import com.mrpool720.springpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;


    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setPetName("Martin");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setPetName("Gigi");
        PetType savedCatPetType = petTypeService.save(dog);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerService.save(owner2);

        System.out.println("Loaded Owners Data....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Mike");
        vet2.setLastName("Long");

        vetService.save(vet2);

        System.out.println("Loaded Vets Data....");

    }
}
