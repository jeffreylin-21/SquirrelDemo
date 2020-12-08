package Squirrel;

import Squirrel.squirrel;

public class Main {
  public static void main(String[] args){
    squirrel a = new squirrel(10, 10, 10, 10);
    squirrel b = new squirrel(1, 1, 1, 1);
    squirrel c = new squirrel(109, 109, 109, 109);

    a.eatNut();
    a.runAway();
    a.fight();

    b.eatNut();
    b.runAway();
    b.fight();

    c.eatNut();
    c.runAway();
    c.fight();
  }
}