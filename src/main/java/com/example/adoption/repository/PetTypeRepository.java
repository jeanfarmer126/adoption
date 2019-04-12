package com.example.adoption.repository;

import com.example.adoption.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PetTypeRepository extends JpaRepository<Pet, Integer>
{
}
