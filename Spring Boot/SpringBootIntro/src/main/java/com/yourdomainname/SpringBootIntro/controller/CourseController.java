package com.yourdomainname.SpringBootIntro.controller;

import com.yourdomainname.SpringBootIntro.entity.Instructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    // Define a private variable for the depedency injection
    // Whenever you inject a dependency whether that is constructor, setter or field injection
    // Use the @Autowired annotation
   // @Autowired
    private Instructor myInstructor;
    //private Instructor anotherInstructor;


    @Autowired
    public CourseController(@Qualifier("tempConverter") Instructor theInstructor){

        myInstructor = theInstructor;
    }

    // Define a constructor for dependency injection
    //@Autowired annotation tells spring to inject a dependency

     // Here we are doing a constructor injection

    // Here we use @Qualifier annotation which has priority above the @Primary annotation
   // @Autowired
  //  public CourseController(@Qualifier("javaInstructor") Instructor theInstructor
                            //,@Qualifier("javaInstructor") Instructor theAnotherInstructor
       //                     ){

     //   myInstructor = theInstructor;
        //anotherInstructor = theAnotherInstructor;
  //  }




    // here we use @Primary to give Priority in the Component class

    /*
    @Autowired

    public CourseController(Instructor theInstructor){

        myInstructor = theInstructor;
    }

*/


        // Here we are doing a setter injection
   /*  @Autowired
    public void setInstructor(Instructor theInstructor){

        myInstructor = theInstructor;

    } */

    // Here we are doing a field injection
    // no need for constructors or setters


    // Expose our new endpoint
    @GetMapping("/programmingexercise")
    public String getProgramingExercise(){

        return myInstructor.getProgrammingExercise();

    }

    // Expose a new endpoint to check the scope

  /*  @GetMapping("/check")
    public String check(){

        return "Comparing beans : myInstructor == anotherInstructor, "
                + (myInstructor == anotherInstructor);
    }
*/
/* What happens in the background with IoC container:
    Instructor theInstructor = new JavaInstructor();
    CourseController courseController = new CourseController(theInstructor); <- Constructor Injection

 */


}
