public boolean cigarParty(int cigars, boolean isWeekend) {
 if(!isWeekend){
  return cigars >= 40 && cigars <= 60;
 }
 else
 {
  return cigars >= 40;
 }
 }
public int dateFashion(int you, int date) {
if(you <= 2 || 2 >= date){
  return 0;
}
else
{ 
if(you >= 9 || 9 <= date){
  return 2;
}
else
{
  return 1;
  
}
}
}
public boolean squirrelPlay(int temp, boolean isSummer) {
 if(isSummer == true){
  return temp >= 60 &&  temp <= 100;
 }
 else{
return temp >= 60 &&  temp <= 90;
}
}



public int caughtSpeeding(int speed, boolean isBirthday) {
 if(isBirthday==false) {
        if(speed <= 60) {
            return 0;
        } else if(speed <= 80) {
            return 1;
        } else {
            return 2;
        }
    }
    if(speed <= 65) {
        return 0;
    } else if(speed <= 85) {
        return 1;
    } else {
        return 2;
    }
}
public int sortaSum(int a, int b) {
if( 10 <= a+b && a+b <= 19)
return 20;
return a+b;

}
public String alarmClock(int day, boolean vacation) {
 if(vacation==false){
   if (day >= 1 && day <= 5) {
return "7:00";
  } else{
    return "10:00";
  }
  }else{
    if (day>=1 && day <= 5){
      return "10:00";
    }else{
      return "off";
    }
  }
 }
public boolean in1To10(int n, boolean outsideMode) {
if(outsideMode){
  if (n <= 1 || 10 <= n){
    return true;
  }
 } else
  {
    if(n>=1 && 10>=n){
      return true;
    }
  }
 

return false;
}
public boolean old35(int n) {
 if(n%3==0||n%5==0){
  if(!(n%3==0&&n%5==0)) {
    return true;
  }else{
    return false;
  }
}
else
return false;
  
}
