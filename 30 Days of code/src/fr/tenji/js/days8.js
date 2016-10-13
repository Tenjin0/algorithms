var input_stdin_array = ['3', 'sam 99912222', 'tom 11122222', 'harry 12299933','sam', 'edward', 'harry'];
var count = 0;
function nextLine () {
    if (count < input_stdin_array.length) {
        return input_stdin_array[count++];
    } else {
        return null;
    }
}
function processData() {
    //Enter your code here
    var n = parseInt(nextLine());
    // console.log(input_stdin_array);
    var temp;
    var dictionnary = {};
    for(var i = 0; i < n; i++) {
        temp = nextLine();
        var arr = temp.split(' ');
        dictionnary[arr[0]] = arr[1];
    }
    var indice;
    while((indice = nextLine()) !== null) {
        if (dictionnary[indice] !== undefined) {
            console.log(indice + "=" + dictionnary[indice]);
        } else {
            console.log('Not found');
        }
    }
}

// process.stdin.resume();
// process.stdin.setEncoding("ascii");
// _input = "";
// process.stdin.on("data", function (input) {
//     _input += input;
// });
//
// process.stdin.on("end", function () {
//     input_stdin_array = input_stdin.split('\n');
//     processData(_input);
// });
processData();