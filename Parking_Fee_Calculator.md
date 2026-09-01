# Parking Fee Calculator

A simple Java program that calculates the parking fee based on the number of hours a vehicle is parked.

## 📌 Problem Statement

Write a Java program to calculate the parking fee according to the number of parking hours.

### Pricing Rules

| Parking Hours       |     Rate |
| ------------------- | -------: |
| First 2 hours       | ₹20/hour |
| Next 3 hours (3–5)  | ₹30/hour |
| Next 5 hours (6–10) | ₹40/hour |
| Above 10 hours      | ₹50/hour |

If the total parking charge is more than **₹500**, an additional **10% charge** is added.



```text
First 2 hours   = 2 × ₹20 = ₹40
Next 3 hours    = 3 × ₹30 = ₹90
Next 5 hours    = 5 × ₹40 = ₹200
Remaining 2 hrs = 2 × ₹50 = ₹100

Total = ₹430
```

Since ₹430 is less than ₹500, no additional charge is applied.

### Output

```text
Enter hours: 12
Parking Charge is: 430.0
```

## 🛠️ Concepts Used

* Java
* `Scanner`
* Variables
* if-else if-else
* Arithmetic operators
* Slab-based calculation
* Percentage calculation

## 📂 File Name

```text
Parking_Fee_Calculator.java
```

## 🎯 Learning Objective

This program helps in understanding **conditional statements and slab-based billing calculations in Java**.
