package ru.oca.bookschildt;

public class CommandLineArguments {
    public static void main(String[] args) {
        System.out.println("Hello word");
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент №" + i + ": args["+i+"]="+args[i]);
        }
    }
}
