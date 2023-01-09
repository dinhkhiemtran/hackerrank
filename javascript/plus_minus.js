function plusMinus(array) {
    var pos = 0;
    var neg = 0;
    var zero = 0;
    var lengthOfArray = array.length
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
    var array1 = [1,1,0,-1,-1];
    var array2 = [-4, 3, -9, 0, 4, 1];
    console.log("Results-> ");
    plusMinus(array1);
    console.log("Results-> ");
    plusMinus(array2);
}
display()
