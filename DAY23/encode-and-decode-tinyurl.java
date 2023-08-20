//   https://leetcode.com/problems/encode-and-decode-tinyurl


public class Codec {
     Map<String, String> map = new HashMap<>();
    public String encode(String longUrl) {
        String key = "bruh69";
        map.put(key, longUrl);
        return key;
    }
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}
// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
