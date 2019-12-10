import java.util.Scanner;

public class Words {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AlphabetGenerator alphabets = new AlphabetGenerator();

        String word = scanner.nextLine();
        word = word.toUpperCase();

        int n = 7;


        for (int i = 0; i < n; i++) {


            for (int c = 0; c < word.length(); c++) {

                System.out.print(" "); //For a margin at the beginning

                switch (word.charAt(c)) {
                    case 'A':
                        alphabets.alphaA(i, n);
                        break;
                    case 'B':
                        alphabets.alphaB(i, n);
                        break;
                    case 'C':
                        alphabets.alphaC(i, n);
                        break;
                    case 'D':
                        alphabets.alphaD(i, n);
                        break;
                    case 'E':
                        alphabets.alphaE(i, n);
                        break;
                    case 'F':
                        alphabets.alphaF(i, n);
                        break;
                    case 'G':
                        alphabets.alphaG(i, n);
                        break;
                    case 'H':
                        alphabets.alphaH(i, n);
                        break;
                    case 'I':
                        alphabets.alphaI(i, n);
                        break;
                    case 'J':
                        alphabets.alphaJ(i, n);
                        break;
                    case 'K':
                        alphabets.alphaK(i, n);
                        break;
                    case 'L':
                        alphabets.alphaL(i, n);
                        break;
                    case 'M':
                        alphabets.alphaM(i, n);
                        break;
                    case 'N':
                        alphabets.alphaN(i, n);
                        break;
                    case 'O':
                        alphabets.alphaO(i, n);
                        break;
                    case 'P':
                        alphabets.alphaP(i, n);
                        break;
                    case 'Q':
                        alphabets.alphaQ(i, n);
                        break;
                    case 'R':
                        alphabets.alphaR(i, n);
                        break;
                    case 'S':
                        alphabets.alphaS(i, n);
                        break;
                    case 'T':
                        alphabets.alphaT(i, n);
                        break;
                    case 'U':
                        alphabets.alphaU(i, n);
                        break;
                    case 'V':
                        alphabets.alphaV(i, n);
                        break;
                    case 'W':
                        alphabets.alphaW(i, n);
                        break;
                    case 'X':
                        alphabets.alphaX(i, n);
                        break;
                    case 'Y':
                        alphabets.alphaY(i, n);
                        break;
                    case 'Z':
                        alphabets.alphaZ(i, n);
                        break;

                    default:
                        break;
                }
            }


            System.out.println();
        }
    }
}

