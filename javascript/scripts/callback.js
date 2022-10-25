function soma(n1, n2, display){
    let resultado = n1 + n2
    display(resultado)
}

function showResultado(valor){
    console.log(`O resultado é: ${valor}`)
}

function showResultado2(valor){
    console.log(`A soma é: ${valor}`)
}

//soma(30, 20, showResultado)
//soma(70, 30, showResultado2)

//função nomeada
function subtrair(n1, n2){
    return n1 - n2
}
console.log(subtrair(10,2))

//função anonima
const vSubtrair = function(n1, n2){
    return n1 - n2
}
console.log(vSubtrair(20,2))
//função arrow
const arrowSubtrair = (n1, n2) =>  n1 - n2
console.log(arrowSubtrair(20,3))
