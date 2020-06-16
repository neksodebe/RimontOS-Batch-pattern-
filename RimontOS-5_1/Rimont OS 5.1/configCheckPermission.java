public class configCheckPermission {
    public static void main(String[] args) {
        checkPermission();
    }
    public static void checkPermission() {
        try {
                String command = "reg query \"HKU\\S-1-5-19\"";
                Process p = Runtime.getRuntime().exec(command);
                p.waitFor();                            // Wait for for command to finish
                int exitValue = p.exitValue();          // If exit value 0, then admin user.
        
                if (0 == exitValue) {
                    System.out.println("Sorry, but to start the configuration, you need to run this file as");
                } else {
                    System.out.println("non admin user");
                }
        
            } catch (Exception e) {
                e.printStackTrace(); // java configCheckPermission.java
            }
    }
}