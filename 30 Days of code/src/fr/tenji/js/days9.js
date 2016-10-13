/**
 * Created by nekran on 12/10/16.
 */
function processData(input) {
    //Enter your code here
    console.log(factorial(input));
}
function factorial (n) {
    if (n <= 1) {
        return n;
    } else {
        return n * factorial(n - 1);
    }
}
process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
    process.stdin.end();
});

process.stdin.on("close", function () {
    processData(_input);
});
