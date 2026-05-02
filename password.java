import java.util.*;

public class password {
  static String checkpassword(String pass) {
    boolean haslength = false;
    boolean hasupper = false;// by default value false rhti he
    boolean haslower = false;
    boolean hasdigit = false;
    boolean hasSpecial = false;
    if (pass.length() >= 8) {
      haslength = true;
    }
    for (char c : pass.toCharArray()) {
      if (Character.isDigit(c)) {
        hasdigit = true;
      } else if (Character.isUpperCase(c)) {
        hasupper = true;
      } else if (Character.isLowerCase(c)) {
        haslower = true;
      } else {
        hasSpecial = true;

      }
    }
    if (haslength && hasdigit && hasupper && haslower && hasSpecial) {
      return "Strong";
    }
    return "Weak";

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     System.out.println("enter the password");
    String pass = sc.nextLine();
    String status = checkpassword(pass);
    System.out.println(status);
    sc.close();

  }

}
