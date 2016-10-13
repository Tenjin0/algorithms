/**
 * Created by nekran on 05/10/16.
 */
module.exports = class Person {
    constructor(age) {
        if (age < 0) {
            console.log('Age is not valid, setting age to 0.');
            this.age = 0;
        } else {
            this.age = age;
        }
    }
    printAge() {
        console.log(this.age);
    }
    amIOld() {
        if (this.age < 13) {
            console.log('You are young.');
        } else if(this.age < 18) {
            console.log('You are a teenager.');
        } else {
            console.log('You are old.');
        }
    }
    yearPasses() {
        this.age++;
    }
};
