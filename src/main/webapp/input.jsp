<%@ page import="com.aulas.dao.DaoContato" %>
<%@ page import="com.aulas.entidades.Contato" %>


<html>
 <head>
   <meta http-equiv="Content-Type"
   content="text/html; charset=UTF-8">
      </style>
 </head>
<body>
   <table>
     <thead>
      <tr>
        <th>Nome</th>
        <th>Sobrenome</th>
        <th>Idade</th>
      </tr>
     </thead>
     <tbody>
        <% 
           for(Contato ct : DaoContato.contatos){
                out.write("<tr>");
                out.write("<td>"+ct.getNome()+"</td>");
                out.write("<td>"+ct.getSobreNome()+"</td>");
                out.write("<td>"+ct.getIdade()+"</td>");
                out.write("</tr>");
           }
        %>
     </tbody>
   </table>

</body>
</html>