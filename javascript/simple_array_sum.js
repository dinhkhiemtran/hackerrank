function simpleArraySum(arr) {
    const total = arr.reduce((accumulator, currentValue) => {
        return accumulator + currentValue;
    }, 0)
    return total;
}

function display() {
    const array = [1, 2, 3, 4, 10, 11];
    const result = simpleArraySum(array);
    console.log("Result-> " + result);
}
display();
