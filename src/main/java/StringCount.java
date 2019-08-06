public class StringCount {

    public String lastFirstCount(String toConvert) {
        if (toConvert.isEmpty()) {
            return null;
        } else if (toConvert.length() == 1) {
            return toConvert;
        }
        return toConvert.charAt(0) + String.valueOf(toConvert.length() - 2) + toConvert.charAt(toConvert.length() - 1);
    }
}
