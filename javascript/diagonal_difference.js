function diagonalDifference(array) {
    let mainDiagonal = 0;
    let subDiagonal = 0;
    let lengthOfArray = array.length;
    for (let i = 0; i < lengthOfArray; i++) {
        mainDiagonal += array[i][i];
        subDiagonal += array[i][lengthOfArray - 1 -i];
    }
    let absolute = Math.abs(mainDiagonal - subDiagonal);
    return absolute;
}

function display(){
    var array = [[1,2,3],[4,5,6],[9,8,9]];
    var array1 = [[11, 2, 4],[4,5,6],[10,8,-12]]
    var result = diagonalDifference(array);
    var result1 = diagonalDifference(array1);
    console.log("Result-> " + result);
    console.log("Result-> " + result1);
}
display();