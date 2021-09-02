package ru.myfirstweb.app.controller;

import org.springframework.web.bind.annotation.*;
import ru.myfirstweb.app.model.Person;

@RestController
public class HelloWorldController {

@GetMapping("/")
public String getHelloWorld(@RequestParam(required = false, defaultValue = "Dear") String name, @RequestParam(required = false, defaultValue = "guest") String lastname) {
    return "Hello world"+ " "+name+" "+lastname;

}
@GetMapping("/number/{index}/{index2}")
    public String getNumber(@PathVariable String index, @PathVariable String index2) {
    return "Number is"+index;
}
@GetMapping("/number/plus")
    public String getSum(@RequestParam String firstNumber, @RequestParam String secondNumber) {
    int numberOne = Integer.parseInt(firstNumber);
    int numberTwo = Integer.parseInt(secondNumber);
    int sum = numberOne+numberTwo;
    return ""+sum;
}
@GetMapping("/user")
    public Person getPerson(@RequestParam String name, @RequestParam String age, @RequestParam String lastname) {
    return new Person(name,lastname,Integer.parseInt(age));
}
@PostMapping("/user/add")
    public Person person(@RequestBody Person person) {
    return person;
}
}
