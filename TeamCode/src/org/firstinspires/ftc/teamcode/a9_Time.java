package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Exercises:
 * 1. It can be useful to keep track of time in your program. We can use it to
 *    time how long a certain action takes, to write a simple autonomous routine,
 *    or use it to wait for a certain amount of time.
 *
 *    The built-in getRuntime() method returns the time in seconds since the
 *    OpMode started.
 *
 *    Inside the while loop, use telemetry to print the value of getRuntime()
 *    with the caption "getRuntime()".
 * 2. If you wait a few seconds between pressing the init and play buttons, you
 *    will notice that the value of getRuntime() does not start at 0. This is
 *    because the robot controller app starts running the OpMode as soon as you
 *    press the init button.
 *
 *    We can use a variable to store the time when the OpMode starts, and then
 *    subtract that from getRuntime() to get the time since the OpMode started.
 *
 *    Just after the waitForStart() function, create a double variable called
 *    startTime and set it equal to getRuntime().
 *
 *    Inside the while loop, use another telemetry statement to print the value
 *    of getRuntime() - startTime with the caption "getRunTime Offset".
 * 3. Time can also be tracked using the ElapsedTime class.
 *
 *    Before waitForStart(), create a new ElapsedTime object with this line of
 *    code:
 *
 *    ElapsedTime timer = new ElapsedTime();
 *
 *    Inside the while loop, add timer.time() to telemetry with the caption
 *    ElapsedTime.
 * 4. Instead of using offset variables the ElapsedTime class has a reset()
 *    method that will set the timer to 0.
 *
 *    Inside the while loop (before your telemetry statements) use an if
 *    statement with the condition gampad1.a to call timer.reset() when the A
 *    button is pressed.
 * 5. The two timers shown are relative to the current OpMode, but sometimes we
 *    need longer term timing. The System.currentTimeMillis() method returns the
 *    current time in milliseconds since January 1, 1970.
 *
 *    Inside the while loop, add System.currentTimeMillis() to telemetry with
 *    the caption "SystemMillis".
 * 6. The System.nanoTime() method returns the current time in nanoseconds,which
 *    is 1/1,000,000,000 of a second.
 *
 *    Inside the while loop, add System.nanoTime() to telemetry with the caption
 *    "SystemNano".
 * 7. A simple, but suboptimal, way to pause the program for a certain amount of
 *    time is to use the sleep() method. The sleep() method takes a long
 *    parameter that specifies the number of milliseconds to sleep for.
 *
 *    Add a sleep() statement to the if statement that is called when the A
 *    button is pressed. Sleep for 5 seconds.
 * 8. A better way to pause the program for a certain amount of time is to use a
 *    while loop to wait for a certain amount of time. This allows the program
 *    to run some code while it is waiting.
 *
 *    Add a new if statement that is called when the B button is pressed. Inside
 *    the if statement, reset the timer and then use a while loop to wait for 5
 *    seconds. Inside the while loop, add telemetry statements to print the
 *    current time and the elapsed time (don't forget to call telemetry.update()).
 *
 *    Tip: You can use timer.time() to get the time since the timer was reset.
 */
@TeleOp(name="Lesson 9: Time")
public class a9_Time extends LinearOpMode {

    public void runOpMode() throws InterruptedException {

        waitForStart();

        while (opModeIsActive()) {

            telemetry.update();
        }
    }
}
