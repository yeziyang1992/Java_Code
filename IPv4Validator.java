import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPv4Validator {

    public static boolean isValidIPv4(String ipAddress) {
        if (ipAddress == null || ipAddress.isEmpty()) {
            return false;
        }

        // 定义IPv4地址的正则表达式
        String ipv4Regex = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

        // 使用正则表达式进行匹配
        Pattern pattern = Pattern.compile(ipv4Regex);
        Matcher matcher = pattern.matcher(ipAddress);

        return matcher.matches();
    }

    public static void main(String[] args) {
        // 示例用法
        String ipAddress = "192.168.1.q";
        if (isValidIPv4(ipAddress)) {
            System.out.println(ipAddress + " 是有效的IPv4地址。");
        } else {
            System.out.println(ipAddress + " 不是有效的IPv4地址。");
        }
    }
}
