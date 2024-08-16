/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eli.mavenproject1;

/**
 *
 * @author elisha
 */

import java.util.Scanner;
class Circle{
    private double radius;
    private final double PI = 22.0 / 7.0;
    
    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return PI * radius * radius;
    }

    // Method to calculate the circumference
    public double calculateCircumference() {
        return 2 * PI * radius;
    }}



    
