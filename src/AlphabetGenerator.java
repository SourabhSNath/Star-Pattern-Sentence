public class AlphabetGenerator {

    void alphaA(int i, int n) {


        for (int j = 0; j < n; j++) {

            if ((j == 0 || j == n - 1) && i != 0 || i == n / 2 || (j != 0 && j != n - 1) && i == 0) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }

        }
        System.out.print(" ");
    }


    void alphaB(int i, int n) {

        for (int j = 0; j < n; j++) {
            if (j == 0 || i == n / 2 && j <= n - 2 || i == 0 && j != n - 1 || i == n - 1 && j != n - 1 || (i != 0 && i != n / 2 && i != n - 1) && j == n - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }

        System.out.print(" ");

    }


    void alphaC(int i, int n) {

        for (int j = 0; j < n; j++) {
            if (j == 0 && (i != 0 && i != n - 1) || i == 0 && j != 0 || i == n - 1 && j != 0) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print(" ");
    }


    void alphaD(int i, int n) {

        for (int j = 0; j < n; j++) {
            if (j == 1 || i == 0 && j != n - 1 || i == n - 1 && j != n - 1 || j == n - 1 && (i != 0 && i != n - 1)) {
                System.out.print("*");

            } else {
                System.out.print(" ");
            }

        }
        System.out.print(" ");

    }


    void alphaE(int i, int n) {

        for (int j = 0; j < 3 * n / 4; j++) {
            if (j == 0 || i == 0 && j <= n || i == n / 2 && j <= n || i == n - 1 && j <= n) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }

            System.out.print(" ");

        }
    }

    void alphaF(int i, int n) {

        for (int j = 0; j < n; j++) {
            if (j == 0 || i == 0 && j <= 3 * n / 4 || i == n / 2 && j <= 3 * n / 4) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }

        System.out.print(" ");
    }

    void alphaG(int i, int n) {

        for (int j = 0; j < n; j++) {

            if (j == 0 && (i != 0 && i != n - 1) || i == 0 && (j <= 3 * n / 4 && j != 0) || i == n - 1 && (j <= (3 * n / 4) - 1 && j != 0) || i >= n / 2 && j == (3 * n / 4) - 1
                    || i == n / 2 && j >= n - 1 || i >= n / 2 && j == n - 1 || i == n / 2 && j > (3 * n / 4) - 2) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }

        }

        System.out.print(" ");

    }

    void alphaH(int i, int n) {

        for (int j = 0; j < n; j++) {
            if (j == 0 || j == n - 1 || i == n / 2) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print(" ");
    }

    void alphaI(int i, int n) {

        for (int j = 0; j < n; j++) {
            if (i == 0 || i == n - 1 || j == n / 2) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print(" ");
    }

    void alphaJ(int i, int n) {

        for (int j = 0; j < n; j++) {
            if (i == 0 || j == n / 2 || i >= 3 * n / 4 && j == 0 || i == n - 1 && j <= n / 2) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }

        System.out.print(" ");

    }

    void alphaK(int i, int n) {

        for (int j = 0; j < n; j++) {
            if (j == 0 || j + i == (3 * n / 4) - 1 || i - j == (3 * n / 4) - 3) {            //wut
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }

    void alphaL(int i, int n) {
        for (int j = 0; j < n; j++) {
            if (j == 0 || i == n - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }

        System.out.print(" ");
    }

    void alphaM(int i, int n) {
        for (int j = 0; j < n; j++) {
            if (j == 0 || j == n - 1 || i <= n / 2 && j == i || i + j == n - 1 && i <= n / 2) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print(" ");

    }

    void alphaN(int i, int n) {

        for (int j = 0; j < n; j++) {
            if (j == 0 || j == n - 1 || j == i) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print(" ");

    }

    void alphaO(int i, int n) {

        for (int j = 0; j < n; j++) {
            if (i == 0 && (j != 0 && j != n - 1) || j == 0 && (i != 0 && i != n - 1) || i == n - 1 && (j != 0 && j != n - 1) || j == n - 1 && (i != 0 && i != n - 1)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print(" ");

    }

    void alphaP(int i, int n) {

        for (int j = 0; j < n; j++) {
            if (j == 0 && i != 0 || i == 0 && (j != 0 && j != n - 1) || i <= n / 2 && i != 0 && i != n / 2 && j == n - 1 || i == n / 2 && j != n - 1 && j != 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }

        System.out.print(" ");

    }

    void alphaQ(int i, int n) {
        for (int j = 0; j < n; j++) {
            if (i == 0 && (j != 0 && j != n - 1) || j == 0 && (i != 0 && i <= n - 3 && i != n - 3) || i == n - 3 && (j != 0 && j != n - 1)
                    || j == n - 1 && (i != 0 && i != n - 3 && i <= n - 3) || i == j && i >= n - 4) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print(" ");

    }

    void alphaR(int i, int n) {
        for (int j = 0; j < n; j++) {
            if (j == 0 || i == 0 && j != n - 1 || j == n - 1 && i <= n / 2 && i != 0 && i != n / 2 || i == n / 2 && j != n - 1 || i >= n / 2 && i == j) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }

        }
        System.out.print(" ");

    }

    void alphaS(int i, int n) {

        for (int j = 0; j < n; j++) {
            if (i == 0 && (j != 0 && j != n - 1) || i == 1 && j == n - 1 || j == 0 && i <= n / 2 && i != 0 && i != n / 2 || i == n / 2 && j != 0 && j != n - 1
                    || j == n - 1 && i != n / 2 && i != n - 1 && i >= n / 2 || i == n - 1 && j != 0 && j != n - 1 || i == n - 2 && j == 0) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print(" ");

    }

    void alphaT(int i, int n) {
        for (int j = 0; j < n; j++) {
            if (i == 0 || j == n / 2) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print(" ");
    }

    void alphaU(int i, int n) {

        for (int j = 0; j < n; j++) {
            if (j == 0 && i != n - 1 || j == n - 1 && i != n - 1 || i == n - 1 && j != 0 && j != n - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print(" ");

    }

    void alphaV(int i, int n) {
        for (int j = 0; j < n; j++) {
            if (i - j == n / 2 || i + j == n + n / 2 - 1 || j == 0 && i <= n / 2 || j == n - 1 && i <= n / 2) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }

        System.out.print(" ");
    }

    void alphaW(int i, int n) {
        for (int j = 0; j < n; j++) {
            if (j == 0 || j == n - 1 || i >= n / 2 && j == i || i >= n / 2 && j == n - i - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print(" ");

    }

    void alphaX(int i, int n) {
        for (int j = 0; j < n; j++) {
            if (i == j || i == n - j - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print(" ");
    }

    void alphaY(int i, int n) {
        for (int j = 0; j < n; j++) {
            if (i <= n / 2 && j == i || i <= n / 2 && j == n - i - 1 || j == n / 2 && i >= n / 2) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print(" ");

    }

    void alphaZ(int i, int n) {
        for (int j = 0; j < n; j++) {
            if (i == 0 || j == n - i - 1 || i == n - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print(" ");
    }

}
