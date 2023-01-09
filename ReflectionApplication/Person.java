package ReflectionApplication;

import java.util.ArrayList;

public class Person {

    private ArrayList<Problem> problems;


    public String tellProblem() {
        Problem problemProblem = new Problem();
        String ourProblem = "";
        for (Problem problem : problems) {
            if (!problemProblem.isSolved()) {
                problem.getName();
            }

        }
        return ourProblem;
    }
}












