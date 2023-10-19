package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * For more complete info, see chapter 5 of LearnJavaForFTC
 *
 *
 * 1. Methods, also called functions, are a handy way for us to encapsulate
 *    bits of code. There is a function called printVariableScopeTest already
 *    defined in this class. Find the #1 comment below and call that function
 *    there.
 * 2. Notice that there are two definitions of the variable called
 *    variableScopeTest. One of them is defined at the class level, the other
 *    at the method level.
 *    The function you added in the last step printed the class variable.
 *    Go to the #2 comment and add variableScopeTest to telemetry with the
 *    caption "Method Variable"
 * 3. That telemetry call prints the version of variableScopeTest defined in
 *    runOpMode method because they share the same scope.
 *    To use the class version of that variable, we can use the keyword 'this'
 *    to access it.
 *    In that telemetry call, change the caption to "This Variable", and the
 *    variable to this.variableScopeTest.
 * 4. There is a method in this class called squareInput. Go to the #4 comment
 *    and add squareInput(5) to telemetry with the caption "Square of 5".
 * 5. That method currently only outputs zero. Find it and correct it so that
 *    it returns its input squared.
 * 6. Look at the definition for the squareInput method. It contains an access
 *    modifier (public), a return type (double), the method's name (squareInput),
 *    and one input with its data type (double input).
 *
 *    Create a new method called doubleInput with the access modifier public,
 *    return type int, and one int input (called whatever you want, but input
 *    is convenient). This method either add the input to itself or multiply it
 *    by 2 and return it.
 *
 *    Find the # comment and add it to telemetry there to make sure it works.
 *
 */

@TeleOp(name="Lesson 7: Methods")
public class a7_Methods extends LinearOpMode {
    //Class Variables
    int variableScopeTest = 0;

    public void runOpMode() throws InterruptedException {
        //Method Variables
        int variableScopeTest = 5;


        //#1 Goes here


        //#2 Goes here


        //#4 Goes here


        //#6 Goes here (telemetry only)




        telemetry.update();
        waitForStart();


    }

    public void printVariableScopeTest(){
        telemetry.addData("Class Variable", variableScopeTest);
    }

    //
    public double squareInput(double input){
        return 0;
    }

    //#6 Method goes here



}
