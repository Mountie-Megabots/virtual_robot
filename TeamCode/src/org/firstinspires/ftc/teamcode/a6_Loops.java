package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Lesson coming. Read section 4.4 and 4.5 of LearnJavaForFtc if working ahead.
 *
 * Exercises:
 * 1. Create a while loop with the condition !gamepad.a . Inside the loop write
 *    "Push the A button to Continue" (makes sure there is a telemetry.update()
 *    in the loop).
 * 2. Do the same thing, but for the B button.
 * 3. Declare an integer variable and initialize it to 0. Create a while loop
 *    that runas while the variable is less than 10. Inside the loop, have it
 *    write the variable to telemetry, increment the variable, and sleep for 1000 milliseconds each
 *    iteration.
 * 4. We're going to do the same thing with a For loop, except we can just use the
 *    variable created (and incremented) in the for loop declaration. The only
 *    code you should need inside the for loop is for telemetry and sleeping.
 * 5. For this next one, we want the text to stay on the screen, so add the line
 *    telemetry.setAutoClear(false); in the beginning of this section.
 *    Create a for loop that increments a variable, i, from 1 to 50.
 *    If i is divisible by 3 print use telemetry.addLine to print "Fizz", this
 *    condition returns true if i is divisible by 3 (i % 3 == 0)
 *    If i is divisible by 5 print use telemetry.addLine to print "Buzz"
 *    If i is divisible by 3 and 5 print "Fizzbuzz"
 *    Otherwise print the value of i.
 *    The first ten lines of output should look like this:
 *    1
 *    2
 *    Fizz
 *    4
 *    Buzz
 *    Fizz
 *    7
 *    8
 *    Fizz
 *    10
 *  
 *
 */
@TeleOp(name = "Lesson 6: Loops")
public class a6_Loops extends LinearOpMode {

    public void runOpMode() throws InterruptedException {
        //#1 Goes here

        //#2 Goes here


        //#3 goes here


        //#4 goes here


        //#5 goes here

        waitForStart();

    }
}
