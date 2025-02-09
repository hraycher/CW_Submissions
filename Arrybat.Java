public int sum3(int[] nums) {
  int fruit=0;
  for(int i=0; i<nums.length;i++){
    fruit += nums[i];
  }
  return fruit;
}
public boolean commonEnd(int[] a, int[] b) {
return (a[0]==b[0]||a[a.length-1]==b[b.length-1]);
}
public int[] makePi() {
  int [] makePi={3,1,4};
  return makePi;
}
public boolean sameFirstLast(int[] nums) {
  return(nums.length>0 && nums[nums.length-1] == nums[0]);
}
public boolean firstLast6(int[] nums) {
  return(nums[nums.length-1]==6||nums[0]==6);
}
