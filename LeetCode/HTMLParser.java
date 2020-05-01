import java.util.*;

public class HTMLParser {
    public static void main(String[] args) {
        String text = "&amp; is an HTML entity but &ambassador; is not.";

        String QM = "&quot;";
        String SQM = "&apos;";
        String A = "&amp;";
        String GTS = "&gt;";
        String LTS = "&lt;";
        String S = "&frasl;";

        text = text.replace(QM, "\"");
        text = text.replace(SQM, "\'");
        text = text.replace(A, "&");
        text = text.replace(GTS, ">");
        text = text.replace(LTS, "<");
        text = text.replace(S, "/");

        System.out.println(text);
    }
}