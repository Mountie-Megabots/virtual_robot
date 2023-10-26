package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Run these exercises using the ProgrammingBoard robot.
 * 1. A very powerful tool in programming is the ability to store states and use
 *    those states to change what the program does. You've already seen this in
 *    button toggle we made in lesson 2 (we stored the last state of the button
 *    in a variable and compared it to the current state of the button to decide
 *    whether to toggle a variable).
 *
 *    In this lesson, we'll be using the ProgrammingBoard robot. It has a motor
 *    and a touch sensor we can use to demonstrate state.
 *
 *    Add two boolean variables to the program - one called motorOn and one
 *    called lastAButton. Initialize both of them to false.
 *
 *    In the while loop, use an if statement to check if the A button is pressed
 *    and the lastAButton variable is false. If it is, set motorOn to !motorOn.
 *    Then, use another if statement to check if motorOn is true. If it is, set
 *    the motor power to 1. If it isn't, set the motor power to 0.
 *
 *    Outside of the if statements, set lastAButton to gamepad1.a.
 *
 *    Run the program and press the A button to turn the motor on and off.
 *
 *    Tip: This is very similar to what we did in Lesson 2 Exercise 5.
 *
 * 2. The states we stored in lastAButton and motorOn are called boolean states
 *    because they can only be true or false. We can also use other types of
 *    variables to store states.
 *
 *    Using an integer as a state, we can create something called a finite state
 *    machine. A finite state machine is a program that has a set number of
 *    states and can only be in one state at a time. It can change states based
 *    on certain conditions.
 *
 *    With this we can have the robot perform a series of actions in a certain
 *    order. For example, we can have the robot drive forward, turn, and then
 *    drive forward again.
 *
 *    Let's create a state machine will run the motor until the touch sensor is
 *    pressed, then run the motor in reverse for 2 seconds, and then stop the
 *    motor.
 *
 *    First, create an integer variable called state and initialize it to 0.
 *
 *    These are the actions we want to perform in each state:
 *      - State 0: Run the motor until the touch sensor is pressed
 *      - State 1: Run the motor in reverse for 2 seconds
 *      - State 2: Stop the motor
 *
 *    In the while loop, create an if statement that checks if state is 0. If it
 *    is, set the motor power to 1 and use a nested if statement to check if the
 *    touch sensor is pressed (it's value is inverted so the condition should be
 *    !digitalChannel.getState()). If it is, set state to 1 and reset the timer.
 *
 *    Add an else if statement that checks if state is 1. If it is, reset the
 *    set the motor power to -1. Then, add another nested if statement
 *    that checks if the timer is greater than 2. If it is, set state to 2.
 *
 *    Add an else if statement that checks if state is 2. If it is, set the motor
 *    power to 0.
 *
 *    Run the program and see that the motor runs until the touch sensor is
 *    pressed, then runs in reverse for 2 seconds, and then stops.
 * 3. The state machine we just created is called a sequential state machine
 *    because it runs through the states in order. Let's modify it to make it
 *    non-sequential.
 *
 *    In the else if statement that checks if state is 2, add a nested if statement
 *    that checks if the B button is pressed. If it is, set state to 0.
 *
 *    Run the program and verify that the motor runs until the touch sensor is
 *    pressed, then runs in reverse for 2 seconds, and then stops. Then, when you
 *    press the B button, it runs again.
 * 4. Another way to create a state machine is to use a switch statement. A switch
 *    statement is similar to an if statement, but it can only check if a variable
 *    is equal to a certain value. It also has a default case that runs if none of
 *    the other cases are true.
 *
 *    Here's an example of a switch statement:
 *    switch(state){
 *      case 0:
 *          //Do something
 *          break;
 *      case 1:
 *          //Do something else
 *          break;
 *      default:
 *      //Do something if none of the other cases are true
 *    }
 *
 *    Rewrite the state machine using a switch statement. You can use the code
 *    above as a template.
 * 5. Another way to create a state machine is to use an enum, or enumerated type.
 *    An enum is a type of variable that can only be equal to one of a set of
 *    values we define. This lets of give names to the states we want to use.
 *
 *    An enum is declared like this:
 *    enum State{
 *      STATE_0,
 *      STATE_1,
 *      STATE_2
 *    }
 *
 *    Create an enum called AutoStates with the values FORWARD, REVERSE, and STOP.
 *
 *    Create a variable called enumState of type AutoStates and initialize it to
 *    AutoStates.FORWARD.
 *
 *    Modify the state machine to use the enumState variable instead of the state
 *    variable.
 *
 */
@TeleOp(name="Lesson 10: State")
public class a10_State extends LinearOpMode {
    public void runOpMode() throws InterruptedException {
        DcMotor motor = hardwareMap.get(DcMotor.class, "motor");
        DigitalChannel digitalChannel = hardwareMap.get(DigitalChannel.class, "touch_sensor");
        ElapsedTime timer = new ElapsedTime();

        //Variables go here


        waitForStart();
        while (opModeIsActive()) {
            telemetry.addData("touch", digitalChannel.getState());
            telemetry.update();

            // Put your code here


        }
    }
}
