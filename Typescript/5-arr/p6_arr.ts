var names:string[] = ["Charles","Abdul","Bala","David"]
console.log(...names) //... is a spread operator

//Adds Element at the end
names.push("Raj")
console.log(...names)

names.push("Devi","Priya","Abitha")
console.log(...names)

//Removes Element at the end
names.pop()
console.log(...names)

names.pop()
console.log(...names)

//sorts in Ascending order
names.sort()
console.log(...names)