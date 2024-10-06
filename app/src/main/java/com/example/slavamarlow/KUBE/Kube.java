package com.example.slavamarlow.KUBE;

import com.example.slavamarlow.R;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Kube {

    static int[][][] KUBIKGREENFACE = {
                    {{R.drawable.green, R.drawable.green, R.drawable.green},
                    {R.drawable.green, R.drawable.green, R.drawable.green},
                    {R.drawable.green, R.drawable.green, R.drawable.green}},

                    {{R.drawable.yellow, R.drawable.yellow, R.drawable.yellow},
                    {R.drawable.yellow, R.drawable.yellow, R.drawable.yellow},
                    {R.drawable.yellow, R.drawable.yellow, R.drawable.yellow}},

                    {{R.drawable.red, R.drawable.red, R.drawable.red},
                    {R.drawable.red, R.drawable.red, R.drawable.red},
                    {R.drawable.red, R.drawable.red, R.drawable.red}},

                    {{R.drawable.blue, R.drawable.blue, R.drawable.blue},
                    {R.drawable.blue, R.drawable.blue, R.drawable.blue},
                    {R.drawable.blue, R.drawable.blue, R.drawable.blue}},

                    {{R.drawable.white, R.drawable.white, R.drawable.white},
                    {R.drawable.white, R.drawable.white, R.drawable.white},
                    {R.drawable.white, R.drawable.white, R.drawable.white}},

                    {{R.drawable.green, R.drawable.green, R.drawable.green},
                    {R.drawable.green, R.drawable.green, R.drawable.green},
                    {R.drawable.green, R.drawable.green, R.drawable.green}}
    };
    static String TEMP;
    static ArrayList<String> solv = new ArrayList<>();
    static boolean solvbool = true;
    static boolean doReset = false;
    static ArrayList<String> solveTEMP = new ArrayList<>();

    public void giveCommand(String TEXT){
        boolean Autodraw = false;
        boolean stopper = true;
        while(stopper){


            if (doReset){TEXT = solve();doReset = false;}

            TEXT=TEXT.toUpperCase();
            String[] commands = TEXT.split(" ");
            int[][][] curentCube = KUBIKGREENFACE;
            for (String command : commands){
                switch (command){
                    case ("L"):rotate0(curentCube);break;
                    case ("D"):rotate1(curentCube);break;
                    case ("R"):rotate2(curentCube);break;
                    case ("B"):rotate3(curentCube);break;
                    case ("U"):rotate4(curentCube);break;
                    case ("F"):rotate5(curentCube);break;
                    case ("L'"):rotate0(curentCube);rotate0(curentCube);rotate0(curentCube);break;
                    case ("D'"):rotate1(curentCube);rotate1(curentCube);rotate1(curentCube);break;
                    case ("R'"):rotate2(curentCube);rotate2(curentCube);rotate2(curentCube);break;
                    case ("B'"):rotate3(curentCube);rotate3(curentCube);rotate3(curentCube);break;
                    case ("U'"):rotate4(curentCube);rotate4(curentCube);rotate4(curentCube);break;
                    case ("F'"):rotate5(curentCube);rotate5(curentCube);rotate5(curentCube);break;
                    case ("L2"):rotate0(curentCube);rotate0(curentCube);break;
                    case ("D2"):rotate1(curentCube);rotate1(curentCube);break;
                    case ("R2"):rotate2(curentCube);rotate2(curentCube);break;
                    case ("B2"):rotate3(curentCube);rotate3(curentCube);break;
                    case ("U2"):rotate4(curentCube);rotate4(curentCube);break;
                    case ("F2"):rotate5(curentCube);rotate5(curentCube);break;
                    case ("HELP"):help();break;
                    case ("STOP"):;stopper = false;
                    case ("RESET"):
                        doReset=true;
                        solvbool = false;
                        break;
                    case ("RCHECK"): solvbool = true;
                }
                if (solvbool) {solveTEMP.add(command);}


            }
        }
    }


    public static void rotate2(int[][][] cube) {
        int[] temp = new int[3];
        for (int i = 0; i < 3; i++) {
            temp[i]=cube[5][2-i][2];
            cube[5][2-i][2] = cube[1][2-i][2];
            cube[1][2-i][2] = cube[3][i][0];
            cube[3][i][0] = cube[4][2-i][2];
            cube[4][2-i][2] = temp[i] ;
        }

        rotateFaceClockwise(cube[2]);
    }
    public static void rotate0(int[][][] cube) {
        int[] temp = new int[3];
        for (int i = 0; i < 3; i++) {
            temp[i]=cube[5][i][0];
            cube[5][i][0] = cube[4][2-i][0];
            cube[4][2-i][0] = cube[3][2-i][2];
            cube[3][2-i][2] = cube[1][i][0];
            cube[1][i][0] = temp[i] ;
        }

        rotateFaceClockwise(cube[0]);
    }
    public static void rotate5(int[][][] cube) {
        int[] temp = new int[3];
        for (int i = 0; i < 3; i++) {
            temp[i]=cube[4][2][2-i];
            cube[4][2][2-i] = cube[0][i][2];
            cube[0][i][2] = cube[1][0][i];
            cube[1][0][i] = cube[2][2-i][0];
            cube[2][2-i][0] = temp[i] ;
        }

        rotateFaceClockwise(cube[5]);
    }
    public static void rotate4(int[][][] cube) {
        int[] temp = new int[3];
        for (int i = 0; i < 3; i++) {
            temp[i]=cube[5][0][i];
            cube[5][0][i] = cube[2][0][i];
            cube[2][0][i] = cube[3][0][i];
            cube[3][0][i] = cube[0][0][i];
            cube[0][0][i] = temp[i] ;
        }

        rotateFaceClockwise(cube[4]);
    }
    public static void rotate1(int[][][] cube) {
        int[] temp = new int[3];
        for (int i = 0; i < 3; i++) {
            temp[i]=cube[5][2][i];
            cube[5][2][i] = cube[0][2][i];
            cube[0][2][i] = cube[3][2][i];
            cube[3][2][i] = cube[2][2][i];
            cube[2][2][i] = temp[i] ;
        }

        rotateFaceClockwise(cube[1]);
    }
    public static void rotate3(int[][][] cube) {
        int[] temp = new int[3];
        for (int i = 0; i < 3; i++) {
            temp[i]=cube[1][2][i];
            cube[1][2][i] = cube[0][i][0];
            cube[0][i][0] = cube[4][0][2-i];
            cube[4][0][2-i] = cube[2][2-i][2];
            cube[2][2-i][2] = temp[i] ;
        }

        rotateFaceClockwise(cube[3]);
    }

    // Вращает любую сторону на 90 градусов по часовой стрелке
    public static void rotateFaceClockwise(int[][] face) {
        int[][] temp = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                temp[i][j] = face[i][j];
            }
        }
        // Поворачиваем по часовой
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                face[i][j] = temp[2-j][i];
            }
        }
    }
    public int[][][] getCube() {
        return KUBIKGREENFACE;
    }

    public static String solve(){
        TEMP = "";
        int j = 0;
        for (int i = solveTEMP.size()-1; i >= 0; i--){
            j ++;
            solv.add(solveTEMP.get(i));
        }

        for (String instr : solv){
            if (instr.length() < 3){
            if (instr.contains("R") || instr.contains("F") || instr.contains("U") ||
                instr.contains("B") || instr.contains("D") || instr.contains("L") ) {
                if (instr.contains("'")) {
                    TEMP += instr.charAt(0)+" ";
                } else if (instr.contains("2")) {
                    TEMP += instr+" ";
                } else {
                    TEMP += instr + "' ";
                }

            }}
        }

        solveTEMP.clear();
        solv.clear();
        System.out.println(TEMP);
        TEMP += "RCHECK";
        return TEMP;
    }




    public static void help(){
        System.out.println(
                "F: Rotate GREEN  "+ " | '     : Rotate Counter-Clockwise"    +    "    | DRAW : Draw the cube\n" +
                "R: Rotate RED    " +" | 2     : Rotate Two Times\n"+
                "U: Rotate WHITE  "+ " | RESET : Solves the cube'\n"+
                "B: Rotate BLUE   " +" | STOP  : Stops the program\n"+
                "L: Rotate ORANGE "+ " | HELP  : Shows this\n"+
                "D: Rotate YELLOW "+ " | AUTO  : Enable/disable Auto draw);");
    }

}