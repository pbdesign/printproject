var exec = require('cordova/exec');

exports.print = function(arg0, success, error) {
    exec(success, error, "selphyPrint", "print", [arg0]);
};
