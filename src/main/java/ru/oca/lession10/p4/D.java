package ru.oca.lession10.p4;

import ru.oca.lession10.p1.A;
import ru.oca.lession10.p1.p2.B;
import ru.oca.lession10.p1.p2.p3.C;
import ru.oca.lession10.p1.p5.*;

public class D {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.str1);

        B b = new B();
        b.showBoolean();

        C c = new C();
        c.showMessage();

        E e = new E();
        System.out.println(e.xyz);
    }


}
