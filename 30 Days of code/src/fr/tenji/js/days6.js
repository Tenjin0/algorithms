/**
 * Created by nekran on 10/10/16.
 */
process.stdin.setEncoding('utf8');
var input_stdin = '';
var input_stdin_array = [];
var count;
var currentLine = 0;

var readLine = function () {
    return input_stdin_array[currentLine++];
};

var main = function() {
    console.warn(input_stdin_array);
    for (var i = 0; i < input_stdin_array.length; i++) {
        var odd = '';
        var even = '';
        for(var j = 0; j < input_stdin_array[currentLine].length; j++) {
            if(j%2 === 0) {
                even += input_stdin_array[currentLine][j];
            } else {
                odd += input_stdin_array[currentLine][j];
            }
        }
        currentLine++;
        console.log(even, odd);
    }
}
process.stdin.on('data', function(data) {
    if (count === undefined) {
        count = parseInt(data.replace('\n', ''));
    } else {
        input_stdin += data;
        count--;
        if (count <= 0) {
            process.stdin.end();
        }
    }
});
process.stdin.on('close', function() {
    input_stdin_array = input_stdin.split('\n');
    input_stdin_array.pop();
    main();
})