import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPv6Validator {

    public static boolean isValidIPv6(String ipAddress) {
        if (ipAddress == null || ipAddress.isEmpty()) {
            return false;
        }

        // 定义IPv6地址的正则表达式
        String ipv6Regex = "^(?i)[0-9a-f]{1,4}(:[0-9a-f]{1,4}){7}$";

        // 使用正则表达式进行匹配
        Pattern pattern = Pattern.compile(ipv6Regex);
        Matcher matcher = pattern.matcher(ipAddress);

        return matcher.matches();
    }

    public static void main(String[] args) {
        // 示例用法
        String ipAddress = "200:0db8:85a3:0000:0000:8a2e:0370:7334";
        if (isValidIPv6(ipAddress)) {
            System.out.println(ipAddress + " 是有效的IPv6地址。");
        } else {
            System.out.println(ipAddress + " 不是有效的IPv6地址。");
        }
    }
}
