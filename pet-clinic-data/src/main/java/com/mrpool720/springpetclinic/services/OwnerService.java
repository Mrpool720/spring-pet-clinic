package com.mrpool720.springpetclinic.services;

import com.mrpool720.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
