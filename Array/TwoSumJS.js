var twoSum = function (nums, target) {
  let arr = [];
  for (let i = 0; i < nums.length; i++) {
    for (let j = nums.length - 1; j > 0; j--) {
      if (nums[i] == nums[j]) {
        if (nums[i] + nums[j] == target) {
          arr.push(i);
          arr.push(j);
          return arr;
        } else {
          console.log(false);
        }
      }
    }
  }
};

let nums = [2, 7, 11, 15];
let target = 9;

twoSum(nums, target);
