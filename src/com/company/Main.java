package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();


        try(Scanner s = new Scanner(System.in)) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Введите координаты точки №"+ (i + 1));
                points.add(new Point(s.nextInt(), s.nextInt()));
            }

            System.out.println("Введите координаты цетра и радисус окружности");
            Circle circle = new Circle(new Point(s.nextInt(), s.nextInt()), s.nextInt());

            for (Point p: points
                 ) {

               if (circle.isContains(p)) System.out.println(p);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
