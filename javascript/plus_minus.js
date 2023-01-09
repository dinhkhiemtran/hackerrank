function plusMinus(array) {
    let pos = 0;
    let neg = 0;
    let zero = 0;
    let lengthOfArray = array.length
    for (let i = 0; i < lengthOfArray; i++) {
        if (array[i] > 0) {
            pos++;
        } else if (array[i] < 0) {
            neg++;
        } else{
            zero++
        }
    }
    console.log((pos/lengthOfArray).toFixed(6));
    console.log((neg/lengthOfArray).toFixed(6));
    console.log((zero/lengthOfArray).toFixed(6));
}

function display(){
    let array1 = [1,1,0,-1,-1];
    let array2 = [-4, 3, -9, 0, 4, 1];
    console.log("Results-> ");
    plusMinus(array1);
    console.log("Results-> ");
    plusMinus(array2);
}
display()
