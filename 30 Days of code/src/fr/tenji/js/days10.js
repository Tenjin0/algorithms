/**
 * Created by root on 13/10/16.
 */
process.stdin.resume();
process.stdin.setEncoding('ascii');

var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;
var count = 0;
process.stdin.on('data', function (data) {
    input_stdin += data;
    count++;
    if (count === 1) {
        process.stdin.end();
    }
});

process.stdin.on('close', function () {
    input_stdin_array = input_stdin.split("\n");
    main();
});

function readLine() {
    return input_stdin_array[input_currentline++];
}

/////////////// ignore above this line ////////////////////

function main() {
    var n = parseInt(readLine());
    n =  n.toString(2);
    var maxOneSequence = 0;
    var countOneSequence = 0;
    for(var i = 0; i < n.length; i++) {
        if (n[i] === "1") {
            countOneSequence++;
            if (maxOneSequence < countOneSequence) {
                maxOneSequence = countOneSequence;
            }
        } else {
            countOneSequence = 0;
        }
    }
    console.log(maxOneSequence)
}