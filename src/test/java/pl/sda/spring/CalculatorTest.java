package pl.sda.spring;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.sda.spring.exception.DivisionByZeroException;
import pl.sda.spring.exception.OutOfRangeException;
import pl.sda.spring.operation.OperationType;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CalculatorTest {

    @Autowired
    private Calculator calculator;
    private Object DivisionByZeroException;

    @Test
    public void shouldReturnFiveForGivenArgumentsOnAdditionOperation() {
        //given
        double arg1 = 2.0;
        double arg2 = 3.0;

        //when
        double actual = calculator.calculate(OperationType.ADDITION, arg1, arg2);

        //then
        Assert.assertEquals(5.0, actual, 0.00000001);
    }

    @Test
    public void subtractionTest(){

        //given
        double arg1 = 5.0;
        double arg2 = 3.0;

        //when
        double actual = calculator.calculate(OperationType.SUBTRACTION, arg1, arg2);

        //then
        Assert.assertEquals(2.0, actual, 0.00000001);

    }


    @Test
    public void multiplicationTest(){

        //given
        double arg1 = 5.0;
        double arg2 = 3.0;

        //when
        double actual = calculator.calculate(OperationType.MULTIPLICATION, arg1, arg2);

        //then
        Assert.assertEquals(15.0, actual, 0.00000001);

    }

    @Test
    public void divisionTest(){

        //given
        double arg1 = 6.0;
        double arg2 = 3.0;

        //when
        double actual = calculator.calculate(OperationType.DIVISION, arg1, arg2);

        //then
        Assert.assertEquals(2.0, actual, 0.00000001);

    }

    @Test(expected = DivisionByZeroException.class)
    public void divisionByZeroTest(){

        //given
        double arg1 = 6.0;
        double arg2 = 0.0;

        //when
        double actual = calculator.calculate(OperationType.DIVISION, arg1, arg2);

    }

    @Test
    public void percentageTest(){

        //given
        double arg1 = 100.0;
        double arg2 = 25.0;

        //when
        double actual = calculator.calculate(OperationType.PERCENTAGE, arg1, arg2);

        //then
        Assert.assertEquals(25.0, actual, 0.00000001);

    }

    @Test(expected = OutOfRangeException.class)
    public void percentageRangeTest(){

        //given
        double arg1 = 6.0;
        double arg2 = 120.0;

        //when
        double actual = calculator.calculate(OperationType.PERCENTAGE, arg1, arg2);

    }

    @Test
    public void powerTest(){

        //given
        double arg1 = 3.0;
        double arg2 = 2.0;

        //when
        double actual = calculator.calculate(OperationType.POWER, arg1, arg2);

        //then
        Assert.assertEquals(9.0, actual, 0.00000001);

    }
    
    
}
