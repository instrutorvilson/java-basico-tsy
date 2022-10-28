<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="com.carrinho.entidades.Produto" %>
<%@ page import="com.carrinho.dao.DaoProduto" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="cadastro.jsp" method="POST">
         <label for="descricao">Descrição</label>
         <input type="text" id="descricao" name="descricao" placeholder="Informe descrição do produto" />

         <label for="preco">Preço</label>
         <input type="text" id="preco" name="preco" placeholder="Informe preço do produto" />
         <button>Gravar</button>
    </form>
    <%
       String descricao = request.getParameter("descricao");
       String preco = request.getParameter("preco");
       
       float precof = 0.0f;     

       if(preco != null && !preco.isEmpty()){
         precof = Float.parseFloat(preco);
       }          

       if(descricao != null){
            Produto p = new Produto(descricao, precof);
            DaoProduto.produtos.add(p);
            response.sendRedirect("consulta.jsp");
       }       
    %>
</body>
</html>