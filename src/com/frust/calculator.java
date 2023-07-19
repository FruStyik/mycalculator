package com.frust;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] act = {"+", "-", "/", "*"};
        String[] regxAct = {"\\+", "-", "/", "\\*"};

        System.out.print("Ваш пример: ");
        String exp = scan.nextLine();
        int actIdn = -1;
        for (int i = 0; i < act.length; i++) {
            if (exp.contains(act[i])) {
                actIdn = i;
                break;
            }
        }
        if (actIdn == -1) {
            System.out.println("Можно использовать только +,-,/,*");
            return;
        }
        String[] vir = exp.split(regxAct[actIdn]);
        int a, b;
        a = Integer.parseInt(vir[0]);
        b = Integer.parseInt(vir[1]);
        if (a < 0 || a > 10) {
            System.out.println("Вы можете ввести значения от 0 до 10");
        }else if(b < 0 || b > 10) {
            System.out.println("Вы можете ввести значения от 0 до 10");
        }else{
            switch (act[actIdn]) {
                case "+" -> System.out.println(a + b);
                case "-" -> System.out.println(a - b);
                case "/" -> System.out.println(a / b);
                case "*" -> System.out.println(a * b);
            }
        }
    }
}
