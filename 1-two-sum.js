//1. create object{} for result 
//2. create 2 loops 
//3. 1 loop: itterate through incoming array
//4. save result in object (key: value)
//5. 2 loop: check the condition of target value

var twoSum = function(nums, target) {
    const numObject = {};
    
    for ( let i = 0; i < nums.length; i++) {
        numObject[nums[i]] = i;
    }
    
    for ( let i = 0; i < nums.length; i++){
        const diff = target - nums[i];
        
        if(numObject[diff] && numObject[diff] !== i) {
            return [i, numObject[diff]];
        }
    }
    return [];
};

//modifications of the exercise:
//1. output to console only keys of the object
//2. output to console only values of the object
//3. output to console keys and values (as an array);
//4. output to console keys and values (as an object);
const numObject = {};

function itterate(nums) {
     for ( let i = 0; i < nums.length; i++) {
         numObject[nums[i]] = i;
     }
}

itterate([2,3,4]);

console.log(Object.keys(numObject));
console.log(Object.values(numObject));
console.log(Object.entries(numObject));
console.log(numObject);


    
        