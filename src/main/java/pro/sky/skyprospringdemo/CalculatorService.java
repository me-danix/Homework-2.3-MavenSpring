package pro.sky.skyprospringdemo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements CalculatorService1 {
    public Integer sum(Integer num1, Integer num2) {
        return num1 + num2;
    }

    public Integer subtract(Integer num1, Integer num2) {
        return num1 - num2;
    }

    public Integer multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    public Integer divide(Integer num1, Integer num2) {
        return num1 / num2;
    }
}

