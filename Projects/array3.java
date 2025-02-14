public boolean has23(int[] nums) {
for(int i=0;i<2;i++){
  if(nums[i]==2||nums[i]==3){
    return true;
  }
}
return false;
}
public boolean no23(int[] nums) {
  for(int i=0;i<2;i++){
  if(nums[i]==2||nums[i]==3){
    return false;
  }
}
return true;
}


public int[] makeLast(int[] nums) {
  int [] bag=new int[nums.length*2];
  for(int i=0;i<nums.length;i++){
    bag[bag.length-1]=nums[nums.length-1];
  }
  return bag;
}
public boolean double23(int[] nums) {
for(int i=0;i<nums.length-1;i++){
  if(nums[0]==2&&nums[1]==2||(nums[0]==3&&nums[1]==3)){
    return true;
  }else{
    return false;
  }
}
return false;
}
public int[] fix23(int[] nums) {
  for(int i = 0; i<nums.length - 1; i++) {
    if(nums[i] == 2 && nums[i + 1] == 3){
      nums[i+1] = 0;
    }
  }
  return nums;
}public int start1(int[] a, int[] b) {
  int count=0;
  for (int i=0; i<a.length; i++){
    if(a[i]==1){
      count++;
    }
  }
  for (int i=0; i<b.length; i++){
    if(b[i]==1){
      count++;
    }
  }
  return count;
}
public int[] biggerTwo(int[] a, int[] b) {
  for (int i=0; i<a.length && i<b.length;i++){
    if(a[i] + a[i+1] < b[i] + b[i+1]){
      return b;
    }else{
       return a;
    }
  }
  return a;
}
public int[] makeMiddle(int[] nums) {
int [] blag=new int [2];
int bla=nums.length/2;
for (int i=0; i<2;i++){
  blag[i] = nums[bla -1 +i];
}
return blag;
}
public int[] plusTwo(int[] a, int[] b) {
 int [] two = new int [a.length + b.length];
  for(int i=0; i<a.length;i++){
    two[i]=a[i];
  }
  for (int i=0; i<b.length;i++){
    two[a.length+i]=b[i];
  }
  return two;
}
public int[] swapEnds(int[] nums) {
  if(nums.length>1)
  for (int i=0; i<1;i++){
    int temp = nums[0];
    nums[0] =nums[nums.length-1];
    nums[nums.length-1]=temp;
  }
  return nums;
}
public int[] midThree(int[] nums) {
  int half = nums.length /2;
  int[] three = new int [3];
  for(int i=0; i<3 ;i++){
    three[i]=nums[half -1+i];
  }
  return three;
}
public int maxTriple(int[] nums) {
  int blank = nums [0];
  for (int i=0; i<nums.length; i++){
    if(blank<nums[nums.length/2]){
      blank = nums[nums.length/2];
    }else{
      if(blank<nums[nums.length-1]){
        blank = nums[nums.length-1];
      }
    }
  }
  return blank;
}
public int[] frontPiece(int[] nums) {
  int[] bag= new int [2];
  for (int i=0; i<2; i++){
    if(i<nums.length){
    bag[i]=nums[i];}else{
      if(i>nums.length){
        return nums;}else{
          if(i==nums.length){
            return nums;
          }
        }
    }
  }
  return bag;
}
public boolean unlucky1(int[] nums) {
  for(int i=0; i<nums.length-1; i++){
    if((nums[0] == 1 && nums[1] == 3) || (nums[nums.length-2] == 1 && nums[nums.length-1] == 3)){
      return true;
    }else{
      if (nums.length > 2 && nums[1] == 1 && nums[2] == 3) {
        return true;}
    }
  }
  return false;
}
public int[] make2(int[] a, int[] b) {
  int [] bag = new int [2];
  for (int i=0; i<2; i++){
    if(i<a.length){
      bag[i]=a[i];
    }else{
      bag[i]= b[i-a.length];
    }
  }
  return bag;
}
public int[] front11(int[] a, int[] b) {
  int[] bag = new int [2];
  int count = 0;
  for(int i=0; i<2;i++){
    if(i == 0 && a.length>0){
      bag[count++]=a[0];
    }else if (i == 1 && b.length>0){
      bag[count++]=b[0];
    }
  }
  int[] stuff=new int [count];
  for( int i=0; i<count; i++){
    stuff[i]=bag[i];
  }
  return stuff;
}
