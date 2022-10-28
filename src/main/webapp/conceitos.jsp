<html>
 <head>
   <meta http-equiv="Content-Type"
   content="text/html; charset=UTF-8">
   <style>
       div{
          background-color: red
       }
   </style>

 </head>
<body>
<h2>Ola mundo</h2>

 <h2>Ola mundo</h2>
  <%
      out.write("<div>Oi pessoal</div>");
      out.write("<h1> Oi </h1>");
      String nome = "Ana da Silva";
      String cor = "branca";
      int idade = 17;
      if(idade < 18){
         out.write("<p>Menor de idade</p>");
      }
      out.write("<button onclick=clicar()>Clique aqui</button>");
  %>

  <%
     out.write("Nome: " + nome);

  %>
  <input type="text" value=<%out.write(""+idade); %> />
  <input type="text" value="<%out.write(nome); %> "/>
  <script>
      function clicar(){
        alert('oi');
       }
  </script>


</body>
</html>
