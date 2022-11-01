package Study221024_221028.Study221028;

import java.util.HashSet;

public class PhoneBook {
    class Solution {
        public boolean solution(String[] phone_book) {
            HashSet<String> hs = new HashSet<>();
            for (var num : phone_book) hs.add(num); // hash set에 중복없이 전화번호를 담음


            for (int j = 0; j < phone_book.length; j++) {
                for (int i = 0; i < phone_book.length; i++) {
                    if (hs.contains(phone_book[i]))
                        return false;
                }
            }
            return true;
        }
    }
}
