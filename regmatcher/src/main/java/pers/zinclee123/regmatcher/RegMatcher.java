package pers.zinclee123.regmatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by liyanjin on 2017/5/24.
 * 主要做一些常用字符串格式判断的，几乎每个应用都会最输入判断，这里就少写一点，其他的如密码判断还得自己写，毕竟每个项目都不一样
 * 以后再做补充，目前想到的就这些
 */

public class RegMatcher {

    public static final String EMAIL_REG_EX = "[\\w!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])?";
    public static final String URL_REG_EX = "[a-zA-z]+://[^\\s]*";
    public static final String MOBILE_PHONE_REG_EX = "^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\\d{8}$";
    public static final String ID_CARD_REG_EX = "^(\\d{6})(\\d{4})(\\d{2})(\\d{2})(\\d{3})([0-9]|X)$";
    public static final String QQ_REG_EX = "[1-9][0-9]{4,}";
    public static final String FIX_LINE_TEL_REG_EX = "\\d{3,4}-\\d{7,8}";
    public static final String ZIP_CODE_REG_EX = "[1-9]\\d{5}(?!\\d)";

    /**
     * 是否是Email
     *
     * @param target
     * @return
     */
    public static boolean isEmail(String target) {
        return match(target, EMAIL_REG_EX);
    }

    /**
     * 是否是Url
     *
     * @param target
     * @return
     */
    public static boolean isUrl(String target) {
        return match(target, URL_REG_EX);
    }

    /**
     * 是否是手机号
     *
     * @param target
     * @return
     */
    public static boolean isMobilePhone(String target) {
        return match(target, MOBILE_PHONE_REG_EX);
    }

    /**
     * 是否是身份证号
     *
     * @param target
     * @return
     */
    public static boolean isIDCard(String target) {
        return match(target, ID_CARD_REG_EX);
    }

    /**
     * 是否是QQ号
     *
     * @param target
     * @return
     */
    public static boolean isQQ(String target) {
        return match(target, QQ_REG_EX);
    }

    /**
     * 是否是座机
     *
     * @param target
     * @return
     */
    public static boolean isFixedLineTel(String target) {
        return match(target, FIX_LINE_TEL_REG_EX);
    }

    /**
     * 是否是座机
     *
     * @param target
     * @return
     */
    public static boolean isZipCode(String target) {
        return match(target, ZIP_CODE_REG_EX);
    }

    public static boolean match(String target, String regEx) {
        // 编译正则表达式
        Pattern pattern = Pattern.compile(regEx);
        // 忽略大小写的写法
        // Pattern pat = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(target);
        // 字符串是否与正则表达式相匹配
        return matcher.matches();
    }

}
