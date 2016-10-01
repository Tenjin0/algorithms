var _input = '';
var input_stdin_array; //eslint-disable no-unused-vars
var count = 0;
/**
 *
 */
function processData() {
    var mealCost = Number(input_stdin_array[0]);
    var tipPercent = Number(input_stdin_array[1]);
    var taxPercent = Number(input_stdin_array[2]);
    var tip = mealCost * tipPercent / 100;
    var tax = mealCost * taxPercent / 100;
    var totalCost = mealCost + tip + tax;
    console.log('The total meal cost is', totalCost.toFixed(0), 'dollars.');
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
