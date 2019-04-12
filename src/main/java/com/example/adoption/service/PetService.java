package com.example.adoption.service;

import com.example.adoption.model.Pet;
import com.example.adoption.repository.PetTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService
{
   private PetTypeRepository petTypeRepository;

   @Autowired
   public PetService(PetTypeRepository petTypeRepository) {
      this.petTypeRepository = petTypeRepository;
   }

   public List<Pet> getAllPets() {
      return petTypeRepository.findAll();
   }
}
