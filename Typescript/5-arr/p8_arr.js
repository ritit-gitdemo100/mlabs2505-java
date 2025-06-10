var names = ["Charles", "Abdul", "Bala", "David"];
console.log(names.join("$"));
console.log(names.toString());
names.reverse();
console.log(names);
console.log.apply(console, names);
