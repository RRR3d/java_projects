package main;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class Main {

    abstract class AQuestion {
        public int min(int a, int b) {
            return (a<b)? a:b;
        }
        public abstract void hi();
    }
    class Question extends AQuestion {
        public void hi() {
            System.out.println("Hi");
        }
        public int min(int a , int b){}
        int hls
        public int total (int a, int b) {
            return min (a, b) +super.min(a,b);
        }
        public static void main(String[] args) {
            AQuestion q= new AQuestion();
            System.out.println(q.min(2,3));
        }
    }}
