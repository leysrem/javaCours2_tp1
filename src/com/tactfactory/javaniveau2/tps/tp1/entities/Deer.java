package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Herbivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Omnivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Terrestrial;

public class Deer extends Animal implements Terrestrial, Herbivorus {

  public Deer() {
    super();
  }

  public Deer(Long id, String name, Float weight, Float height) {
    super(id, name, weight, height);
  }

  @Override
  public void move() {
  	if (this instanceof Terrestrial) {
  	System.out.println("Deer "+ this.getName() +" just move walking");
  	}
  }

  @Override
  public void eat(Eatable eatable) {
  	if (this instanceof Herbivorus) {
  		System.out.println("Deer "+ this.getName() +" just eat herbe");
  		System.out.println("Deer "+ this.getName() +"cannot eat viande");
  	} 
  	
  }
}
