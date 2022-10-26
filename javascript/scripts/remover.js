const nomes = [{nome:'milho'},{nome:'carne'},{nome:'arroz'},{nome:'trigo'}]
//var criterio = 'carne'

const posicao = nomes.findIndex((item) => comparaNome(item,'trigo'))
//const posicao = nomes.findIndex((item) => item.nome == criterio)
//console.log(posicao)

function comparaNome(item, criterio){
   console.log(criterio)
   return item.nome === criterio
}

console.log(nomes)
const x =nomes.splice(posicao,1)
console.log(nomes)
console.log(x)