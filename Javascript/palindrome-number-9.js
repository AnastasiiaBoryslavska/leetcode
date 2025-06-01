function isPalindrome (x) {
    if (x < 0) return false;
    
    var reverse = 0;
    
    for (i = x; i >= 1; i = Math.floor(i/10)) reverse = reverse*10 + i%10;
    
    return x === reverse;
    
};

console.log(isPalindrome(121));