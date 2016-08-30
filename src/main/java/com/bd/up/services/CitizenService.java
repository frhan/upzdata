package com.bd.up.services;

import com.bd.up.domain.entity.Citizen;
import com.bd.up.repository.CitizenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by farhan on 8/23/16.
 */

@Service
public class CitizenService {

    @Autowired
    private CitizenRepository citizenRepository;

    public Citizen create(Citizen citizen){
       return citizenRepository.save(citizen);
    }

    public Citizen findOne(final Long id){
        return citizenRepository.findOne(id);
    }
}
