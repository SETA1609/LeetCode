/**
 * @param {number[]} nums
 * @return {number}
 */
var pivotIndex = function(nums) {
    //current index set to -1 in case there is no pivot index.
    let index=-1;
    // left and right sums are definiert for checking
    // purposes and are set to 0 for cases where the left or right sum  are 0
    let leftSum=0;
    let rightSum=0;
    // for loop to iterate through the array
    for (let i = 0; i <nums.length ; i++) {
        //sums are set to 0 after each iteration.
        leftSum=0;
        rightSum=0;
        // if index i is not 0 we iterate through the left side
        // of the array after the current index.
        if (i!==0){
            for (let j = i-1; j >=0 ; j--) {
                //we iterate and sum each element of the left side.
                leftSum+=nums[j];
            }
        }
        //we iterate and sum each element of the right side.
        for (let k = i+1; k <nums.length ; k++) {
            rightSum+=nums[k];
        }
        // its checked if the two sums are the same and then is the index set
        if (leftSum===rightSum){
            index=i;
            //when the index is found it breaks the loop.
            break;
        }

    }


    return index;
};