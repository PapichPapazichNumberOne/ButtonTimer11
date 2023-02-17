package org.example;

import java.util.Scanner;

public class TimeSenseChecker {
    public static void main(String[] args) {
        System.out.println("Нажмите Enter, чтобы запустить таймер");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); // wait for user to press Enter

        long startTime = System.currentTimeMillis();

        System.out.println("Нажмите Enter еще раз ровно по истечении одной минуты...");
        scanner.nextLine(); // wait for user to press Enter again

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        final long ONE_MINUTE = 60_000; // milliseconds
        final long TOLERANCE = 1000; // milliseconds

        if (elapsedTime < ONE_MINUTE - TOLERANCE) {
            System.out.println("Вы нажали слишком рано!");
        } else if (elapsedTime > ONE_MINUTE + TOLERANCE) {
            System.out.println("Ты опоздал!");
        } else {
            System.out.println("Отличная работа! У вас хорошее чувство времени.");
        }
    }
}
