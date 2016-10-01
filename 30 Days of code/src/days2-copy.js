var _input = '';
// eslint-disable-next-line no-unused-vars
var input_stdin_array = _input.split('\n');
var count = 0;
/**
 *
 */
function processData() {
}

process.stdin.resume();
process.stdin.setEncoding('ascii');
// var input = '';
process.stdin.on('data', function (input) {
    _input += input;
    count ++;
    if (count == 3) {
        process.stdin.end();
    }

});
process.stdin.on('close', function () {
    input_stdin_array = _input.split('\n');
    processData(_input);
});
