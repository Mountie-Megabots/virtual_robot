package org.firstinspires.ftc.teamcode.lessonClasses;

import java.time.temporal.TemporalField;

public class Student {
    private final String name;
    private double averageGrade = 0;
    private int numAssignments = 0;
    private int birthYear = 0;

    /**
     * Constructor for new Student
     *
     * @param name The student's name
     */
    public Student(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }

    /**
     * Updates assignment count and adds new assignment grade to running average.
     *
     * @param percentGrade - Assignment grade, between 0 and 100.
     */
    public void addAssignment(double percentGrade){
        // Cap percentage at 100%
        percentGrade = Math.min(percentGrade,100);
        // Set the lowest grade to 0%
        percentGrade = Math.max(percentGrade,0);
        averageGrade = averageGrade + (Math.min(percentGrade,100)-averageGrade)/(++numAssignments);
    }

    /**
     * @return The student's name as a String
     */
    public String getName(){
        return this.name;
    }

    /**
     * @return The running average grade for the student.
     */
    public double getPercentGrade(){
        return averageGrade;
    }

    /**
     * @return A letter grade based on the student's average grade.
     */
    public String getLetterGrade(){
        int roundedGrade = (int)Math.round(averageGrade/10);
        switch(roundedGrade) {
            case 10:
                return "A";
            case 9:
                return "A-";
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
                return "D";
            default:
                return "F";
        }
    }

    /**
     * @return The student's age in years.
     */
    public int getAgeInYears(){
        return 0;
    }

    public boolean isOlderThan(Student otherStudent){
        return false;
    }

}
