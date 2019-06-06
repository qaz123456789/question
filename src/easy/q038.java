package easy;

public class q038 {
    /*
    比较简单的迭代，不得不说题目有点难理解
     */
    public String countAndSay(int n) {
        StringBuffer stringBuffer = new StringBuffer("1");
        for (int i = 1; i < n; i++) {
            stringBuffer = new StringBuffer(countAndSay(stringBuffer.toString()));
        }
        return stringBuffer.toString();
    }

    /*
    递归写法,细心的你你会发现两种方法重复了一段代码，现在提取出来了，以供对比
     */
    public String countAndSayRecursive(int n) {
        if (n == 1)
            return "1";
        String res = countAndSayRecursive(n - 1);
        return countAndSay(res);

    }

    public String countAndSay(String res) {
        int count = 1;
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < res.length(); i++) {
            if (i + 1 < res.length() && res.charAt(i) == res.charAt(i + 1)) {
                count++;
            } else {
                result.append(count).append(res.charAt(i));
                count = 1;
            }
        }
        return result.toString();
    }


}
