function ola(){
    console.log('hello world!')
}

ola()

const x = function (n1, n2){ console.log(n1 + n2)} //função anonima
x(10,20)

function soma(n1,n2){   //função nomeada
    console.log(n1 + n2)
}

soma(40, 30)

function subtracao(n1, n2){
    return n1 - n2
}

const ret = subtracao(100, 60)
console.log(ret)