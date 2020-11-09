package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Carnivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Omnivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Terrestrial;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Tetrapoda;

public class Turtle extends Animal implements Tetrapoda, Omnivorus {

  public Turtle() {
    super();
  }

  public Turtle(Long id, String name, Float weight, Float height) {
    super(id, name, weight, height);
  }

  @Override
  public void move() {
  	if (this instanceof Tetrapoda) {
  	System.out.println("turtle "+ this.getName() +" marche");
  	System.out.println("turtle"+ this.getName() +" nage");
  	}
  }

  @Override
  public void eat(Eatable eatable) {
  	if (this instanceof Omnivorus) {
  		System.out.println("turtle"+ this.getName() +" just eat herbe");
  		System.out.println("turtle "+ this.getName() +" just eat viande");
  	} 
  	
  }
