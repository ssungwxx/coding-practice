import java.util.LinkedList;

public class P0006_ZigZagConversion {
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3)); // PAHNAPLSIIGYIR
        System.out.println(convert("PAYPALISHIRING", 4)); // PINALSIGYAHRPI
        System.out.println(convert("123456789", 4)); // 172683594
        System.out.println(convert("AB", 1));
    }

    public static String convert(String s, int numRows) {
        if(numRows == 1) return s;

        LinkedList<StringBuilder> list = new LinkedList<>();

        for(int i = 0; i < Math.min(numRows, s.length()); i ++){
            list.add(new StringBuilder());
        }

        int cur = 0;
        boolean isGoingDown = false;

        for (char c: s.toCharArray()) {
            list.get(cur).append(c);
            if(cur == 0 || cur == numRows - 1) isGoingDown = !isGoingDown;
            cur += isGoingDown ? 1 : -1;
        }

        StringBuilder sb = new StringBuilder();

        for (StringBuilder p: list) {
            sb.append(p);
        }

        return sb.toString();
    }
}
