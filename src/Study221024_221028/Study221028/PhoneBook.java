package Study221024_221028.Study221028;

import java.util.HashSet;

public class PhoneBook {
    class Solution {
        public boolean solution(String[] phone_book) {
            boolean answer = true;
            HashSet<String> hs = new HashSet<>();
            for (var num : phone_book) hs.add(num); // hash set에 중복없이 전화번호를 담음

            for (int i = 0; i < phone_book.length; i++) {
                for( int j = 0; j < phone_book.length ; j++) {
                    if(hs.contains(phone_book[j]))
                        return false;
                }
            }
            return true;
        }
    }
}
