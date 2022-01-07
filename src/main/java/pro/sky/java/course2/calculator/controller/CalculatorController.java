package pro.sky.java.course2.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/divide")
    public double returnPrivate(@RequestParam double num1, @RequestParam double num2) {
        if (num2 == 0) {
            return "Нельзя делить на 0!!!";
        }
        return num1 + " / " + num2 + " = " + calculatorService.divide(num1, num2);
    }
    @GetMapping("/multiply")
    public double returnMultiplicationResult(@RequestParam double num1, @RequestParam double num2) {
        return num1 + " * " + num2 + " = " + calculatorService.multiply(num1, num2);
    }

    @GetMapping("/minus")
    public double returnDifference(@RequestParam double num1, @RequestParam double num2) {
        return num1 + " - " + num2 + " = " + calculatorService.difference(num1, num2);
    }

    @GetMapping("/plus")
    public double returnSum(@RequestParam double num1, @RequestParam double num2) {
        return num1 + " + " + num2 + " = " + calculatorService.sum(num1, num2);
    }

    @GetMapping
    public String returnHello() {
        return "Добро пожаловать в веб-приложение Калькулятор!!!";
    }


}
