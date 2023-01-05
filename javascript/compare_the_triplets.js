function compareTriplets(alice, bob) {
    var countAlice = 0;
    var countBob = 0;
    var results = [];
    for (let i = 0; i < alice.length; i++) {
        if (alice[i] > bob[i]) {
            countAlice++;
        }
        if (alice[i] < bob[i]) {
            countBob;
        }
    }
    results.push(countAlice);
    results.push(countBob);
    return results;
}

function display() {
    var alice = [5, 6, 7];
    var bob = [3, 6, 10];
    var result = compareTriplets(alice, bob);
    console.log("Result-> " + result);
}
display();