function aVeryBigSum(array) {
    var accumulator = 0;
    for (let i = 0; i < array.length; i++) {
        accumulator += array[i];
    }
    return accumulator;
}

function display() {
    const array = [1000000001, 1000000002, 1000000003, 1000000004, 1000000005];
    const result = aVeryBigSum(array);
    console.log("Result-> " + result);
}
display();