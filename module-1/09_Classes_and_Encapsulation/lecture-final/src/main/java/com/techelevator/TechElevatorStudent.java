/*
 * PACKAGE DEFINITION
 *
 * lowercase
 * multi-word, separated by periods
 * aligned with a module or general purpose it provides
 */
package com.techelevator;

/*
 * IMPORTS
 *
 * Optional, zero to many imports
 * Always below any package declaration, and above class declaration
 */

import java.time.LocalDate;

/*
 * CLASS DECLARATION
 *
 * Naming convention: singular and PascalCase
 */
public class TechElevatorStudent {

    // Will come back to what static means

    // Public Constants
    public static final int INTERESTED = 0;
    public static final int NOT_INTERESTED = 1;
    public static final int NEEDS_INTERVIEW = 2;
    public static final int WAITING_FOR_LONG_A_T = 3;
    public static final int REJECTED = 4;
    public static final int OFFERED = 5;
    public static final int ENROLLED = 6;
    public static final int WITHDRAWN = 7;
    public static final int GRADUATED = 8;
    public static final int EMPLOYED = 9;


    // Private Constants
    private static final String INTERESTED_DESC = "INTERESTED";
    private static final String NOT_INTERESTED_DESC = "NOT INTERESTED";
    private static final String NEEDS_INTERVIEW_DESC = "NEEDS INTERVIEW";
    private static final String WAITING_FOR_LONG_A_T_DESC = "WAITING FOR LONG APTITUDE TEST";
    private static final String REJECTED_DESC = "REJECTED";
    private static final String OFFERED_DESC = "OFFERED";
    private static final String ENROLLED_DESC = "ENROLLED";
    private static final String WITHDRAWN_DESC = "WITHDRAWN";
    private static final String GRADUATED_DESC = "GRADUATED";
    private static final String EMPLOYED_DESC = "EMPLOYED";

    private static final String[] STATUS_DESCRIPTIONS = { INTERESTED_DESC, NOT_INTERESTED_DESC,  NEEDS_INTERVIEW_DESC, WAITING_FOR_LONG_A_T_DESC,
            REJECTED_DESC, OFFERED_DESC, ENROLLED_DESC, WITHDRAWN_DESC, GRADUATED_DESC, EMPLOYED_DESC };

    private static final String NO_ID_INVALID = "[ID NOT AVAILABLE - INVALID RECORD]";

    /*
     * INSTANCE (OR MEMBER) VARIABLES [Properties]
     *
     * Each instance of a TechElevatorStudent has these individual attributes (NOTE THEY ARE PRIVATE)
     *
     *
     */
    private String name;
    private final String studentId; // This should be final
    private Integer age;
    private int enrollementStatus;
    private boolean active;
    private LocalDate graduationDate;


    // -------------------------- We will come back to these (skip over for now) -------------------------------

    /*
     * CONSTRUCTORS
     *
     * Must match class name
     * Does not return anything, not even void
     */

    /*
     * Default constructor
     *
     * Java will automatically generate an empty default constructor, or
     * one may be written as shown below.
     *
     * If an overload constructor is declared the default constructor GOES AWAY and MUST BE REDECLARED IN ORDER TO BE USED
     *
     * Note the use of 'this()` to call the full overloaded constructor
     * with default values.
     */

    public TechElevatorStudent() {
        // call another constructor with some default values so something is always set
        //
        // If you want to do this for some reason, the call to another constructor MUST
        // be the fist statement in the current constructor
        this(null, NO_ID_INVALID, 0, 0, false);

//        studentId = NO_ID_INVALID;
    }


    /*
     * Args constructor
     *
     * This one allows arguments/values to be passed in for all instance variables.
     * All parameter values are checked for validity to ensure consistent state.
     *
     */
    public TechElevatorStudent(String name, int theAge) {
        // must use this because the parameter name (name) is the same as the instance variable namde
        // we are trying to set. this allows to say which one we mean so it can tell the difference
       this.name = name;
//       this.age = theAge;
        age = theAge;
        this.studentId = NO_ID_INVALID;
    }

    public TechElevatorStudent(String name, String studentId, Integer age, int enrollementStatus, boolean active) {
        this.name = name;
        this.studentId = studentId;
        this.age = age;
        this.enrollementStatus = enrollementStatus;
        this.active = active;
    }

    /*
     * Overload constructor
     *
     * This one allows arguments/values to be passed in for all instance variables.
     * All parameter values are checked for validity to ensure consistent state.
     *
     */

    // ----------------------------------------------------------------------------------

    /*
     * GETTERS and SETTERS
     *
     * Getters and setters for instance variables, derived properties,
     * and class variables.
     *
     * Getter
     *   starts with 'get' followed by instance variable name (camel case)
     *   no parameters
     *   returns data type of the instance variable
     *   starts with 'is' rather than 'get' if return type is boolean
     *   usually public
     *
     * Setter
     *   starts with 'set' followed by instance variable name
     *   single parameter of the same data type as instance variable
     *   return void
     *   usually public
     */


    //name  -> getName
    public String getName() {
        return name;
    }

    public void setName(String newName) {
//        if (newName.length() <= 10) {
            name = newName;
//        }
    }

    public String getStudentId() {
        return studentId;
    }

    // We should remove the setter for studentId - should not be able to update.

//    public void setStudentId(String studentId) {
//        this.studentId = studentId;
//    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public int getEnrollementStatus() {
        return enrollementStatus;
    }

    public void setEnrollementStatus(int enrollementStatus) {
        this.enrollementStatus = enrollementStatus;
    }

    // Note getter/setter for isActive!!!!
    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    // Getter only - No setter - can't be changed externally (set by graduate method)
    public LocalDate getGraduationDate() {
        return graduationDate;
    }

    // derived getters
    public String getStatusDescription() {
        return STATUS_DESCRIPTIONS[enrollementStatus];
    }

    public String getWelcomeMessage() {
        return welcomeMessageText + " " + name;
    }

    /*
     * INSTANCE METHODS
     *
     * Methods are named with verbs (i.e. GetSomething, CalculateSomething, DoSomething, AddSomething)
     * All methods that return a value have a 'return' statement
     * Must return the type defined in the method signature
     */

    public void sayMyName() {
        System.out.println("My name is " + name);
    }



    public int moveToNextEntollmentStep() {
        if (enrollementStatus == INTERESTED) {
            enrollementStatus = NEEDS_INTERVIEW;
        } else if (enrollementStatus == NEEDS_INTERVIEW) {
            enrollementStatus = OFFERED;
        } else if (enrollementStatus == OFFERED) {
            enrollementStatus = ENROLLED;
        } else if (enrollementStatus == ENROLLED) {
            graduate();
        } else if (enrollementStatus == GRADUATED) {
            enrollementStatus = EMPLOYED;
            active = false;
        }
        return  enrollementStatus;
    }


    public void graduate() {
        this.enrollementStatus = GRADUATED;
        this.graduationDate = LocalDate.now();
    }


    /*
     * Overload of instance method:
     *
     */


    public void graduate(LocalDate graduationDate) {
        this.enrollementStatus = GRADUATED;
        this.graduationDate = graduationDate;
    }

    /*
     * CLASS VARIABLES
     *
     * static modifier,
     * may be public or private,
     * often final, but not required to be
     *
     * Note: These values belong to "ALL" TechElevatorStudent, and thus
     *   belong to the class of TechElevatorStudent, hence the static modifier.
     */


    // class variable - we try to avoid these
    private static String welcomeMessageText = "Welcome to Tech Elevator";

    // static getter / setter ... avoid these
    public static String getWelcomeMessageText() {
        return welcomeMessageText;
    }

    public static void setWelcomeMessageText(String welcomeMessageText) {
        TechElevatorStudent.welcomeMessageText = welcomeMessageText;
    }

    /*
     * STATIC METHODS
     *
     * Static methods belong to the class, an "instance" isn't required to use them.
     * Static methods can't access instance members (e.g. properties or methods).
     * Static methods are good for utility functions that aren't dependent on instance variables.
     */
    public static String getStatusDescriptionFromStatusCode(int code) {
        if (code < STATUS_DESCRIPTIONS.length) {
            return STATUS_DESCRIPTIONS[code];
        }
        return null;
    }


    @Override
    public String toString() {
        return "TechElevatorStudent{" +
                "name='" + name + '\'' +
                ", studentId='" + studentId + '\'' +
                ", age=" + age +
                ", enrollementStatus=" + enrollementStatus +
                ", active=" + active +
                ", graduationDate=" + graduationDate +
                '}';
    }
}
