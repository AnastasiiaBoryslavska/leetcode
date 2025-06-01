//1. Check if the length of the string is the same
//2. Create objects for both strings
//3. Itterate through strings and store in object
//4. Create if condition to check if the letter is already in the object 
// and if true increse the value
//5. Itterate through objects and compare 
let s = 'anagram';
let t = 'nagaram';

// var isAnagram = function(s, t) {
//     if(s.length !== t.length) {
//         return false;
//     }
//     let sMap = {};
//     let tMap = {};
//     for(let i = 0; i < s.length; i++) {
//         if(sMap.hasOwnProperty(s[i])) {
//             sMap[s[i]]++
//         } else {
//             sMap[s[i]] = 1;
//         }
//         if(tMap.hasOwnProperty(t[i])) {
//             tMap[t[i]]++
//         } else {
//             tMap[t[i]] = 1;
//         }
//     }
//     for(let k in sMap) {
//         if(sMap[k] !== tMap[k]) {
//             return false;
//         }
//     }
//     return true;

// };

var isAnagram = function(s, t) {
	if(s.length !== t.length) {
  	return false;
  }
  let sMap = {};
  let tMap = {};
  for(i = 0; i < s.length; i++) {
  	if(sMap.hasOwnProperty[s[i]]) {
    	sMap[s[i]]++
    } else {
    	sMap[s[i]] = 1;
    }
    if(tMap.hasOwnProperty[t[i]]) {
    	tMap[t[i]]++
    } else {
    	tMap[t[i]] = 1;
    }
  }
  for( let k in sMap) {
  	if(sMap[k] !== tMap[k]) {
    	return false
    }
  }
  return true;
}

console.log(isAnagram(s,t));