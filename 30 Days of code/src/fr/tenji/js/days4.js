/**
 * Created by nekran on 05/10/16.
 */
// process.stdin.resume();
process.stdin.setEncoding('ascii');
var Person = require('./Person.js');
var input_stdin = '';
var input_stdin_array = [];
var count;
var currentLine = 0;

var readLine = function () {
    return input_stdin_array[currentLine++];
};

var main = function() {
    for (var i = 0; i < input_stdin_array.length; i++) {
        var p = new Person(parseInt(readLine()));
        p.amIOld();
        for (var j = 0; j < 3; j++) {
            p.yearPasses();
        }
        p.amIOld();
        console.log('');
    }
};

process.stdin.on('data', function(data){
    if (count === undefined) {
        count = parseInt(data.trim().replace('\n', ''));
    } else {
        input_stdin += data;
    }
    count--;
    if (count < 0) {
        process.stdin.end();
    }
});

process.stdin.on('close', function() {
    input_stdin_array = input_stdin.split('\n');
    input_stdin_array.pop();
    main();
});
