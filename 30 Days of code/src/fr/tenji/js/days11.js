var input_stdin_array = ['-1 -1 0 -9 -2 -2' ,
'-2 -1 -6 -8 -2 -5' ,
'-1 -1 -1 -2 -3 -4' ,
'-1 -9 -2 -4 -4 -5' ,
'-7 -3 -3 -2 -9 -9' ,
'-1 -3 -1 -2 -4 -5'];
function readLine() {
    return input_stdin_array[input_currentline++];
}
var input_currentline = 0;
var array2D = [];

for(var arr_i = 0; arr_i < input_stdin_array.length; arr_i++){
    array2D[arr_i] = readLine().split(' ');
    array2D[arr_i] = array2D[arr_i].map(Number);
}
if (array2D.length < 3) this.exit(0);
if (array2D[0].length < 3) this.exit(0);

function getHourglass(i,j) {
    var debug;
    if (i === 0 && j === 0) {
        debug = true;
    }
    var sum = 0;
    // if (debug) console.log( array2D[i]);
    for (let k= 0; k< 3; k++) {
        sum += array2D[i][j + k];
    }
    // if (debug) console.log(sum);
    i++;
    // if (debug) console.log( array2D[i]);
    sum += array2D[i][j + 1];
    i++;
    // if (debug) console.log( array2D[i]);
    for (let k= 0; k< 3; k++) {
        sum += array2D[i][j + k];
    }
    // if (debug) console.log(sum);
    return sum;
}

var max;
for (let i = 0; i < array2D.length - 2; i++) {
    for (let j = 0; j < array2D[i].length-2; j++) {
        var element = getHourglass(i,j);
        if (max === undefined || element >= max) {
            max = element;
        }
    }
}
console.log(max);