public int[] rotateLeft3(int[] nums){
int firstNumber=nums[0];
for(int i=0;i<nums.length-1;i++){
  nums[i]=nums[i+1];
}
nums[nums.length-1]=firstNumber;
return nums;
}
public int[] reverse3(int[] nums) {
for(int i=0; i<nums.length-1;i++){
  int bla=nums[i];
  nums[i]=nums[nums.length-1-i];
  nums[nums.length-1-i]=bla;
}
return nums;
}
public int[] maxEnd3(int[] nums) {
int [] moLes=new int [3];
for (int i=0; i<3;i++){
  if(nums[0]>nums[nums.length-1]){
    moLes[i]=nums[0];
  }else{
    moLes[i]=nums[nums.length-1];
  }
}
return moLes;
}

public int sum2(int[] nums) {
int wag=0;
for(int i=0;i<2;i++){
  if(i<nums.length){
    wag+=nums[i];
  }
}
return wag;
}

public int[] middleWay(int[] a, int[] b) {
int[] moLak=new int[2];
int[] moWak={a[1],b[1]};
for (int i=0; i<2;i++){
  moLak[i]=moWak[i];
}
return moLak;
}
public int[] makeEnds(int[] nums) {
int[]what=new int[2];
for(int i=0;i<2;i++){
  if(i==0){
    what[i]=nums[0];
  }else{
    what[i]=nums[nums.length-1];
  }
}
return what;
}


