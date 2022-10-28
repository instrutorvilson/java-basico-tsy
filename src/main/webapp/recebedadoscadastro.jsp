<%@ page import="com.aulas.entidades.Contato" %>
<%@ page import="com.aulas.dao.DaoContato" %>
<%
  String nome = request.getParameter("nome");
  String sobreNome = request.getParameter("sobreNome");
  int idade = Integer.parseInt(request.getParameter("idade"));

  Contato ct = new Contato();
  ct.setNome(nome);
  ct.setSobreNome(sobreNome);
  ct.setIdade(idade);

  out.write("Nome: " + ct.getNome() + " vc é "
  + ct.verificaIdade());
DaoContato.contatos.add(ct);
response.sendRedirect("input.jsp");

%>
