package org.example;

    public class Fraction {
        private int numerator;
        private int denominator;

        public Fraction(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;
        }


        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            org.example.Fraction other = (org.example.Fraction) obj;
            return Math.abs(this.toDouble() - other.toDouble()) < 0.0001;
        }

        public double toDouble() {
            return (double) numerator / denominator;
        }
        public int getNumerator() {
            return numerator;
        }
        public void setNumerator(int numerator) {
            this.numerator = numerator;
        }
        public int getDenominator() {
            return denominator;
        }
        public void setDenominator(int denominator) {
            this.denominator = denominator;
        }
    }

    class FractionTest {
        public static void main(String[] args) {
            org.example.Fraction number1 = new org.example.Fraction(479901, 100000);
            org.example.Fraction number2 = new org.example.Fraction(479907, 100000);

            System.out.println("number1 equals number2? " + number1.equals(number2));
        }

    }