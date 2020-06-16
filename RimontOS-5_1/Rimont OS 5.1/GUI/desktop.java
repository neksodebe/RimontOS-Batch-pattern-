import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class desktop {
    public static void main(String[] args) {

        while(true) {
        String username = System. getProperty("user.name");
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatter2= new SimpleDateFormat("HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        Date time = new Date(System.currentTimeMillis());
        System.out.println("RRRRRRRRRRRRRRRRR   IIIIIIIIIIMMMMMMMM               MMMMMMMM     OOOOOOOOO     NNNNNNNN        NNNNNNNNTTTTTTTTTTTTTTTTTTTTTTT                    OOOOOOOOO        SSSSSSSSSSSSSSS ");
        System.out.println("R::::::::::::::::R  I::::::::IM:::::::M             M:::::::M   OO:::::::::OO   N:::::::N       N::::::NT:::::::::::::::::::::T                  OO:::::::::OO    SS:::::::::::::::S         Date: " + formatter.format(date));
        System.out.println("R::::::RRRRRR:::::R I::::::::IM::::::::M           M::::::::M OO:::::::::::::OO N::::::::N      N::::::NT:::::::::::::::::::::T                OO:::::::::::::OO S:::::SSSSSS::::::S         Time: " + formatter2.format(time));
        System.out.println("RR:::::R     R:::::RII::::::IIM:::::::::M         M:::::::::MO:::::::OOO:::::::ON:::::::::N     N::::::NT:::::TT:::::::TT:::::T               O:::::::OOO:::::::OS:::::S     SSSSSSS");
        System.out.println("  R::::R     R:::::R  I::::I  M::::::::::M       M::::::::::MO::::::O   O::::::ON::::::::::N    N::::::NTTTTTT  T:::::T  TTTTTT               O::::::O   O::::::OS:::::S                     Username: " + username);
        System.out.println("  R::::R     R:::::R  I::::I  M:::::::::::M     M:::::::::::MO:::::O     O:::::ON:::::::::::N   N::::::N        T:::::T                       O:::::O     O:::::OS:::::S            ");
        System.out.println("  R::::RRRRRR:::::R   I::::I  M:::::::M::::M   M::::M:::::::MO:::::O     O:::::ON:::::::N::::N  N::::::N        T:::::T                       O:::::O     O:::::O S::::SSSS         ");
        System.out.println("  R:::::::::::::RR    I::::I  M::::::M M::::M M::::M M::::::MO:::::O     O:::::ON::::::N N::::N N::::::N        T:::::T                       O:::::O     O:::::O  SS::::::SSSSS    ");
        System.out.println("  R::::RRRRRR:::::R   I::::I  M::::::M  M::::M::::M  M::::::MO:::::O     O:::::ON::::::N  N::::N:::::::N        T:::::T                       O:::::O     O:::::O    SSS::::::::SS  ");
        System.out.println("  R::::R     R:::::R  I::::I  M::::::M   M:::::::M   M::::::MO:::::O     O:::::ON::::::N   N:::::::::::N        T:::::T                       O:::::O     O:::::O       SSSSSS::::S ");
        System.out.println("  R::::R     R:::::R  I::::I  M::::::M    M:::::M    M::::::MO:::::O     O:::::ON::::::N    N::::::::::N        T:::::T                       O:::::O     O:::::O            S:::::S");
        System.out.println("  R::::R     R:::::R  I::::I  M::::::M     MMMMM     M::::::MO::::::O   O::::::ON::::::N     N:::::::::N        T:::::T                       O::::::O   O::::::O            S:::::S");
        System.out.println("RR:::::R     R:::::RII::::::IIM::::::M               M::::::MO:::::::OOO:::::::ON::::::N      N::::::::N      TT:::::::TT                     O:::::::OOO:::::::OSSSSSSS     S:::::S");
        System.out.println("R::::::R     R:::::RI::::::::IM::::::M               M::::::M OO:::::::::::::OO N::::::N       N:::::::N      T:::::::::T                      OO:::::::::::::OO S::::::SSSSSS:::::S");
        System.out.println("R::::::R     R:::::RI::::::::IM::::::M               M::::::M   OO:::::::::OO   N::::::N        N::::::N      T:::::::::T                        OO:::::::::OO   S:::::::::::::::SS ");
        System.out.println("RRRRRRRR     RRRRRRRIIIIIIIIIIMMMMMMMM               MMMMMMMM     OOOOOOOOO     NNNNNNNN         NNNNNNN      TTTTTTTTTTT                          OOOOOOOOO      SSSSSSSSSSSSSSS   ");
        System.out.println();
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }   
        clrscr();
        }
    
    
    
    
    
                        
                                                                                                     
    }
    public static void clrscr() {
        //Clears Screen in java
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    } 
    public static void RSoD() {
        
    }
}