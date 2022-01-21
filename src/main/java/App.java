public class App {


    public static void main(String[] args) {
        String text = "c ";
        char[] chars = text.trim().toCharArray();
        int key = -3;

        System.out.println(chars);
//
      for( char c: chars){
            c+=key;
            System.out.print(c);
        }



    }

}
