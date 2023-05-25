/**
 * @param {number[]} nums
 * @return {number[]}
 */
var runningSum = function(nums) {
// A new array is created where the new elements would be store.
let newArray= [];
// the total sum of the current element in nums array.
let tmp = 0;
// I'm going through the array to start summing the current number and store it.
    for (let number of nums) {
        tmp+=number;
        newArray.push(tmp);
    }
// I return the value of the array to the parent variable.
return newArray;
};