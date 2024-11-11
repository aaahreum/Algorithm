class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String front = phone_number.substring(0, phone_number.length()-4);
        String back = phone_number.substring(phone_number.length()-4, phone_number.length());
        String[] frontList = new String[front.length()];
        for(int i = 0; i < front.length(); i++){
            frontList[i] = "*";
        }
        front = String.join("", frontList);
        answer = front + back;
        
        return answer;
    }
}