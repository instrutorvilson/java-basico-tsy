const produto = { descricao: 'Milho', preco: 1.89, estoque: 10, unidadeMedida: 'MT'}

//console.log(produto)
//console.log(produto.descricao)

const jsonProduto = JSON.stringify(produto) //objeto -> JSON
 //console.log(jsonProduto)
 //console.log(jsonProduto.descricao)

 const objProduto = JSON.parse(jsonProduto) //JSON -> objeto
 //console.log(objProduto)
 //console.log(objProduto.preco)

 const carrinho = [
    {descricao: 'Milho', preco: 1.89, estoque: 10, unidadeMedida: 'SC'},
    {descricao: 'Trigo', preco: 2.89, estoque: 10, unidadeMedida: 'SC'},
    {descricao: 'Arroz', preco: 3.89, estoque: 15, unidadeMedida: 'SC'}
 ]

 carrinho.forEach(item => { 
   console.log(`${item.descricao} ${(item.preco * item.estoque).toFixed(2)}`)   
 })