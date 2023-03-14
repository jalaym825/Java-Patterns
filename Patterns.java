import java.util.Scanner;

class Patterns {
    static int ncx(int n, int x) {
        int res, temp = 1;
        for (int i = 1; i <= n; i++)
            temp *= i;
        res = temp;
        temp = 1;
        for (int i = 1; i <= x; i++)
            temp *= i;
        res /= temp;
        temp = 1;
        for (int i = 1; i <= (n - x); i++)
            temp *= i;
        res /= temp;
        return res;
    }

    public static void main(String[] args) {
        // int n = 5;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        p1(n);
        p2(n);
        p3(n);
        p4(n);
        p5(n);
        p6(n);
        p7(n);
        p8(n);
        p9(n);
        p10(n);
        p11(n);
        p12(n);
        p13(n);
        p14(n);
        p15(n);
        p16(n);
        p17(n);
        p18(n);
        p19(n);
        p20(n);
        p21(n);
        p22(n);
        p23(n);
        p24(n);
        p25(n);
    }

    static void p1(int n) {
        try {
            System.out.println("Pattern No: 1");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                    Thread.sleep(75);
                }
                System.out.println();
                Thread.sleep(75);
            }
            System.out.println();
            Thread.sleep(75);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    static void p2(int n) {
        try {
            System.out.println("Pattern No: 2");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                    Thread.sleep(75);
                }
                System.out.println();
                Thread.sleep(75);
            }
            System.out.println();
            Thread.sleep(75);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    static void p3(int n) {
        try {
            System.out.println("Pattern No: 3");
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    System.out.print("*");
                    Thread.sleep(75);
                }
                System.out.println();
                Thread.sleep(75);
            }
            System.out.println();
            Thread.sleep(75);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    static void p4(int n) {
        try {
            System.out.println("Pattern No: 4");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.printf("%-3d", j + 1);
                    Thread.sleep(75);
                }
                System.out.println();
                Thread.sleep(75);
            }
            System.out.println();
            Thread.sleep(75);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    static void p5(int n) {
        try {
            System.out.println("Pattern No: 5");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                    Thread.sleep(75);
                }
                System.out.println();
                Thread.sleep(75);
            }
            n -= 1;
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    System.out.print("*");
                    Thread.sleep(75);
                }
                System.out.println();
                Thread.sleep(75);
            }
            System.out.println();
            Thread.sleep(75);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    static void p6(int n) {
        try {
            System.out.println("Pattern No: 6");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                    Thread.sleep(75);
                }
                System.out.println();
                Thread.sleep(75);
            }
            System.out.println();
            Thread.sleep(75);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    static void p7(int n) {
        try {
            System.out.println("Pattern No: 7");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int j = i; j < n; j++) {
                    System.out.print("*");
                    Thread.sleep(75);
                }
                System.out.println();
                Thread.sleep(75);
            }
            System.out.println();
            Thread.sleep(75);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    static void p8(int n) {
        try {
            System.out.println("Pattern No: 8");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < (2 * (i + 1)) - 1; j++) {
                    System.out.print("*");
                    Thread.sleep(75);
                }
                System.out.println();
                Thread.sleep(75);
            }
            System.out.println();
            Thread.sleep(75);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    static void p9(int n) {
        try {
            System.out.println("Pattern No: 9");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < (2 * (n - i - 1)) + 1; j++) {
                    System.out.print("*");
                    Thread.sleep(75);
                }
                System.out.println();
                Thread.sleep(75);
            }
            System.out.println();
            Thread.sleep(75);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }

    static void p10(int n) {
        try {
            System.out.println("Pattern No: 10");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < (2 * (i + 1)) - 1; j++) {
                    if (j % 2 == 1)
                        System.out.print(" ");
                    else {
                        Thread.sleep(75);
                        System.out.print("*");
                    }
                }
                System.out.println();
                Thread.sleep(75);
            }
            System.out.println();
            Thread.sleep(75);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    static void p11(int n) {
        try {
            System.out.println("Pattern No: 11");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < (2 * (n - i - 1)) + 1; j++) {
                    if (j % 2 == 1)
                        System.out.print(" ");
                    else {
                        System.out.print("*");
                        Thread.sleep(75);
                    }
                }
                System.out.println();
                Thread.sleep(75);
            }
            System.out.println();
            Thread.sleep(75);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }

    static void p12(int n) {
        try {
            System.out.println("Pattern No: 12");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < (2 * (n - i - 1)) + 1; j++) {
                    if (j % 2 == 1)
                        System.out.print(" ");
                    else {
                        System.out.print("*");
                        Thread.sleep(75);
                    }
                }
                System.out.println();
                Thread.sleep(75);
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < (2 * (i + 1)) - 1; j++) {
                    if (j % 2 == 1)
                        System.out.print(" ");
                    else {
                        System.out.print("*");
                        Thread.sleep(75);
                    }
                }
                System.out.println();
                Thread.sleep(75);
            }
            System.out.println();
            Thread.sleep(75);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }

    static void p13(int n) {
        try {
            System.out.println("Pattern No: 13");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < (2 * (i + 1)) - 1; j++) {
                    if (j == 0 || j == (2 * (i + 1)) - 2 || i == n - 1)
                        System.out.print("*");
                    else {
                        System.out.print(" ");
                        Thread.sleep(75);
                    }
                }
                System.out.println();
                Thread.sleep(75);
            }
            System.out.println();
            Thread.sleep(75);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }

    static void p14(int n) {
        try {
            System.out.println("Pattern No: 14");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < (2 * (n - i - 1)) + 1; j++) {
                    if (j == 0 || j == 2 * (n - i - 1) || i == 0)
                        System.out.print("*");
                    else {
                        System.out.print(" ");
                        Thread.sleep(75);
                    }
                }
                System.out.println();
                Thread.sleep(75);
            }
            System.out.println();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }

    static void p15(int n) {
        try {
            System.out.println("Pattern No: 15");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < (2 * (i + 1)) - 1; j++) {
                    if (j == 0 || j == (2 * (i + 1)) - 2)
                        System.out.print("*");
                    else {
                        System.out.print(" ");
                        Thread.sleep(75);
                    }
                }
                System.out.println();
                Thread.sleep(75);
            }
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < (2 * (n - i - 1)) + 1; j++) {
                    if (j == 0 || j == 2 * (n - i - 1))
                        System.out.print("*");
                    else {
                        System.out.print(" ");
                        Thread.sleep(75);
                    }
                }
                System.out.println();
                Thread.sleep(75);
            }
            System.out.println();
            Thread.sleep(75);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }

    static void p16(int n) {
        try {
            System.out.println("Pattern No: 16");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print("  ");
                }
                for (int j = 0; j < 2 * i + 1; j++) {
                    if (j % 2 == 0)
                        System.out.printf("%2d", ncx(i, j / 2));
                    else {
                        System.out.printf("%2c", ' ');
                        Thread.sleep(75);
                    }
                }
                System.out.println();
                Thread.sleep(75);
            }
            System.out.println();
            Thread.sleep(75);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }

    static void p17(int n) {
        try {
            System.out.println("Pattern No: 17");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print("  ");
                }
                for (int j = i; j >= 0; j--) {
                    System.out.printf("%-2d", j + 1);
                    Thread.sleep(75);
                }
                for (int j = 1; j <= i; j++) {
                    System.out.printf("%-2d", j + 1);
                    Thread.sleep(75);
                }
                System.out.println();
                Thread.sleep(75);
            }
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("  ");
                }
                for (int j = n - i - 1; j >= 0; j--) {
                    System.out.printf("%-2d", j + 1);
                    Thread.sleep(75);
                }
                for (int j = 1; j < n - i; j++) {
                    System.out.printf("%-2d", j + 1);
                    Thread.sleep(75);
                }
                System.out.println();
                Thread.sleep(75);
            }
            System.out.println();
            Thread.sleep(75);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    static void p18(int n) {
        try {
            System.out.println("Pattern No: 18");
            for (int i = 0; i < 2 * n; i++) {
                if (i < n) {
                    for (int j = 0; j < n; j++) {
                        if (j < n - i) {
                            System.out.print("*");
                            Thread.sleep(75);
                        } else
                            System.out.print(" ");
                    }
                    for (int j = 0; j < n; j++) {
                        if (j < i)
                            System.out.print(" ");
                        else {
                            System.out.print("*");
                            Thread.sleep(75);
                        }
                    }
                } else {
                    for (int j = 0; j < n; j++) {
                        if (j <= i - n) {
                            System.out.print("*");
                            Thread.sleep(75);
                        } else
                            System.out.print(" ");
                    }
                    for (int j = 0; j < n; j++) {
                        if (j < n - (i - n) - 1) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                            Thread.sleep(75);
                        }
                    }
                }
                System.out.println();
            }
            System.out.println();
            Thread.sleep(75);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    static void p19(int n) {
        try {
            System.out.println("Pattern No: 19");
            for (int i = 0; i < 2 * n - 1; i++) {
                if (i < n) {
                    for (int j = 0; j < n; j++) {
                        if (j <= i) {
                            System.out.print("*");
                            Thread.sleep(75);
                        } else
                            System.out.print(" ");
                    }
                    for (int j = 0; j < n; j++) {
                        if (j < n - i - 1)
                            System.out.print(" ");
                        else {
                            System.out.print("*");
                            Thread.sleep(75);
                        }
                    }
                } else {
                    for (int j = 0; j < n; j++) {
                        if (j < n - (i - n) - 1) {
                            System.out.print("*");
                            Thread.sleep(75);
                        } else
                            System.out.print(" ");
                    }
                    for (int j = 0; j < n; j++) {
                        if (j < i - (n - 1))
                            System.out.print(" ");
                        else {
                            System.out.print("*");
                            Thread.sleep(75);
                        }
                    }
                }
                System.out.println();
            }
            System.out.println();
            Thread.sleep(75);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    static void p20(int n) {
        try {
            System.out.println("Pattern No: 20");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - 1; j++) {
                    if (i == 0 || i == n - 1 || j == 0 || j == n - 2) {
                        System.out.print("*");
                        Thread.sleep(75);
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
            System.out.println();
            Thread.sleep(75);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    static void p21(int n) {
        try {
            System.out.println("Pattern No: 21");
            int temp = 1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.printf("%-3d", temp);
                    Thread.sleep(75);
                    temp++;
                }
                System.out.println();
            }
            System.out.println();
            Thread.sleep(75);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    static void p22(int n) {
        try {
            System.out.println("Pattern No: 22");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    if (i % 2 == 0) {
                        if (j % 2 == 0)
                            System.out.print("1 ");
                        else
                            System.out.print("0 ");
                    } else {
                        if (j % 2 == 0)
                            System.out.print("0 ");
                        else
                            System.out.print("1 ");
                    }
                    Thread.sleep(75);
                }
                System.out.println();
            }
            System.out.println();
            Thread.sleep(75);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    static void p23(int n) {
        try {
            System.out.println("Pattern No: 23");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j < n - i && j == n - i - 1) {
                        System.out.print("*");
                        Thread.sleep(75);
                    } else
                        System.out.print(" ");
                }
                for (int j = 1; j < n; j++) {
                    if (i == j) {
                        System.out.print("*");
                        Thread.sleep(75);
                    } else
                        System.out.print(" ");
                }
                for (int j = 1; j < n; j++) {
                    if (j < n - i && j == n - i - 1) {
                        System.out.print("*");
                        Thread.sleep(75);
                    } else
                        System.out.print(" ");
                }
                for (int j = 1; j < n; j++) {
                    if (i == j) {
                        System.out.print("*");
                        Thread.sleep(75);
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
            System.out.println();
            Thread.sleep(75);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    static void p24(int n) {
        try {
            System.out.println("Pattern No: 24");
            for (int i = 0; i < 2 * n; i++) {
                if (i < n) {
                    for (int j = 0; j < n; j++) {
                        if (j <= i && (i == j || j == 0)) {
                            System.out.print("*");
                            Thread.sleep(75);
                        } else
                            System.out.print(" ");
                    }
                    for (int j = 0; j < n; j++) {
                        if (j == n - 1 || j == n - i - 1) {
                            System.out.print("*");
                            Thread.sleep(75);
                        } else
                            System.out.print(" ");
                    }
                } else {
                    for (int j = 0; j < n; j++) {
                        if (j <= n - (i - n) - 1 && (j == 0 || j == 2 * n - i - 1)) {
                            System.out.print("*");
                            Thread.sleep(75);
                        } else
                            System.out.print(" ");
                    }
                    for (int j = 0; j < n; j++) {
                        if (j >= (i - n) && (j == n - 1 || j == i - n)) {
                            System.out.print("*");
                            Thread.sleep(75);
                        } else
                            System.out.print(" ");

                    }
                }
                System.out.println();
            }
            System.out.println();
            Thread.sleep(75);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    static void p25(int n) {
        try {
            System.out.println("Pattern No: 25");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 2 * n - 1; j++) {
                    if ((i == 0 && j >= n) || (i == n - 1 && j < n) || (j == n - i - 1) || (j == 2 * n - 2 - i)) {
                        System.out.print("*");
                        Thread.sleep(75);
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
            System.out.println();
            Thread.sleep(75);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}