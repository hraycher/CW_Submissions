public String firstTwo(String str) {
return str.substring(0,2);
}
public String withoutEnd(String str) {
return str.substring(1,str.length()-1);
  
}
public String firstHalf(String str) {
  int leng = str.length();
String half = new String (str.substring(0,leng/2));
return half;
}
public String makeOutWord(String out, String word) {
 String firstthree = out.substring(0,2);
 String lastthree = out.substring (2);
 return firstthree + word + lastthree;
}
public String extraEnd(String str) {
String last2 = str.substring(str.length()-2);
  return last2+last2+last2;

}
