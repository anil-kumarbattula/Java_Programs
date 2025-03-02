import java.util.*;

public class String_Practice {
    public static String upperCase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1; i<str.length(); i++) {
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i )));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    // public static float path(String str) {
    //     int x = 0, y = 0;
    //     for(int i=0; i<str.length(); i++) {
    //         if(str.charAt(i) == 'S') {
    //             y--;
    //         }else if(str.charAt(i) == 'N') {
    //             y++;
    //         }else if(str.charAt(i) == 'W') {
    //             x--;
    //         }else {
    //             x++;
    //         }
    //     }
    //     return (float)Math.sqrt(x*x + y*y);

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // System.out.print(path(str));
        System.out.println(upperCase(str));
    }
}
