package section3;

import javax.swing.*;

public class Statistics {
    int n;
    int[] age = new int[n];
    float[] weight = new float[n];
    float[] measurement = new float[n];

    public Statistics() {
    }

    public Statistics(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void fillAge() {
        for (int i = 0; i < n; i++) {
            age[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter value of element at position [ " + i + " ] = "));
        }
    }

    public void showAge() {
        for (int i = 0; i < n; i++) {
            System.out.println("Age [ " + i + " ] = " + age[i]);
        }
    }

    public static void main(String[] args) {
        Statistics obj = new Statistics();
        obj.fillAge();
    }
}
