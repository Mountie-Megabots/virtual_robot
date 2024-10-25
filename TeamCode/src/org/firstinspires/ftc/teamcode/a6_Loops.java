package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Loops let us run a block of code a certain number of times or until a certain
 * condition is met.
 *
 * A while loop contains a condition similar to an if statement and will run the
 * code inside it until as long as that condition is met. Most of our OpModes
 * contain a while loop with the condition opModeIsActive() which loops through
 * our code until the Stop button is pressed on the Driver Hub.
 *
 * A while loop is defined like this:
 *
 * while(condition){
 *     //code goes here
 * }
 *
 * In most cases, we want the condition to become false at some point, otherwise the
 * code will continue to run indefinitely.
 *
 * A for loop works similarly, but typically runs its code a set number of times.
 * Instead of just having a condition, a for loop definition looks like this:
 *
 * //for(start; condition; update)
 * for(int i = 0; i < 5; i++){
 *     //This code will run five times.
 * }
 *
 * The start section is usually used to declare or set an integer variable that
 * is used to track the iterations of the loop. The condition is a boolean
 * that determines when the loop runs, and the update is typically used to
 * increment the integer variable so the condition will eventually be false.
 *
 *
 * Exercises:
 * 1. Create a while loop with the condition !gamepad1.a . Inside the loop write
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
 *  Read section 4.4 and 4.5 of LearnJavaForFtc for more information.
 */
@TeleOp(name = "Lesson 6: Loops")
public class a6_Loops extends LinearOpMode {
    int hanmeboogie = 0;
    int i = 0;
    public void runOpMode() throws InterruptedException {
        //#1 Goes here
        while(!gamepad1.a){
            telemetry.addLine("Press A Button to continue...");
            telemetry.update();
        }
        //#2 Goes here
        while(!gamepad1.b){
            telemetry.addLine("Press B Button to continue...");
            telemetry.update();
        }

        hanmeboogie = 0;
        //#3 goes here
        while(hanmeboogie <= 10){
            telemetry.addData("jabba said hanmeboogie this many times",hanmeboogie);
            telemetry.update();
            hanmeboogie++;
            sleep(1000);
        }

        //#4 goes here
        for(hanmeboogie = 0; hanmeboogie <= 10; hanmeboogie++){
            telemetry.addData("hanmeboogie!",hanmeboogie);
            telemetry.update();
            sleep(1000);
        }

        //#5 goes here
        for(i = 0; i < 50; i++){
            if(i % 3 == 0){
                telemetry.addLine("FIZZ!");
            } else if (i % 5 == 0) {
                telemetry.addLine("BUZZ!");
            } else{
                telemetry.addData("",i);
            }
            telemetry.update();
            sleep(1000);
        }


        waitForStart();

    }
}
