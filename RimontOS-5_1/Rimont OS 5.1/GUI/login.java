import java.io.IOException;
import java.security.Permission;
import java.util.Scanner;

public class login {
        public synchronized static void main(String[] args) {
                welcomeSound();
                System.out.println(
                                "RRRRRRRRRRRRRRRRR   IIIIIIIIIIMMMMMMMM               MMMMMMMM     OOOOOOOOO     NNNNNNNN        NNNNNNNNTTTTTTTTTTTTTTTTTTTTTTT                    OOOOOOOOO        SSSSSSSSSSSSSSS ");
                System.out.println(
                                "R::::::::::::::::R  I::::::::IM:::::::M             M:::::::M   OO:::::::::OO   N:::::::N       N::::::NT:::::::::::::::::::::T                  OO:::::::::OO    SS:::::::::::::::S");
                System.out.println(
                                "R::::::RRRRRR:::::R I::::::::IM::::::::M           M::::::::M OO:::::::::::::OO N::::::::N      N::::::NT:::::::::::::::::::::T                OO:::::::::::::OO S:::::SSSSSS::::::S");
                System.out.println(
                                "RR:::::R     R:::::RII::::::IIM:::::::::M         M:::::::::MO:::::::OOO:::::::ON:::::::::N     N::::::NT:::::TT:::::::TT:::::T               O:::::::OOO:::::::OS:::::S     SSSSSSS");
                System.out.println(
                                "  R::::R     R:::::R  I::::I  M::::::::::M       M::::::::::MO::::::O   O::::::ON::::::::::N    N::::::NTTTTTT  T:::::T  TTTTTT               O::::::O   O::::::OS:::::S            ");
                System.out.println(
                                "  R::::R     R:::::R  I::::I  M:::::::::::M     M:::::::::::MO:::::O     O:::::ON:::::::::::N   N::::::N        T:::::T                       O:::::O     O:::::OS:::::S            ");
                System.out.println(
                                "  R::::RRRRRR:::::R   I::::I  M:::::::M::::M   M::::M:::::::MO:::::O     O:::::ON:::::::N::::N  N::::::N        T:::::T                       O:::::O     O:::::O S::::SSSS         ");
                System.out.println(
                                "  R:::::::::::::RR    I::::I  M::::::M M::::M M::::M M::::::MO:::::O     O:::::ON::::::N N::::N N::::::N        T:::::T                       O:::::O     O:::::O  SS::::::SSSSS    ");
                System.out.println(
                                "  R::::RRRRRR:::::R   I::::I  M::::::M  M::::M::::M  M::::::MO:::::O     O:::::ON::::::N  N::::N:::::::N        T:::::T                       O:::::O     O:::::O    SSS::::::::SS  ");
                System.out.println(
                                "  R::::R     R:::::R  I::::I  M::::::M   M:::::::M   M::::::MO:::::O     O:::::ON::::::N   N:::::::::::N        T:::::T                       O:::::O     O:::::O       SSSSSS::::S ");
                System.out.println(
                                "  R::::R     R:::::R  I::::I  M::::::M    M:::::M    M::::::MO:::::O     O:::::ON::::::N    N::::::::::N        T:::::T                       O:::::O     O:::::O            S:::::S");
                System.out.println(
                                "  R::::R     R:::::R  I::::I  M::::::M     MMMMM     M::::::MO::::::O   O::::::ON::::::N     N:::::::::N        T:::::T                       O::::::O   O::::::O            S:::::S");
                System.out.println(
                                "RR:::::R     R:::::RII::::::IIM::::::M               M::::::MO:::::::OOO:::::::ON::::::N      N::::::::N      TT:::::::TT                     O:::::::OOO:::::::OSSSSSSS     S:::::S");
                System.out.println(
                                "R::::::R     R:::::RI::::::::IM::::::M               M::::::M OO:::::::::::::OO N::::::N       N:::::::N      T:::::::::T                      OO:::::::::::::OO S::::::SSSSSS:::::S");
                System.out.println(
                                "R::::::R     R:::::RI::::::::IM::::::M               M::::::M   OO:::::::::OO   N::::::N        N::::::N      T:::::::::T                        OO:::::::::OO   S:::::::::::::::SS ");
                System.out.println(
                                "RRRRRRRR     RRRRRRRIIIIIIIIIIMMMMMMMM               MMMMMMMM     OOOOOOOOO     NNNNNNNN         NNNNNNN      TTTTTTTTTTT                          OOOOOOOOO      SSSSSSSSSSSSSSS   ");

                try {
                        Thread.sleep(1000);
                } catch (final InterruptedException ex) {
                        Thread.currentThread().interrupt();
                }
                stopWelcomeSound();
                clrscr();
                System.out.println("========================== Please log in. ==========================");
                System.out.print("        Login: ");
                Scanner loginScanner = new Scanner(System.in);
                String login = loginScanner.nextLine();
                clrscr();
                System.out.println("========================== Please log in. ==========================");
                System.out.println("        Login: " + login);
                System.out.print("        Password: ");
                Scanner passScanner = new Scanner(System.in);
                String pass = passScanner.nextLine();
                clrscr();
                System.out.println("========================== Please log in. ==========================");
                System.out.println("        Login: " + login);
                System.out.println("        Password: " + pass);
                System.out.println("====================================================================");
                System.out.println();
                System.out.println("Checking. | Please wait");
                try {
                        Thread.sleep(1000);
                } catch (final InterruptedException ex) {
                        Thread.currentThread().interrupt();
                }
                clrscr();
                System.out.println("========================== Please log in. ==========================");
                System.out.println("        Login: " + login);
                System.out.println("        Password: " + pass);
                System.out.println("====================================================================");
                System.out.println();
                System.out.println("Checking.. | Please wait");
                try {
                        Thread.sleep(1000);
                } catch (final InterruptedException ex) {
                        Thread.currentThread().interrupt();
                }
                clrscr();
                System.out.println("========================== Please log in. ==========================");
                System.out.println("        Login: " + login);
                System.out.println("        Password: " + pass);
                System.out.println("====================================================================");
                System.out.println();
                System.out.println("Checking... | Please wait");
                try {
                        Thread.sleep(1000);
                } catch (final InterruptedException ex) {
                        Thread.currentThread().interrupt();
                }

        }

        public static void clrscr() {
                // Clears Screen in java
                try {
                        if (System.getProperty("os.name").contains("Windows"))
                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        else
                                Runtime.getRuntime().exec("clear");
                } catch (IOException | InterruptedException ex) {
                }
        }

        public static void welcomeSound() {
                try {
                        if (System.getProperty("os.name").contains("Windows")) {
                                String rimontOSpath = System.getenv("RimontOS");
                                new ProcessBuilder("cmd", "/c", "start vlc \"" + rimontOSpath + "/GUI/welcome.wav\"")
                                                .inheritIO().start().waitFor();
                        } else
                                System.out.println("Sorry, but this \"OS\" works only on Windows.");

                } catch (IOException | InterruptedException ex) {
                        System.out.println("Error: " + ex);
                }
        }

        public static void stopWelcomeSound() {
                try {
                        if (System.getProperty("os.name").contains("Windows")) {
                                new ProcessBuilder("cmd", "/c", "taskkill /f /im vlc.exe").inheritIO().start()
                                                .waitFor();
                        } else
                                System.out.println("Sorry, but this \"OS\" only works on Windows.");
                } catch (IOException | InterruptedException ex) {
                        System.out.println("Error: " + ex);
                }
        }
}
