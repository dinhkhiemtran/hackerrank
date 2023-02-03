function isPalindrome(str) {
    return str === str.split("").reverse().join("");
}
const str = "aba";
console.log(isPalindrome(str));