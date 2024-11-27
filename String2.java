public String doubleChar(String str) {
String strDoubleChar="";
for(int i=0; i<str.length();i++){
  strDoubleChar= strDoubleChar+str.substring(i, i+1)+str.substring(i, i+1);
}
return strDoubleChar;
}
