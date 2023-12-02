const os = require('os');
const path = require('path');
const fs = require('fs');
const http = require('http');
const { log } = require('console');

console.log("hello", "js");

console.log(os.hostname());
console.log(os.platform());
console.log(os.cpus());
console.log(os.networkInterfaces());
console.log(os.tmpdir());
console.log(os.homedir());
console.log(os.type());

let dirname = path.dirname('/home/asif/Documents/');

console.log(dirname);