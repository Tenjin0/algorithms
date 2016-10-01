/*
	https://www.hackerrank.com/challenges/30-hello-world
 */
const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
rl.question('Hello, World.\n', (answer) => {
    if (answer === 'test');
    console.log(answer);
    rl.close();
});
