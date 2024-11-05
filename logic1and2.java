public boolean cigarParty(int cigars, boolean isWeekend) {
 if (isWeekend == true && cigars >= 40)
 return true;
 if(!(isWeekend) && cigars >= 40 && cigars <= 60)
 return true;
 else
 return false;

}
public int dateFashion(int you, int date) {
  if(you <= 2 || date <= 2)
  return 0;
  if(you>= 8 || date >= 8)
  return 2;
  else
  return 1;
}
public boolean squirrelPlay(int temp, boolean isSummer) {
  if(isSummer && 60 <= temp && temp <=100)
  return true;
  if (!isSummer && 60 <= temp && temp <=90)
  return true;
  
  return false;
}

public int caughtSpeeding(int speed, boolean isBirthday) {
 if(isBirthday) {
if(speed <= 65) {
return 0;
 } else if (66 <= speed && speed <= 85){
return 1;
}else if (86 <= speed){
return 2;
 }
 } 
 if (speed <= 60){
   return 0;
 }
 else if(61 <= speed && speed<=80){
   return 1;
 }else { 
  return 2;
 }
}
public int sortaSum(int a, int b) {
  int sum  = a+b;
  if( 10<= sum && sum<=19)
  return 20;
  return sum;
}
public String alarmClock(int day, boolean vacation) {
if(vacation){
  if( day > 0 && day != 6)
  return "10:00";
  else 
  return "off";
}
else if ( day>0 && day !=6)
return "7:00";
else 
return "10:00";
}
public boolean in1To10(int n, boolean outsideMode) {
if(!outsideMode){
  if (n >= 1 && n <= 10){
    return true;
  }
  else{
    return false;
  }
}
else {
  if (n <= 1 || n >= 10){
    return true;
  }
  else{
    return false;
  }
}
}

public boolean old35(int n) {
  return ( n % 3 == 0) != (n % 5 == 0);
}
