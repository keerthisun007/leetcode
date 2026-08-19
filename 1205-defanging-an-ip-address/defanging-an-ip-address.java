class Solution {
    public String defangIPaddr(String address) {
        String k=address.replace(".","[.]");
        return k;
    }
}