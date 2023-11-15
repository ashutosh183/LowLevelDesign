public class Tester {
    public static void main(String[] args) {

        User user = new User.Builder(12, "Pandey").build();
        System.out.println(user.toString());
    }
}
