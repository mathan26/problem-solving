package com.github.mathan26.concepts.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
* | Quantifier | Description           | Example  | Matches                     |
| ---------- | --------------------- | -------- | --------------------------- |
| `*`        | 0 or more times       | `a*`     | `""`, `"a"`, `"aaa"`        |
| `+`        | 1 or more times       | `a+`     | `"a"`, `"aa"`, but not `""` |
| `?`        | 0 or 1 time           | `a?`     | `""`, `"a"`                 |
| `{n}`      | Exactly n times       | `a{3}`   | `"aaa"`                     |
| `{n,}`     | At least n times      | `a{2,}`  | `"aa"`, `"aaa"`, `"aaaa"`   |
| `{n,m}`    | Between n and m times | `a{2,4}` | `"aa"`, `"aaa"`, `"aaaa"`   |

*
* */
public class RegexQuantifierExample {
    public static void main(String[] args) {
        String pattern = "a+";
        String text = "I have aaaaaa apple and a banana.";


//        String[] inputs = { "ab", "abc", "abcc", "abcccc", "ac" };


        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);


        while (m.find()) {
            System.out.println("Matched: " + m.group());
        }

        //
//        for (String text : inputs) {
//            if (text.matches(pattern)) {
//                System.out.println("Matched: " + text);
//            }
//        }


    }
}
