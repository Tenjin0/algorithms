/**
 * Created by nekran on 11/10/16.
 */
// process.stdin.resume();
process.stdin.setEncoding('ascii');

var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;
var count = 1;
process.stdin.on('data', function (data) {
    input_stdin += data;
    count --;
    if (count <= 0) {
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
    // var n = parseInt(readLine());
    arr = readLine().split(' ');
    console.log(arr);
    arr = arr.map(Number);
    arr = arr.reverse();
    console.log(arr.join(' '));
}