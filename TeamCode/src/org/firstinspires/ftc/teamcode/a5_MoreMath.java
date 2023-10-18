package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Here are a few more math operators that weren't mentioned in the last math
 * lesson.
 *
 *  ++ adds 1 to a variable (x++ means the same as x = x + 1)
 *  -- subtracts 1 from a variable (x— means the same as x = x - 1)
 *  += adds and assigns number to a variable (x += 2 means the same as x = x + 2)
 *  *= multiply and assign (x *= 2 means the same as x = x * 2)
 *  /= divide and assign (x /= 2 means the same as x = x / 2)
 *
 *  There are also a ton of math functions available to us in the Java Math
 *  library. Here are a few we use regularly
 *  Math.abs(x) - Returns the absolute value of x (eg Math.abs(-5) == 5)
 *  Math.pow(number, power) - returns x^power (eg Math.pow(10,2) == 100)
 *  Math.max(x, y) - returns whichever number is bigger (eg Math.max(5, 10) == 10)
 *  Math.min(x, y) - returns whichever number is smaller (eg Math.min(5, 10) == 5)
 *  Math.copySign(mag, sign) - returns mag with the same +/- as sign
 *                             (eg Math.copySign(15, -.5) == -15)
 *  Math.random() - Returns a random number between 0 and 1.
 *
 *
 *  These are just a few of the functions available in the Math class, type
 *  "Math." (without quotes) somewhere in the runOpmode functions to see all of
 *  the available functions.
 *
 *
 * Exercises:
 * 1. This program contains the same AButtonCounter from the last two lessons.
 *    Change line "aButtonCount = aButtonCount+1" to use the ++ operator and
 *    make sure it still functions the same.
 * 2. Using the same line, modify it to use the += operator.
 * 3. Using the same line, modify it to increment by 5 (still using the +=
 *    operator).
 * 4. Use the Math.abs function in an if statement to write something to
 *    telemetry if the absolute value of the game pad right stick y axis is
 *    greater than .1
 * 5. Use the Math.copySign() function to copy the sign of the left joystick
 *    to the value .5 and write it to telemetry.
 * 6. Use the Math.max() function with the right and left trigger values to
 *    write whichever is greater to telemetry.
 * 7. Modify the A Button counter using the Math.random() function to write a
 *    random number aButtonCount.
 * 8. Multiply it by 10 so the random number is between 0 and 10.
 */
@TeleOp(name = "Lesson 5: More Math")
public class a5_MoreMath extends LinearOpMode {
    boolean abutton = false;
    int aButtonCount = 0;

    public void runOpMode() throws InterruptedException {
        waitForStart();

        while(opModeIsActive()){
            if(aButtonPressed()) {
                aButtonCount = aButtonCount+1;
            }

            //You code goes here

            telemetry.update();
        }
    }

    boolean aButtonPressed(){
        boolean returnValue = false;

        if(!abutton && gamepad1.a){
            returnValue = true;
        }
        abutton = gamepad1.a;
        return returnValue;
    }
}
