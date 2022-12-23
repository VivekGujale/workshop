public class ToggleString {
    public static void main(String[] args) {
        String string = "PrePInsTa";
        StringBuilder stringBuilder = new StringBuilder(string);
        for (int i = 0; i < string.length(); i++) {
            if (Character.isUpperCase(string.charAt(i))) {
                stringBuilder.setCharAt(i, Character.toLowerCase(string.charAt(i)));
            } else if (Character.isLowerCase(string.charAt(i))) {
                stringBuilder.setCharAt(i, Character.toUpperCase(string.charAt(i)));
            }
        }
        System.out.println("Converted String : " + stringBuilder);
    }
}
