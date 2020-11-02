package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Herbivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Omnivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Terrestrial;

public class Dog extends Animal implements Terrestrial, Omnivorus {

  public Dog() {
    super();
  }

  public Dog(Long id, String name, Float weight, Float height) {
    super(id, name, weight, height);
  }

  @Override
  public void move() {
  	if (this instanceof Terrestrial) {
  	System.out.println("dog "+ this.getName() +" just move walking");
  	}
  }

  @Override
  public void eat(Eatable eatable) {
  	if (this instanceof Omnivorus) {
  		System.out.println("dog"+ this.getName() +" just eat herbe");
  		System.out.println("dog "+ this.getName() +"just eat viande");
  	} 
  	
  }
}
