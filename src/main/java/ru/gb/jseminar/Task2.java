package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {

    // ??? ?????? ?????????? ?????? ? ????? ? ????????? ???????.
    // C ??????? ????????? ?????? ?? ?????? ? ??????? ? ??????? ??? ???????? ???????, ? ??? ??????
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a", "2", "b", "3", "c", "4"));
        printResultOfCheck(list);
    }

    public static void printResultOfCheck(List<String> list){
        for (String s: list){
            try {
                Integer.valueOf(s);
                System.out.println(s + "??? ?????");
            } catch (NumberFormatException e) {
                System.out.println(s + "??? ??????");
            }
        }


    }

}
