/*
 You are given two strings word1 and word2. Merge the strings by adding letters
 in alternating order, starting with word1. If a string is longer than the other, 
 append the additional letters onto the end of the merged string.
Return the merged string.

Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
 */

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;

        while (i < m || j < n) {
            if (i < m) {
                result.append(word1.charAt(i++));
            }
            if (j < n) {
                result.append(word2.charAt(j++));
            }
        }

        return result.toString();
    }
}

/*
Create two variables, m and n, to store the length of word1 and word2.
Create an empty string variable result to store the result of merged words.
Create two pointers, i and j to point to indices of word1 and word2. We initialize both of them to 0.
While i < m || j < n:
    If i < m, it means that we have not completely traversed word1. As a result, we append word1[i] to result. We increment i to point to next index of words.
    If j < n, it means that we have not completely traversed word2. As a result, we append word2[j] to result. We increment j to point to next index of words.
Return results. 
 
 */