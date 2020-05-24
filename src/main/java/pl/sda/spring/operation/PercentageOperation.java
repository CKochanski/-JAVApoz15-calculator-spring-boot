package pl.sda.spring.operation;

import org.springframework.stereotype.Component;
import pl.sda.spring.exception.DivisionByZeroException;
import pl.sda.spring.exception.OutOfRangeException;


class PercentageOperation implements Operation {

    @Override
    public double calculate(double arg1, double arg2) {
        if (arg2 < 0 || arg2 > 100){
            throw new OutOfRangeException();
        }
        return (arg1 * arg2) / 100 ;
    }

    @Override
    public OperationType getSupportedOperationType() {
        return OperationType.PERCENTAGE;
    }
}
