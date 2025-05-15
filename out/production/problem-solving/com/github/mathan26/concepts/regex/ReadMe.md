What is Regex?

A regular expression is a sequence of characters that forms a search pattern. It is mainly used for string pattern matching and validation.

In Java, regex is supported through the java.util.regex package.
Basic Syntax:

    . → Any character except newline

    ^ → Start of string

    $ → End of string

    [] → Matches any one character within the brackets

    | → OR operator

    \ → Escape character



    Pattern.compile(String) compiles the regex.

    Matcher is used to find matches in a string.

    find() scans for the next match.

    group() returns the matched string.



| Quantifier | Description           | Example  | Matches                     |
| ---------- | --------------------- | -------- | --------------------------- |
| `*`        | 0 or more times       | `a*`     | `""`, `"a"`, `"aaa"`        |
| `+`        | 1 or more times       | `a+`     | `"a"`, `"aa"`, but not `""` |
| `?`        | 0 or 1 time           | `a?`     | `""`, `"a"`                 |
| `{n}`      | Exactly n times       | `a{3}`   | `"aaa"`                     |
| `{n,}`     | At least n times      | `a{2,}`  | `"aa"`, `"aaa"`, `"aaaa"`   |
| `{n,m}`    | Between n and m times | `a{2,4}` | `"aa"`, `"aaa"`, `"aaaa"`   |

