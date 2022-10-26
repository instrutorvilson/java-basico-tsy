/**map retorna um array com as transformações desejadas */
const numbers = [65, 44, 12, 4];
console.log(numbers)

const numbersDoulbe = numbers.map((numero) => numero * 2 )

console.log(numbersDoulbe)
console.log(numbers)

/** filter retorna somente os elementos que atendem um criterio*/
//const pares = numbers.filter((numero)=> numero % 2 == 0 )
const pares = numbers.filter(avaliaNumero)
console.log(pares)

function avaliaNumero(numero){
    return numero % 2 == 0
}

/**Redus um array a um elemento */
const total = numbers.reduce((total, numero) => total = total + numero)
console.log(total)

var acumulado =0
for(let i=0; i<numbers.length;i++){
   acumulado = acumulado + numbers[i]
}
console.log(acumulado)
