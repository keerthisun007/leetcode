class Solution {
    public int countSegments(String s) {
        String k=s.trim();
        if(k.equals(""))return 0;
        String[]arr=k.split("\\s+");
        return arr.length;
    }
}

/*
\\s matches any whitespace character, such as a space, tab, or newline.



+ means one or more, so split("\\s+") splits a string wherever one or more consecutive whitespace characters occur.

*/