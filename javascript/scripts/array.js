//https://www.w3schools.com/js/js_array_methods.asp
const frutas = ['maça', 'banana']

frutas.push('uva')
console.log(frutas)

frutas.unshift('Limão')
console.log(frutas)

frutas.splice(2,0,'Laranja')
console.log(frutas)

frutas[2] = 'pera'
console.log(frutas)

frutas.push(200)

for(let i=0; i<frutas.length; i++){
    console.log(`Posição: ${i} -> ${frutas[i]}`)
}

