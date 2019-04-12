package com.example.adoption.controller;

import com.example.adoption.model.Pet;
import com.example.adoption.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pet")
public class PetController
{
   private final PetService petService;

   @Autowired
   public PetController(PetService petService) {
      this.petService = petService;
   }

   @GetMapping
   public List<Pet> getPets() {
      return petService.getAllPets();
   }
}
