package ru.oca.lession14;

public class Oclock {
    static void timer() {
        int hour = 0;
        int minute = -1;
        int second = 0;
        OUTER: while (hour < 6) {
            hour++;
            MIDDLE: do {
                minute++;
                if (hour > 1) {
                    break OUTER;
                }
                INNER: while (second < 60) {
                    System.out.println(hour + ":" + minute + ":" + second);
                    second++;
                    if ((second * hour) > minute) {
                        continue MIDDLE;
                    }
                }
                } while (minute < 60);
                 hour++;
                }
            }

        public static void main (String[] args){
            timer();
        }
    }