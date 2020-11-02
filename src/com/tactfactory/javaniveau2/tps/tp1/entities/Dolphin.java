package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Aquatic;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Carnivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Omnivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Terrestrial;

public class Dolphin extends Animal implements Aquatic, Carnivorus {

  public Dolphin() {
    super();
  }

  public Dolphin(Long id, String name, Float weight, Float height) {
    super(id, name, weight, height);
  }

  @Override
  public void move() {
  	if (this instanceof Aquatic) {
  	System.out.println("daulphin "+ this.getName() +" swim");
  	}
  }

  @Override
  public void eat(Eatable eatable) {
  	if (this instanceof Carnivorus) {
  		System.out.println("daulphin"+ this.getName() +" cannot eat herbe");
  		System.out.println("daulphin "+ this.getName() +"just eat viande");
  	} 
  	
  }
}
