/**
 * @param {Object|Array} obj
 * @return {boolean}
 */
var isEmpty = function(obj) {
    return obj == null || Object.keys(obj).length == 0;
};