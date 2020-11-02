package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Herbivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Omnivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Terrestrial;

public class Cat extends Animal implements Terrestrial, Omnivorus {

  public Cat() {
    super();
  }

  public Cat(Long id, String name, Float weight, Float height) {
    super(id, name, weight, height);
  }

  @Override
  public void move() {
  	if (this instanceof Terrestrial) {
  	System.out.println("chat "+ this.getName() +" just move walking");
  	}
  }

  @Override
  public void eat(Eatable eatable) {
  	if (this instanceof Omnivorus) {
  		System.out.println("chat "+ this.getName() +" just eat herbe");
  		System.out.println("chat "+ this.getName() +" just eat herbe");
  	} 
  	
  }

}
