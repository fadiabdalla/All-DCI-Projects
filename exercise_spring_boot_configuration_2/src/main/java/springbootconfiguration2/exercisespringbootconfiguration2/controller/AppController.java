package springbootconfiguration2.exercisespringbootconfiguration2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/phonenumber")
    public String getPhoneNumber(){

        return "01791286799";
        //http://localhost:8080/java/phonenumber
    }
    @GetMapping("/printname")
    public  String printName(@RequestParam  String name){

        return "My name: " + name;

        // http://localhost:8080/java/printname?name=FadiGeorgosAbdallah
    }
    @GetMapping("/info")
    public String printInfo(@RequestParam String name, Integer phonenumber ){

        return "My name is : " + name + ", Phone number :" + phonenumber;
        // http://localhost:8080/java/info?name=Fadi&phonenumber=01791286799
    }
    @GetMapping("/allinfo/{name}/{phonenumber}/{age}/{gender}")
    public String testPath(@PathVariable("name") String name,
                           @PathVariable("phonenumber") Integer phonenumber,
                           @PathVariable("age") Integer age,
                           @PathVariable("gender") String gender
    ) {
        return "Name : " + name + ", Phone Number : "
                + phonenumber + ", Age : " + age + ", Gender : " + gender;

        // http://localhost:8080/java/allinfo/Fadi/01791286799/31/Male
    }


}
