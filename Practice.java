import java.util.ArrayList;

public class Practice {
    public static void main(String args[]){
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        a.add("Black");
        a.add("White");
        a.add("Violet");
        a.add(0,"Amber");
        a.remove(0);
        // System.out.println(a);
        for(int i = 0; i < a.size(); i++) {
            b.add(a.get(i));
        }
        System.out.println(b);
    }
}
