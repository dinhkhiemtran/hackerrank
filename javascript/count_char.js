function countCharacter(str) {
    let map = new Map();
    let max = str[0];
    let array = str.trim().split("");
    for (let i = 0; i < array.length; i++){
        if (map.has(array[i])) {
            map.set(array[i], map.get(array[i]) + 1);
        } else {
            map.set(array[i], 1);
        }
    }
    for (let key of map.keys()){
        if (map.get(key) > map.get(max)){
            max = key;
        }
    }
    return max;
}

const str = "aabbccc";
console.log(countCharacter(str));