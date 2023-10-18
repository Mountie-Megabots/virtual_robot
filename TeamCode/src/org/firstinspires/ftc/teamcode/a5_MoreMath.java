package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 *
 *
 *
 *
 * Exercises:
 * 1. This program contains the same AButtonCouter from the last two lessons.
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

            //

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
