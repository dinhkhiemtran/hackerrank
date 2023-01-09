
function twoSum(numbs, target) {
    let lengthOfNumbs = numbs.length;
    let map = new Map();
    for (let i = 0; i < lengthOfNumbs; i++) {
        if (map.has(numbs[i])) {
            let numberNeeded = map.get(numbs[i]);
            return [numberNeeded, i];
        } else {
            let targetSubtract = target - numbs[i];
            map.set(targetSubtract, i);
        }
    }
    return [];
}

function test1() {
    const array = [2, 7, 11, 15];
    const target = 9;
    console.log(twoSum(array, target));
}

function test2() {
    const array = [3, 2, 4];
    const target = 6;
    console.log(twoSum(array, target));
}

function test3() {
    const array = [3, 3];
    const target = 6;
    console.log(twoSum(array, target));
}

function display() {
    test1();
    test2();
    test3();
}
display();