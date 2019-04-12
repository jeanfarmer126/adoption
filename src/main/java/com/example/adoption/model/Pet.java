package com.example.adoption.model;

import javax.persistence.*;

@Entity
@Table(name = "PET_TYPE_CD")
public class Pet
{
   @Id
   @GeneratedValue
   @Column(name = "pet_type_id")
   private Integer id;

   @Column(name = "pet_name")
   private String name;

   public Integer getId()
   {
      return id;
   }

   public void setId(Integer id)
   {
      this.id = id;
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }
}
