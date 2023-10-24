package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.lessonClasses.Student;

/**
 * Exercises:
 * 1. Classes in Java describe objects (like motors or gamepads) and define the
 *    variables and methods that belong to them.
 *
 *    There is a class called Student.java in the lessonsClasses folder. Go ahead
 *    and take a look at the code for it.
 *
 *    In the runOpMode function, you'll find code creating a Student object,
 *    using its addAssignment method, and then adding its average grade to
 *    telemetry.
 *
 *    Use the addAssignment() method to add two more assignments to the student
 *    and make sure the new average grade is printed to telemetry.
 *
 * 2. Use the getLetterGrade() method to add the student's letter grade to
 *    telemetry.
 * 3. Create another instance of the Student class and add assignments to it.
 *    Add the new student's average grade and letter grade to telemetry.
 * 4. There is a function called getAgeInYears() that  is supposed to return
 *    the student's age, but it currently returns 0. Fix it so that it returns
 *    the student's age.
 *
 *    Tip: You can use the Java built-in method java.time.Year.now().getValue()
 *    to get the current year (or you can just use 2023).
 * 5. Add the ages of the two students to telemetry.
 * 6. There is a function called isOlderThan() in Student.java that is supposed
 *    to return true if the student is older than another student, but it
 *    currently returns false. Fix it so that it returns the correct value.
 *
 *    Tip: You'll need to use the getAgeInYears() function you just fixed.
 * 7. Add the result of isOlderThan() to telemetry.
 * 8. Create a new method in Student.java called getBirthYear() that returns
 *    the student's birth year.
 *
 *    Give it the same access modifier as the other methods in Student.java
 *    (public) which means it can be called from other classes.
 *
 *    The return type should be int, and the method should not take any
 *    parameters.
 * 9. Add the birth years of the two students to telemetry.
 *
 */
@TeleOp(name = "Lesson 8: Classes")
public class a8_Classes extends LinearOpMode {
    public void runOpMode() throws InterruptedException {
        Student kevin = new Student("Kevin", 1945);
        kevin.addAssignment(95);
        telemetry.addData("Kevin's Grade",kevin.getPercentGrade());










        telemetry.update();
        waitForStart();
    }
}
