package pro.sky.java.course2.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{
    @Override
    public double sum(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double difference(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double divide(double num1, double num2) {
        return num1/num2;
    }

    @Override
    public double multiply(double num1, double num2) {
        return num1*num2;
    }
}
