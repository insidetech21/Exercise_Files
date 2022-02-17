package com.example.java;

public class MultiArrays08_02 {

    public static void main(String[] args) {
        String[][] states = new String[3][2];
        states[0][0] = "Maharashtra";
        states[0][1] = "Mumbai";
        states[1][0] = "Goa";
        states[1][1] = "Panaji";
        states[2][0] = "Karnataka";
        states[2][1] = "Bangalore";

        for (int i = 0; i < states.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("The Capital of ")
                    .append(states[i][0])
                    .append(" is ")
                    .append(states[i][1])
                    .append(".");
            System.out.println(sb);
            
        }
    }
}
