public class ArrayToString {
    public static void main(String[] args) {
        String[] arr = new String[] {
               " Hi!", "This", "is", "String", "Array."};
        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str).append(" ");
        }
        System.out.println(sb);
    }
}
