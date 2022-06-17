//1. create variable
//2. itterate and multiply
//3. return checked condition

var isPowerOfTwo = function(n) {
    var num = 1;

    while(num < n) {
        num *=2;
    }
    return num === n;
};

console.log(isPowerOfTwo(5));