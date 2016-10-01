/**
 * Created by nekran on 15/09/16.
 */
var express = require('express');
var app = express();
var someArray = ['toto'];
if (someArray !== undefined) {
    console.warn(someArray);
}