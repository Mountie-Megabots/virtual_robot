package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Project 0: Adventure
 * We're going to build a simple text adventure game using nested if-else
 * statements and gamepad input. The starting room should give the user two
 * choices. Then the second room they travel to should give them two more
 * choices. Finally the third room should give them two choices.
 *
 * This means your game will have eight possible "endings". Your game will also
 * have a total of fifteen rooms:
 *
 *         _ R1 _
 *        /      \
 *     R2          R3
 *    /  \        /  \
 *  R4    R5    R6    R7
 *  /\    /\    /\    /\
 * E1 E2 E3 E4 E5 E6 E7 E8
 *
 * To help you use gamepad input in your program, I've included a function
 * called getGamepadInput() that waits for the user to press a button and then
 * returns the name of the button that was pressed after it is released.
 *
 * The code below is a short template that shows how to use the getGamepadInput
 * function and structure your if-else statements. Use it as a starting point
 * for your game.
 *
 */
@TeleOp(name ="Project 0: Adventure")
public class p0_Adventure extends LinearOpMode {

    public void runOpMode(){
        telemetry.setAutoClear(false);
        String button;

        //The game title and any starting information goes here
        telemetry.addLine("Game Title");
        telemetry.update();

        waitForStart();

        //R1
        telemetry.addLine("You are in a dark room. There is a door to the north and a door to the east.");
        telemetry.addLine("Which way do you go?");
        telemetry.addLine("Press A to go north, B to go east");
        telemetry.update();
        button = getGamepadInput();

        if(button.equals("a")){
            //R2
            telemetry.addLine("You go north");
            telemetry.addLine("There is a door to the east and a door to the west.");
            telemetry.addLine("Which way do you go?");
            telemetry.addLine("Press A to go east, B to go west");
            telemetry.update();
            button = getGamepadInput();

            if(button.equals("a")){
                //R4
                telemetry.addLine("You go east");
                telemetry.update();
            }
            else if(button.equals("b")){
                //R5
                telemetry.addLine("You go west");
                telemetry.update();
            }
            else{
                telemetry.addLine("You stand there for a while, then sit down.");
                telemetry.update();
            }

        }
        else if(button.equals("b")){
            //R3
            telemetry.addLine("You go east");
            telemetry.update();
        }
        else{
            telemetry.addLine("You stand there for a while, then sit down.");
            telemetry.addLine("You fall asleep.");
            telemetry.update();
        }

        telemetry.addLine("Thanks for playing!");
        telemetry.update();

        sleep(10000);


    }

    /**
     * This function waits for the user to press a button on the gamepad and
     * returns the name of the button that was pressed.
     */
    private String getGamepadInput(){
        String returnString = "";

        //wait for a button to be pressed
        while(!gamepad1.a && !gamepad1.b && !gamepad1.x && !gamepad1.y){
            //Do nothing
        }

        if(gamepad1.a){
            returnString = "a";
        }
        else if(gamepad1.b){
            returnString = "b";
        }
        else if(gamepad1.x){
            returnString = "x";
        }
        else{
            returnString = "y";
        }

        //wait for the button to be released
        while(gamepad1.a || gamepad1.b || gamepad1.x || gamepad1.y){
            //Do nothing
        }

        return returnString;
    }
}
