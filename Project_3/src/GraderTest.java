import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {


    @Test
    void fiftyNineShouldReturnF(){
        var grader = new Grader(); // make a new object to test with
        assertEquals('F', grader.determineGrade(59));

        /* Tests "determineGrade" ,You can run tests w coverage and it shows you how u
        how much code you've covered in ur test (colour to show coverage shows up in main
        class, goal is everything should be green */
    }

    @Test
    void SixtyNineShouldReturnD(){
        var grader = new Grader();
        assertEquals('D', grader.determineGrade(69));
    }



    @Test
    void SeventyNineShouldReturnC(){
        var grader = new Grader();
        assertEquals('C', grader.determineGrade(79));
    }

    @Test
    void EightyShouldReturnB (){
        var grader = new Grader();
        assertEquals('B', grader.determineGrade(80));
    }

    @Test
    void EightyNineShouldReturnB (){
        var grader = new Grader();
        assertEquals('B', grader.determineGrade(89));
    }

    @Test
    void NinetyShouldReturnB (){
        var grader = new Grader();
        assertEquals('A', grader.determineGrade(90));
    }

    @Test
    void LessThanZeroShouldThrowError(){
        var grader = new Grader();
        assertThrows(IllegalArgumentException.class, () -> {
            grader.determineGrade(-3);
        });
    }

    // "() ->" is a lambda in java. Hey JUnit when you run this it should throw:
    // without the lambda "grader.determineGrade(-3) runs right away and the error
    // gets thrown before assertThrows(...) receives another argument.

    //FYI good practice is to have all green coverage for testing

    //Main purpose of testing is to develop a comprehensive suite of test methods,
    //and then you can refactor your code with confidence knowing your test methods will catch mistakes. :)

}