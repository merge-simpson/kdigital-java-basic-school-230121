package com.kdigital.school.common.util.scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class CustomScanner {
    // Delegation
    private final Scanner scan;

    public CustomScanner() {
        this(System.in); // public CustomScanner(java.io.InputStream source) 생성자를 거치겠다는 것을 뜻함.
    }

    public CustomScanner(java.io.InputStream source) {
        assert source != null: "To create a scanner, source cannot be null.";
        this.scan = new Scanner(source);
    }

    public CustomScanner(Readable source) {
        assert source != null: "To create a scanner, source cannot be null.";
        this.scan = new Scanner(source);
    }

    public int nextInt() {
        while (true) {
            try {
                return scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("정수를 입력해 주세요.");
                System.out.print("> ");
            } finally {
                scan.nextLine();
            }
        }
    }

    public double nextDouble() {
        while (true) {
            try {
                return scan.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해 주세요.");
                System.out.print("> ");
            } finally {
                scan.nextLine();
            }
        }
    }

    public String nextLine() { return scan.nextLine(); }
}
