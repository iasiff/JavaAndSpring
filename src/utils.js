function add (a, b) {
    return a + b;
}

function subs (a, b) {

    if (a < b) {
        return b - a;
    }
    else {
        return a - b;
    }
}
module.exports = { add, subs };