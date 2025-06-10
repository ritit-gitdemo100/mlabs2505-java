//String in-build functions

var str:string = "Welcome to RIT Infotech"

console.log("length = ",str.length)

console.log("charAt(0) = ",str.charAt(0))
console.log("charAt(3) = ",str.charAt(3))

console.log("indexOf('to') = ",str.indexOf("to"))
console.log("indexOf('come') = ",str.indexOf("come"))

console.log("lastIindexOf('o') = ",str.lastIndexOf("o"))
console.log("lastIndexOf('e') = ",str.lastIndexOf("e"))

console.log("split(' ') = ",str.split(" "))

console.log("toLowerCase() = ",str.toLowerCase())

console.log("toUpperCase() = ",str.toUpperCase())

var str2 = str.concat(" Solutions")
console.log(str2)
