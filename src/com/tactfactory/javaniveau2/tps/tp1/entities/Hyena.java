package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Aquatic;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Carnivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Terrestrial;

public class Hyena extends Animal implements Terrestrial, Carnivorus {

  public Hyena() {
    super();
  }

  public Hyena(Long id, String name, Float weight, Float height) {
    super(id, name, weight, height);
  }


  @Override
  public void move() {
  	if (this instanceof Terrestrial) {
  	System.out.println("hyena "+ this.getName() +" just move walking");
  	}
  }

  @Override
  public void eat(Eatable eatable) {
  	if (this instanceof Carnivorus) {
  		System.out.println("hyena"+ this.getName() +" cannot eat herbe");
  		System.out.println("hyena "+ this.getName() +"mange de la viande");
  	} 
  	
  }
}
