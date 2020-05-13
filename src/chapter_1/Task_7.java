package chapter_1;

//Given the following classes, which of the following snippets can be inserted in place of
//    INSERT IMPORTS HERE and have the code compile? (Choose all that apply)
public class Task_7 {

//  first class
//  package aquarium;
//  public class Water {
//      boolean salty = false;
//  }

//    second class
//    package aquarium.jellies;
//    public class Water {
//        boolean salty = true;
//    }

//    package employee;
//    INSERT IMPORTS HERE
//    public class WaterFiller {
//        Water water;
//    }

//    A. import aquarium.*;
//    B. import aquarium.Water;
//       import aquarium.jellies.*;
//    C. import aquarium.*;
//       import aquarium.jellies.Water;
//    D. import aquarium.*;
//       import aquarium.jellies.*;
//    E. import aquarium.Water;
//       import aquarium.jellies.Water;
//    F. None of these imports can make the code compile.
}

//A

//Options B and C are correct because they import Water by
//classname. Since importing by classname takes precedence over wildcards