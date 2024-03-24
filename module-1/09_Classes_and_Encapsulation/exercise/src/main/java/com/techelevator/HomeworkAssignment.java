package com.techelevator;

public class HomeworkAssignment {
    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;

    public HomeworkAssignment(int possibleMarks, String submitterName) {
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }

    public int getEarnedMarks() {
        return earnedMarks;
    }
    public int getPossibleMarks() {
        return possibleMarks;
    }
    public String getSubmitterName() {
        return submitterName;
    }

    public void setEarnedMarks(int earnedMarks) {
        this.earnedMarks = earnedMarks;
    }

    public String getLetterGrade() {
        double earnedMarksDouble = (double)earnedMarks;
        double possibleMarksDouble = (double)possibleMarks;
        double earnedPercentage = 100 * earnedMarksDouble / possibleMarksDouble;

        if (earnedPercentage >= 90.0) {
            return "A";
        } else if (earnedPercentage >= 80.0) {
            return "B";
        } else if (earnedPercentage >= 70.0) {
            return "C";
        } else if (earnedPercentage >= 60.0) {
            return "D";
        } else {
            return "F";
        }

    }

}
