var countries = ["India", "USA", "Pakistan", "China"];
console.log("Length is ", countries.length);
console.log(countries.join("-"));
countries.push("Nepal", "Bhutan");
console.log(countries.toString());
countries.pop();
countries.forEach(function (value) {
    console.log(value);
});
