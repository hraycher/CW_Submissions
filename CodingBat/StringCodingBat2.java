public String withoutEnd(String str) {
return (str.substring(1, str.length ()-1));
}
public String firstTwo(String str) {
     if(str.length() < 2)
        return str;
          
    return str.substring(0, 2);
}
public String extraEnd(String str) {
String s = str.substring(str.length()-2, str.length());
  return s+s+s;

}
public String makeOutWord(String out, String word) {
 String front = out.substring(0,2);
 String back = out.substring (2);
 return front + word + back;
}

